package recipe;

import Ingredient.Grinding;

public class Cappuccino extends Espresso {
    int foam;

    public Cappuccino(int coffee, int water, Grinding grinding, int foam) {
        super(coffee, water, grinding);
        this.foam = foam;
    }

    public String toString() {
        return coffee + " грамм кофе - "
                + water + " мл. воды - "
                + foam + " молочной пены  - "
                + grinding.getTitle(grinding) + " помол";
    }
}
