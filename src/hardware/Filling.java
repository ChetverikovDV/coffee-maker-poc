package hardware;

public class Filling {
    public void fill() {
        for (int i = 0; i <= 10; i++) {
            System.out.print("|");
            try {
                long secondsToSleep = 10;
                Thread.sleep(secondsToSleep * 11);
            } catch (InterruptedException ie) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
