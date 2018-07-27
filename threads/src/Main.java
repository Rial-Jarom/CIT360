public class Main {
    public static void main(String[] args) {
        MyThread myThreadA = new MyThread();
        myThreadA.start();
        MyThread myThreadB = new MyThread();
        myThreadB.start();
        MyThread myThreadC = new MyThread();
        myThreadC.start();
    }
}
