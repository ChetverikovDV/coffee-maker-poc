package visual;

public class Visual {

    public void delay(long secondsToSleep) {                     //Задержка

        try {
            Thread.sleep(secondsToSleep * 50);
        } catch (InterruptedException ie) {
            Thread.currentThread().interrupt();
        }
    }

    public void fill(long fillingTimeSeconds) {                  //типа прогресс бар, но нет
        for (int i = 0; i <= 30; i++) {
            System.out.print("|");
            try {
                Thread.sleep(fillingTimeSeconds * 5);
            } catch (InterruptedException ie) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public void ShowDisplay() {
        Visual visual = new Visual();                             // ну это понятно
        System.out.println(" ______________________________________"); visual.delay(10);
        System.out.println("| ВАС ПРИВЕТСТВУЕТ УПОРОТАЯ КОФЕМАШИНА |"); visual.delay(10);
        System.out.println("| Я пока умею варить только эспрессо,  | "); visual.delay(10);
        System.out.println("| но быстро учусь. Возможно. Не точно. |"); visual.delay(10);
        System.out.println(" --------------------------------------"); visual.delay(10);

    }
}
