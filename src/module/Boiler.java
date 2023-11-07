package module;

import hardware.CurrentRecipe;
import interfaces.Checkble;

public class Boiler implements Checkble {

    int powerConsumption = 2000; //Энергопотребление

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

    public void check() {
        System.out.println(powerConsumption + " Ватт - Бойлер");
    }

    public int getPowerConsumption() {
        return powerConsumption;
    }

    public boolean ready() {
        return true;
    }
}

