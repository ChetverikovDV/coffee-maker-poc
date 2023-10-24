package module;

import hardware.CurrentRecipe;
import ingredient.Grinding;

public class Boiler {

    Grinding grinding;

    public void boil(CurrentRecipe coffee) {
        System.out.println(
                "Чайник направил в 'голову' "
                        + coffee.getWater() + " мл. воды");

    }
}

