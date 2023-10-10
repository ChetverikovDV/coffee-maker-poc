package recipe;

public class Espresso {
    int coffee;
    int water;

    public Espresso(int coffee, int water) {
        this.coffee = coffee;
        this.water = water;
    }

    public String toString() {
        return "Espresso is a "
                + coffee + " gr of wonderful coffee and the "
                + water + " ml of spring water";

    }
}


