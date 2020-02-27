//
//import keyValueStore.*;
//import io.grpc.stub.StreamObserver;
//
//
//
///**
// * Our gRPC service is defined using protocol buffers.
// * Please find out how to define the service in the .proto file in the resources folder.
// */
//
//
//
//
////public class KeyValStoreImpl extends KeyValStore
//
//
//public class UserServiceImpl extends UserGrpc.UserImplBase {
//
//
//
//    @Override
//    public void login(KeyValueStore.LoginRequest request, StreamObserver<KeyValueStore.APIResponse> responseObserver) {
//        System.out.println("Inside login");
//        String username = request.getUsername();
//        String password = request.getPassword();
//
//        KeyValueStore.APIResponse.Builder response = KeyValueStore.APIResponse.newBuilder();
//
//        if (username.equals(password)){
//            // return success message
//            response.setResponseCode(0).setResponsemessage("Success");
//
//        }else{
//            // return failure message
//            response.setResponseCode(100).setResponsemessage("Invalid password");
//        }
//
//        responseObserver.onNext(response.build());
//        responseObserver.onCompleted();
//    }
//
//    @Override
//    public void logout(KeyValueStore.Empty request, StreamObserver<KeyValueStore.APIResponse> responseObserver) {
//    }
//
//
//}
//
//
//
