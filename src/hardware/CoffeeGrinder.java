package hardware;

import Ingredient.Grinding;

//import hardware.Recipe;
public class CoffeeGrinder {

    Grinding grinding;

    public void grind(Recipe coffee) {
        System.out.print(
                "Кофемолка молет для " + coffee.getClass().getSimpleName() +
                        " " + coffee.getCoffee() + " грамм кофе - "
                        + coffee.getGrinding().getTitle(grinding) + " помол ")
        ;

    }
}

