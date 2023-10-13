package recipe;

import Ingredient.Grinding;

public class Americano extends Espresso {
    int moreWater;

    public Americano(int coffee, int water, Grinding grinding, int moreWater) {
        super(coffee, water, grinding);
        this.moreWater = moreWater;
    }

    public String toString() {
        return coffee + " gr of coffee and "
                + water + " ml of water and "
                + moreWater + " ml WATER "
                + grinding + " помола";
    }
}
