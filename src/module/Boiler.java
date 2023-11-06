package module;

import hardware.CurrentRecipe;
import interfaces.Checkble;
import interfaces.Ready;

public class Boiler implements Checkble, Ready {

    int powerConsumption = 2000; //Энергопотребление
    boolean status = false;       //Готовность

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

    public int check() {
        System.out.print(powerConsumption + " Ватт - Бойлер - ");
        return powerConsumption;
    }

    public int getPowerConsumption() {
        return powerConsumption;
    }

    public boolean ready() {
        if (status)
            System.out.println("Готов");
        else
            System.out.println("Не готов");
        return status;
    }
}

