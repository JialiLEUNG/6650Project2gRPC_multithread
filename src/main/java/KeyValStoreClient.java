import com.google.protobuf.ByteString;
import io.grpc.*;
import keyValueStore.*;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;

public final class KeyValStoreClient {

    public static void main(String[] args){
        // 1. ManagedChannelBuilder
        // 2. Use Plaintext
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 9090).usePlaintext(true).build();
        System.out.println(System.getProperty("user.dir"));


        try {
            KeyValStoreGrpc.KeyValStoreBlockingStub clientStub = KeyValStoreGrpc.newBlockingStub(channel);

            Scanner clientScanner = new Scanner(new File("./src/main/java/ClientRequestTCP.txt"));

            while(clientScanner.hasNext()){
                String[] requestArr = clientScanner.nextLine().trim().split(" ");

                String msg;
                if (requestArr.length < 2){
                    msg = "Error: Malformed Request from [consumer ]." +
                            " Syntax: <operation> <key> OR <operation> <key> <value>. For example: get apple";
                    System.out.println(msg);

                } else{
                    String action = requestArr[0].toLowerCase();
                    ByteString key = ByteString.copyFromUtf8(requestArr[1]);
                    switch(action){
                        case "get":
                            doGet(clientStub, key);
                            break;
                        case "delete":
                            doDelete(clientStub, key);
                            break;
                        case "put":
                            if (requestArr.length == 3){
                                doPut(clientStub, key, ByteString.copyFromUtf8(requestArr[2]));
                            }
                            break;
                        default:
                            System.err.println("error: malformed request or unknown operation at time " + System.currentTimeMillis());
                            break;
                    }
                }
            }
        } catch(FileNotFoundException e){
            System.err.println(e.getMessage());
        }
    }



    // subs -- generated from proto file

    private static void doPut(KeyValStoreGrpc.KeyValStoreBlockingStub stub, ByteString key, ByteString value){
        KeyValueStore.PutResponse res = stub.put(
                    KeyValueStore.PutRequest.newBuilder().setKey(key).setValue(value).build());
        System.out.println(res.getMsg());
//        try{
//            KeyValueStore.PutResponse res = stub.put(
//                    KeyValueStore.PutRequest.newBuilder().setKey(key).setValue(value).build());
//            if(!res.equals(KeyValueStore.PutResponse.getDefaultInstance())){
//                throw new RuntimeException("Invalid response.");
//            }
//            // return success message
////            res.set setResponseCode(0).setResponsemessage("Success");
//        } catch (StatusRuntimeException e){
//            System.err.println(e.getMessage());
//        }
    }

    private static void doGet(KeyValStoreGrpc.KeyValStoreBlockingStub stub, ByteString key){

        try{
            KeyValueStore.GetResponse res = stub.get(
                    KeyValueStore.GetRequest.newBuilder().setKey(key).build());
            System.out.println(res.getMsg().toStringUtf8());

            String val = res.getValue().toStringUtf8();
            if (!val.equals("NULL")){
                System.out.println("Result of get " + key.toStringUtf8() + ": " + val);
            }
        } catch (StatusRuntimeException e) {
            e.printStackTrace();
        }

//        try{
//            KeyValueStore.GetResponse res = stub.get(KeyValueStore.GetRequest.newBuilder().setKey(key).build());

//            if(res.getValue().size() < 1){
//                throw new RuntimeException("Invalid response");
//            }
//        } catch(StatusRuntimeException e){
//            System.err.println("Key not found. " + e.getMessage());
//        }
    }

    private static void doDelete(KeyValStoreGrpc.KeyValStoreBlockingStub stub, ByteString key){
        try{
            KeyValueStore.DeleteResponse res = stub.delete(
                    KeyValueStore.DeleteRequest.newBuilder().setKey(key).build());



        } catch (StatusRuntimeException e) {
            e.printStackTrace();
        }

//        try{
//            KeyValueStore.DeleteResponse res = stub.delete(KeyValueStore.DeleteRequest.newBuilder().setKey(key).build());
//            if(!res.equals(KeyValueStore.DeleteResponse.getDefaultInstance())){
//                throw new RuntimeException("Invalid response");
//            }
//        } catch(StatusRuntimeException e){
//            System.err.println("Key not found. " + e.getMessage());
//        }
    }
}
