package recipe;

import Ingredient.Grinding;
import coffee.Recipe;

public class Espresso extends Recipe {
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
        return coffee + " грамм кофе - "
                + water + " воды - "
                + grinding.getTitle(grinding) + " помол";
    }

}


