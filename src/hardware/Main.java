package hardware;

import ingredient.Grinding;
import recipe.Tea;
import visual.Display;
import recipe.Americano;
import recipe.Cappuccino;
import recipe.Espresso;

public class Main {
    public static void main(String[] args) {
        Display title = new Display();
        title.ShowDisplay();

        CoffeeMachine coffeeMachine = new CoffeeMachine();

        CurrentRecipe espresso = new Espresso(5, 55, Grinding.FINE);
        CurrentRecipe cappuccino = new Cappuccino(5, 55, Grinding.FINE, 100);
        CurrentRecipe americano = new Americano(5, 55, Grinding.MEDIUM, 200);
        CurrentRecipe tea = new Tea(300);

        System.out.println();

        // coffeeMachine.MakeCoffee(espresso);
        //  coffeeMachine.MakeCoffee(cappuccino);
        coffeeMachine.MakeCoffee(americano);
        coffeeMachine.MakeCoffee(tea);

    }
}