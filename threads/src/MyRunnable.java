public class MyRunnable implements Runnable {
    @Override
    public void run() {
        for(int i = 0;i < 7;i++) {
            System.out.println("Process #" + i);
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
