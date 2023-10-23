package ingredient;

public enum Grinding {
    FINE ("Мелкий"),
    MEDIUM("Средний"),
    COURSE("Грубый");

    private final String title;

    Grinding(String title) {
        this.title = title;
    }

    public String getTitle(Grinding grinding) {
        return title;
    }

}
