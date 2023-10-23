package recipe;

import ingredient.Grinding;

public class Americano extends Espresso {
    int moreWater;

    public Americano(int grammOfCoffee, int water, Grinding grinding, int moreWater) {
        super(grammOfCoffee, water, grinding);
        this.moreWater = moreWater;
    }

    public String toString() {
        return grammOfCoffee + " грамм кофе - "
                + water + " мл. воды - "
                + moreWater + " мл. дополнительной воды - "
                + grinding.getTitle(grinding) + " помол";
    }
}
