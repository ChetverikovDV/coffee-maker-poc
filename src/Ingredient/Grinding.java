package Ingredient;

public enum Grinding {
    FINE ("FINE"),
    MEDIUM("MEDIUM"),
    COURSE("COURSE");

    private final String title;

    Grinding(String title) {
        this.title = title;
    }

    public String getTitle(Grinding grinding) {
        return title;
    }

}
