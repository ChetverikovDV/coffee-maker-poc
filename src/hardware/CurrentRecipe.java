package hardware;

import ingredient.Grinding;

public class CurrentRecipe {
    private Grinding grinding;
    private int grammOfCoffee;
    private int water;
    private int simpleBoiledWater;
    private int milkFoam;

    public Grinding getGrinding() {

        return grinding;
    }

    public int getGrammOfCoffee() {
        return grammOfCoffee;
    }

    public int getWater() {
        return water;
    }

    public int getSimpleBoiledWater() {
        return simpleBoiledWater;
    }

    public int getMilkFoam() {
        return milkFoam;
    }

}
