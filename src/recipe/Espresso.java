package recipe;

import Ingredient.CoffeePowderGramm;
import Ingredient.CoffeeVolumeML;

import static Ingredient.CoffeePowderGramm.*;

public class Espresso {
    public CoffeePowderGramm addEspresso(CoffeePowderGramm coffeePowderGramm) {

        System.out.println("Наслаждайся своим " + coffeePowderGramm +" espresso");
        System.out.println();
        System.out.println("Состав: " + CoffeeVolumeML.ML50.getValue() + "мл. воды, " + coffeePowderGramm.getValue() + "гр. кофе");
        return valueOf(String.valueOf(coffeePowderGramm));
    }
}


