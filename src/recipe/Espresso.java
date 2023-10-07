package recipe;

import Ingredient.CoffeePowderGramm;
import Ingredient.WaterVolumeML;

public class Espresso {
    public CoffeePowderGramm addEspresso(CoffeePowderGramm coffeePowderGramm) {

        System.out.println("Наслаждайся своим " + coffeePowderGramm +" espresso");
        System.out.println();
        System.out.println("Состав: " + WaterVolumeML.ML50.getValue() + "мл. воды, " + coffeePowderGramm.getValue() + "гр. кофе");
        return(coffeePowderGramm);
    }
}


