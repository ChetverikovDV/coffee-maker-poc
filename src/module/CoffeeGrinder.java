package module;

import ingredient.Grinding;
import hardware.CurrentRecipe;

public class CoffeeGrinder {

    Grinding grinding;
    private CurrentRecipe coffee;

    public void grind(CurrentRecipe coffee) {
        this.coffee = coffee;

        System.out.println(
                "Кофемолка смолола "
                        + coffee.getGrammOfCoffee()
                        + " грамм кофе - "
                        + coffee.getGrinding().getTitle(grinding) + " помол ")
        ;

    }
}

