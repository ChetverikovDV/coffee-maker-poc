package recipe;

import Ingredient.Grinding;

public class Americano extends Espresso {
    int moreWater;

    public Americano(int coffee, int water, Grinding grinding, int moreWater) {
        super(coffee, water, grinding);
        this.moreWater = moreWater;
    }

    public String toString() {
        return coffee + " грамм кофе - "
                + water + " мл. воды - "
                + moreWater + " мл. дополнительной воды - "
                + grinding.getTitle(grinding) + " помол";
    }
}
