package Ingredient;

public enum CoffeePowderGramm {
    Regular(5),
    Double(10);
    private int value;

    CoffeePowderGramm(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
