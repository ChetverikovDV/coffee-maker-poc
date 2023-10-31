package recipe;

import ingredient.Grinding;
/*import hardware.CurrentRecipe;

public class Cappuccino extends CurrentRecipe {
    int milkFoam;
    int grammOfCoffee;
    int water;
    Grinding grinding;

    public Cappuccino(int grammOfCoffee, int water, Grinding grinding, int milkFoam) {
        this.grammOfCoffee = grammOfCoffee;
        this.water = water;
        this.grinding = grinding;
        this.milkFoam = milkFoam;

    }

    public int getMilkFoam() {
        return milkFoam;
    }

    public String toString() {
        return grammOfCoffee + " грамм кофе - "
                + water + " мл. воды - "
                + milkFoam + " мл. молочной пены  - "
                + grinding.getTitle(grinding) + " помол";
    }

*/
    public class Cappuccino extends Espresso {
        int milkFoam;

        public Cappuccino(int grammOfCoffee, int water, Grinding grinding, int milkFoam) {
            super(grammOfCoffee, water, grinding);
            this.milkFoam = milkFoam;
        }
        public int getMilkFoam(){return milkFoam;}

        public String toString() {
            return grammOfCoffee + " грамм кофе - "
                    + water + " мл. воды - "
                    + milkFoam + " мл. молочной пены - "
                    + grinding.getTitle(grinding) + " помол";
        }
    }

