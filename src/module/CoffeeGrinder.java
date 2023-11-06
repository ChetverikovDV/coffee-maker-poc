package module;

import ingredient.Grinding;
import hardware.CurrentRecipe;
import interfaces.Checkble;

public class CoffeeGrinder implements Checkble {

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
    public int check() {
        System.out.println(powerConsumption+ " Ватт - Гриндер");
        return powerConsumption;
    }
    public int getPowerConsumption(){
        return powerConsumption;
    }
}

