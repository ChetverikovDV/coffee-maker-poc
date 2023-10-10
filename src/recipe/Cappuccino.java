package recipe;

public class Cappuccino extends Espresso{
    int foam;
    public Cappuccino(int coffee, int water, int foam) {
        super(coffee, water);
        this.foam = foam;
    }
    public String toString() {
        return  coffee + " gr of coffee and "
                + water + " ml of water and "
                + foam + " ml of MILK FOAM";
    }
}
