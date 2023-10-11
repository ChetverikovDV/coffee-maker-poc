package recipe;

public class Americano extends Espresso {
    int moreWater;

    public Americano(int coffee, int water, int moreWater) {
        super(coffee, water);
        this.moreWater = moreWater;
    }

    public String toString() {
        return coffee + " gr of coffee and "
                + water + " ml of water and "
                + moreWater + " ml WATER";
    }
}
