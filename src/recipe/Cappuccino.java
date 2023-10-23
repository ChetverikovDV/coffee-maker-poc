package recipe;

import ingredient.Grinding;

public class Cappuccino extends Espresso {
    int foam;

    public Cappuccino(int grammOfCoffee, int water, Grinding grinding, int foam) {
        super(grammOfCoffee, water, grinding);
        this.foam = foam;
    }

    public String toString() {
        return grammOfCoffee + " грамм кофе - "
                + water + " мл. воды - "
                + foam + " молочной пены  - "
                + grinding.getTitle(grinding) + " помол";
    }
}
