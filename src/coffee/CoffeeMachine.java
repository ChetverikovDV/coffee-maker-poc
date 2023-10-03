package coffee;

import Ingredient.Foam;
import Ingredient.Milk;
import Ingredient.Roasting;
import Ingredient.CoffeeVolumeML;

public class CoffeeMachine {
    public void makeCappuccino(CoffeeVolumeML volumeML, Roasting roasting, Milk milk, Foam foam){

        System.out.println("Вот твой капучино");
    }

    public void makeLatte(CoffeeVolumeML volumeML, Roasting roasting, Milk milk, Foam foam){

        System.out.println("Вот твой Латте");
    }
}
