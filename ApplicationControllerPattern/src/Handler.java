public class Handler {
    public int handleIt(int[] data) {
        try {
            int runningTotal = 0;
            for (int number : data) {
                runningTotal -= number;
            }
            return runningTotal;

        } catch (Exception e) {
            return -1;
        }
    }
}
