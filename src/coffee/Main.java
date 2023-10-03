package coffee;

import Ingredient.Foam;
import Ingredient.Milk;
import Ingredient.Roasting;
import Ingredient.CoffeeVolumeML;

public class Main {
    public static void main(String[] args) {
Title title = new Title();
title.ShowTitle();

CoffeeMachine coffeeMachine = new CoffeeMachine();

coffeeMachine.makeCappuccino(
        CoffeeVolumeML.ML300,
        Roasting.LIGHT,
        Milk.NO,
        Foam.YES
);

coffeeMachine.makeLatte(
        CoffeeVolumeML.ML500,
        Roasting.DARK,
        Milk.YES,
        Foam.YES
);
    }
}