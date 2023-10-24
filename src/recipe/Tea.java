package recipe;

import hardware.CurrentRecipe;

public class Tea extends CurrentRecipe {
    int simpleBoiledWater;

    public Tea(int simpleBoiledWater) {
        this.simpleBoiledWater = simpleBoiledWater;
    }

    public int getSimpleBoiledWater() {
        return simpleBoiledWater;
    }

    public String toString() {
        return simpleBoiledWater + " мл. кипятка";
    }

}


