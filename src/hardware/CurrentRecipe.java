package hardware;

import ingredient.Grinding;

public class CurrentRecipe {
    Grinding grinding;
    int coffee;
    int water;
    int simpleBoiledWater;

    public Grinding getGrinding() {
        return grinding;
    }

    public int getCoffee() {
        return coffee;
    }

    public int getWater(){return water;}

    public int getSimpleBoiledWater(){return simpleBoiledWater;}

}
