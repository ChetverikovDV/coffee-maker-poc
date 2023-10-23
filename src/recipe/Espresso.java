package recipe;

import hardware.CurrentRecipe;
import ingredient.Grinding;

public class Espresso extends CurrentRecipe {
    int grammOfCoffee;
    int water;
    Grinding grinding;

    public Espresso(int grammOfCoffee, int water, Grinding grinding) {
        this.grammOfCoffee = grammOfCoffee;
        this.water = water;
        this.grinding = grinding;
    }

    public Grinding getGrinding() {
        return grinding;
    }

    public int getCoffee() {
        return grammOfCoffee;
    }

    public String toString() {
        return grammOfCoffee + " грамм кофе - "
                + water + " воды - "
                + grinding.getTitle(grinding) + " помол";
    }

}


