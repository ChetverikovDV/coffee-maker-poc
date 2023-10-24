package visual;

public class Delay {

    public void delay(long secondsToSleep) {

        try {
            Thread.sleep(secondsToSleep * 50);
        } catch (InterruptedException ie) {
            Thread.currentThread().interrupt();
        }
    }
}

