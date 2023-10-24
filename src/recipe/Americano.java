package recipe;

import ingredient.Grinding;

public class Americano extends Espresso {
    int simpleBoiledWater;

    public Americano(int grammOfCoffee, int water, Grinding grinding, int simpleBoiledWater) {
        super(grammOfCoffee, water, grinding);
        this.simpleBoiledWater = simpleBoiledWater;
    }
    public int getSimpleBoiledWater(){return simpleBoiledWater;}

    public String toString() {
        return grammOfCoffee + " грамм кофе - "
                + water + " мл. воды - "
                + simpleBoiledWater + " мл. дополнительной воды - "
                + grinding.getTitle(grinding) + " помол";
    }
}
