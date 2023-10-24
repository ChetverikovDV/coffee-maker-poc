package visual;

public class Filling {
    public void fill() {
        for (int i = 0; i <= 18; i++) {
            System.out.print("|");
            try {
                long secondsToSleep = 10;
                Thread.sleep(secondsToSleep * 10);
            } catch (InterruptedException ie) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
