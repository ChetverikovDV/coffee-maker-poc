package module;

import hardware.CurrentRecipe;

public class Boiler {

    public void boil(CurrentRecipe coffee) {
        System.out.println(
                "Чайник направил в 'голову' "
                        + coffee.getWater() + " мл. воды");

    }
}

