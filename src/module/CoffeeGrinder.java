package module;

import ingredient.Grinding;
import hardware.CurrentRecipe;

public class CoffeeGrinder {

    Grinding grinding;

    public void grind(CurrentRecipe coffee) {
        System.out.println(
                "Кофемолка смолола "
                        + coffee.getCoffee()
                        + " грамм кофе - "
                        + coffee.getGrinding().getTitle(grinding) + " помол ")
        ;

    }
}

