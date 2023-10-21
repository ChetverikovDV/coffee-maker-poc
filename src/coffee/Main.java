package coffee;

import Ingredient.Grinding;
import recipe.Americano;
import recipe.Cappuccino;
import recipe.Espresso;

public class Main {
    public static void main(String[] args) {
        Display title = new Display();
        title.ShowDisplay();

        CoffeeMachine coffeeMachine = new CoffeeMachine();

        Recipe espresso = new Espresso(5, 55, Grinding.FINE);
        Recipe cappuccino = new Cappuccino(5, 55, Grinding.FINE, 100);
        Recipe americano = new Americano(5, 55, Grinding.MEDIUM, 200);


        System.out.println();

        coffeeMachine.MakeCoffee(espresso);
        coffeeMachine.MakeCoffee(cappuccino);
        coffeeMachine.MakeCoffee(americano);

    }
}