package module;

import hardware.CurrentRecipe;
import interfaces.Checkble;

public class Boiler implements Checkble {
    int powerConsumption = 2000;

    public void boil(CurrentRecipe coffee) {
        System.out.println(
                "Чайник направил в 'смеситель' "
                        + coffee.getWater() + " мл. кипятка");
    }

    public void flood(CurrentRecipe coffee) {
        System.out.println(
                "Чайник направил в 'смеситель' "
                        + coffee.getSimpleBoiledWater() + " мл. кипятка");
    }

    public int check(){
        System.out.println(powerConsumption+" Ватт - Бойлер");
        return powerConsumption;
    }

    public int getPowerConsumption() {
        return powerConsumption;
    }
}

