package module;

import ingredient.Grinding;
import hardware.CurrentRecipe;
import interfaces.Power;

public class CoffeeGrinder implements Power {

    Grinding grinding;
    int powerConsumption = 800;

    public void grind(CurrentRecipe coffee) {
        System.out.println(
                "Кофемолка смолола "
                        + coffee.getGrammOfCoffee()
                        + " грамм кофе - "
                        + coffee.getGrinding().getTitle(grinding) + " помол ")
        ;

    }

    @Override
    public int getPower() {
        System.out.println(powerConsumption+ " Ватт - Гриндер");
        return powerConsumption;
    }
}

