import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class KeyValStoreThreadPool {

    public static void main(String[] args){
        ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(4);

        for (int i = 0; i < 4; i++){
            KeyValStoreClient client = new KeyValStoreClient("Client " + i);
            System.out.println("===== Created: " + client.getName());
            executor.execute(client);
        }
        executor.shutdown();
    }
}
