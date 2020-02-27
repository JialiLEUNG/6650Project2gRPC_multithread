/**
 * On the server side, the server implements the methods declared by the service
 * and runs a gRPC server the handle client calls.
 * The gRPC infrastructure decodes incoming requests, executes service methods,
 * and decodes service response.
 */



import io.grpc.Server;
import io.grpc.ServerBuilder;
import java.io.IOException;

public class KeyValStoreServer {
    public static void main(String[] args) throws IOException, InterruptedException {
//         1. ServerBuilder
        Server server = ServerBuilder.
                forPort(9090).addService(new KeyValStoreImpl()).build();
        server.start();

        System.out.println("Server started at " + server.getPort());
        // 2. wait for termination (which blocks my main process from quitting)
        server.awaitTermination();
    }
}
