package coffee;

import Ingredient.Grinding;

public class CoffeeGrinder {

    Grinding grinding;

    public void grind(Recipe coffee) {
        System.out.println(
                "Кофемолка смолола для " + coffee.getClass().getSimpleName() +
                " " + coffee.getCoffee() + " грамм кофе - "
                + coffee.getGrinding().getTitle(grinding) + " помол");

    }
}

