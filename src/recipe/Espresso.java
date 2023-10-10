package recipe;

import coffee.Coffee;

public class Espresso extends Coffee {
    int coffee;
    int water;

    public Espresso(int coffee, int water) {
        this.coffee = coffee;
        this.water = water;
    }

    public String toString() {
        return  coffee + " gr of coffee and "
                + water + " ml of water";
    }

}


