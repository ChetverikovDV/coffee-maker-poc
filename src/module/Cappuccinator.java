package module;

import hardware.CurrentRecipe;
import interfaces.Power;

public class Cappuccinator implements Power {
    int powerConsumption = 300;

    public void makeMilkFoam(CurrentRecipe coffee) {
        System.out.println(
                "Капучинатор направил в 'смеситель' "
                        + coffee.getMilkFoam() + " мл. пены");
    }

    @Override
    public int getPower() {
        System.out.println(powerConsumption+" Ватт - Капучинатор");
        return powerConsumption;
    }
}
