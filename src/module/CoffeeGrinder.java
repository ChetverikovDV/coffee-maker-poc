package module;

import ingredient.Grinding;
import hardware.CurrentRecipe;
import interfaces.Checkble;

public class CoffeeGrinder implements Checkble {

    private Grinding grinding;
    private final int powerConsumption = 800;

    public void grind(CurrentRecipe coffee) {
        System.out.println(
                "Кофемолка смолола "
                        + coffee.getGrammOfCoffee()
                        + " грамм кофе - "
                        + coffee.getGrinding().getTitle(grinding) + " помол ")
        ;

    }

    @Override
    public void check() {
        System.out.println(powerConsumption+ " Ватт - Гриндер");
    }

    public int getPowerConsumption() {
        return powerConsumption;
    }

    @Override
    public boolean ready() {
        return true;
    }
}

