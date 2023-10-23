package module;

import ingredient.Grinding;
import hardware.CurrentRecipe;

public class CoffeeGrinder {

    Grinding grinding;

    public void grind(CurrentRecipe coffee) {
        System.out.println(
                "Кофемолка молет для " + coffee.getClass().getSimpleName() +
                        " " + coffee.getCoffee() + " грамм кофе - "
                        + coffee.getGrinding().getTitle(grinding) + " помол ")
        ;

    }
}

