package module;

import hardware.CurrentRecipe;

public class Cappuccinator {

    public void makeMilkFoam(CurrentRecipe coffee) {
        System.out.println(
                "Капучинатор направил в 'смеситель' "
                        + coffee.getMilkFoam() + " мл. пены");
    }
}
