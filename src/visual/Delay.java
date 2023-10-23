package visual;

public class Delay {
    public void delay() {
        try {
            long secondsToSleep = 10;
            Thread.sleep(secondsToSleep * 100);
        } catch (InterruptedException ie) {
            Thread.currentThread().interrupt();
        }
    }
}

