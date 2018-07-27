public class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0;i < 5;i++) {
            System.out.println("[Thread: " + Thread.currentThread().getName() + " ID: " + Thread.currentThread().getId() + " value: " + i + "]");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
