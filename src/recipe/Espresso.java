package recipe;

import Ingredient.CoffeePowderGramm;

import static Ingredient.CoffeePowderGramm.*;

public class Espresso {
    public CoffeePowderGramm addEspresso(CoffeePowderGramm coffeePowderGramm) {

        System.out.println("Your " + String.valueOf(coffeePowderGramm) +" espresso");
        return valueOf(String.valueOf(coffeePowderGramm));
    }
}
