package recipe;

import Ingredient.Grinding;

public class Cappuccino extends Espresso {
    int foam;

    public Cappuccino(int coffee, int water, Grinding grinding, int foam) {
        super(coffee, water, grinding);
        this.foam = foam;
    }

    public String toString() {
        return coffee + " gr of coffee and "
                + water + " ml of water and "
                + foam + " ml of MILK FOAM "
                + grinding + " grinding";
    }
}
