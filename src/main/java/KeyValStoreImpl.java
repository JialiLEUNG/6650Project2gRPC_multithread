/**
 * The KeyValStoreImpl is an implementation of the key value service.
 * It is installed by the gRPC server to handle client requests.
 * In order to simulate storing the keys and values on disk,
 * I add short sleeps (see methods pauseThread() while handling the request.
 * Reads and writes will experience a random 50 to 100 milliseconds delay to
 * make the sample run more like a persistent database.
 *
 * Specifically, the KeyValStoreImpl includes a key-value store,
 * and implements thread-safe methods for getting, putting, and deleting values.
 *
 * I used ConcurrentHashMap because I need very high concurrency in the current project.
 * It is thread-safe without synchronizing the whole map.
 * Reads can happen very fast while write is done with a lock.
 * There is no locking at the object level.
 * The locking is at a much finer granularity at a hashmap bucket level.
 */

import com.google.protobuf.ByteString;
import keyValueStore.*;
import io.grpc.stub.StreamObserver;
import java.nio.ByteBuffer;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

public class KeyValStoreImpl extends KeyValStoreGrpc.KeyValStoreImplBase{

    /* Server information */
    private static final ConcurrentHashMap<ByteBuffer, ByteBuffer> store = new ConcurrentHashMap<>();

    /**
     *
     * @param request
     * @param responseObserver
     */
    @Override
    public void put(KeyValueStore.PutRequest request, StreamObserver<KeyValueStore.PutResponse> responseObserver) {
        ByteBuffer key = request.getKey().asReadOnlyByteBuffer();
        ByteBuffer value = request.getValue().asReadOnlyByteBuffer();
        pauseThread();

        KeyValueStore.PutResponse.Builder response = KeyValueStore.PutResponse.newBuilder();

        ByteBuffer val = store.putIfAbsent(key, value);
        String msg;

        if(val == null){
            msg = "+++++ Succeed: PUT request succeeds at Time: " + System.currentTimeMillis();

        } else{
            msg = "----- Error: Key already exists. PUT request fails at Time: " + System.currentTimeMillis();
        }
        response.setMsg(ByteString.copyFromUtf8(msg));
        responseObserver.onNext(response.build());
        responseObserver.onCompleted();
        return;
    }
//        responseObserver.onError(Status.ALREADY_EXISTS.asRuntimeException());


    @Override
    public void get(KeyValueStore.GetRequest request, StreamObserver<KeyValueStore.GetResponse> responseObserver) {
        ByteBuffer key = request.getKey().asReadOnlyByteBuffer();
        pauseThread();
        ByteBuffer value = store.get(key);
        KeyValueStore.GetResponse.Builder response = KeyValueStore.GetResponse.newBuilder();
        String msg;
        if (value != null){
            // we get as many value objects as we need to return to the client
            // (in this case, we select them from the service’s value collection
            // based on whether they’re inside our request getRequest),
            // and write them each in turn to the response observer using its onNext() method.

            msg = "+++++ Succeed: GET request at Time: " + System.currentTimeMillis();
            response.setValue(ByteString.copyFrom(value.slice())).setMsg(ByteString.copyFromUtf8(msg));

        } else{
            msg = "----- Error: Key does not exist. GET request fail at Time: " + System.currentTimeMillis(); //+ "\n" +
//                  "[key " + key + "] not found.";
            response.setValue(ByteString.copyFromUtf8("NULL")).setMsg(ByteString.copyFromUtf8(msg));
        }
        responseObserver.onNext(response.build());
        // onCompleted() method to tell gRPC that we’ve finished writing responses.
        responseObserver.onCompleted();
        return;
//        responseObserver.onError(Status.NOT_FOUND.asRuntimeException());
        }



    @Override
    public void delete(KeyValueStore.DeleteRequest request, StreamObserver<KeyValueStore.DeleteResponse> responseObserver) {
        ByteBuffer key = request.getKey().asReadOnlyByteBuffer();
        pauseThread();
        String msg;
        KeyValueStore.DeleteResponse.Builder response = KeyValueStore.DeleteResponse.newBuilder();
        if (store.remove(key) != null){
            msg = "+++++ Succeed: DELETE request at Time: " + System.currentTimeMillis();

        } else{
            msg = "----- Error: Key does not exist. DELETE request fail at Time: " + System.currentTimeMillis();

        }
        response.setMsg(ByteString.copyFromUtf8(msg));
        responseObserver.onNext(response.build());
        responseObserver.onCompleted();
        return;
    }

    private static void pauseThread(){
        try{
            TimeUnit.MILLISECONDS.sleep(ThreadLocalRandom.current().nextInt(50, 100));
        } catch(InterruptedException e){
            Thread.currentThread().interrupt();
            System.err.println(e.getMessage());
            throw new RuntimeException();
        }
    }
}
