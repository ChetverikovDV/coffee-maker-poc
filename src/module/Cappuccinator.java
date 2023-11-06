package module;

import hardware.CurrentRecipe;
import interfaces.Checkble;

public class Cappuccinator implements Checkble {
    int powerConsumption = 300;

    public void makeMilkFoam(CurrentRecipe coffee) {
        System.out.println(
                "Капучинатор направил в 'смеситель' "
                        + coffee.getMilkFoam() + " мл. пены");
    }

    @Override
    public int check() {
        System.out.println(powerConsumption+" Ватт - Капучинатор");
        return powerConsumption;
    }

    public int getPowerConsumption() {
        return powerConsumption;
    }
}
