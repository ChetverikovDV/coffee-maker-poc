package Module;

import Ingredient.Grinding;

public class CoffeeGrinder {
    Grinding grinding;
    int beans;
    int storage;
    double powder;

    public CoffeeGrinder(Grinding grinding, int beans){
        this.grinding = grinding;
        this.beans = beans;
        this.storage = getStorage();
    }

    public int getStorage() {
        return storage;
    }

}

