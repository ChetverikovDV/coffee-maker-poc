package recipe;

import Ingredient.Grinding;
import coffee.Coffee;

public class Espresso extends Coffee {
    int coffee;
    int water;
    Grinding grinding;

    public Espresso(int coffee, int water, Grinding grinding) {
        this.coffee = coffee;
        this.water = water;
        this.grinding = grinding;
    }

    public Grinding getGrinding() {
        return grinding;
    }

    public int getCoffee() {
        return coffee;
    }

    public String toString() {
        return coffee + " gr of coffee and "
                + water + " ml of water "
                + grinding + " grinding";
    }

}


