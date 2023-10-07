package coffee;

import Ingredient.Foam;
import Ingredient.Milk;
import Ingredient.Roasting;
import Ingredient.CoffeeVolumeML;
import recipe.Espresso;

public class CoffeeMachine {
    public void makeCappuccino(CoffeeVolumeML volumeML, Roasting roasting, Milk milk, Foam foam){

        System.out.println("Вот твой капучино");
    }

    public void makeLatte(CoffeeVolumeML volumeML, Roasting roasting, Milk milk, Foam foam){

        System.out.println("Вот твой Латте");
    }
    public void makeEspresso(Espresso espresso){

        System.out.println("Вот твой эКспрессо");
    }
}
