import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MyExecutor {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService eService = Executors.newFixedThreadPool(5);
        eService.execute(new Runnable() {
            @Override
            public void run() {
                try {
                    System.out.println("Get my letter from Hogwarts");
                    Thread.sleep(1000);
                    System.out.println("Go to Diagon Alley");
                    Thread.sleep(700);
                    System.out.println("Ride the Hogwarts Express");
                } catch (InterruptedException ie) {
                    ie.printStackTrace();
                }
            }
        });
    }
}
