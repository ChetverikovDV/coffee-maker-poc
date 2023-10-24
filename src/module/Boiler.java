package module;

import hardware.CurrentRecipe;

public class Boiler {

    public void boil(CurrentRecipe coffee) {
        System.out.println(
                "Чайник направил в 'смеситель' "
                        + coffee.getWater() + " мл. кипятка");
    }
    public void flood(CurrentRecipe coffee){
        System.out.println(
                "Чайник направил в 'смеситель' "
                + coffee.getSimpleBoiledWater() + " мл. кипятка");
    }
}

