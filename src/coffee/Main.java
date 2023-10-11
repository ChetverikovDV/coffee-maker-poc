package coffee;

import recipe.Americano;
import recipe.Cappuccino;
import recipe.Espresso;

public class Main {
    public static void main(String[] args) {
        Display title = new Display();
        title.ShowDisplay();

        CoffeeMachine coffeeMachine = new CoffeeMachine();

        Coffee espresso = new Espresso(5, 55);
        Coffee doubleEspresso = new Espresso(10, 110);
        Coffee cappuccino = new Cappuccino(5, 55, 100);
        Coffee americano = new Americano(5, 55, 200);

        coffeeMachine.MakeCoffee(espresso);
        coffeeMachine.MakeCoffee(doubleEspresso);
        coffeeMachine.MakeCoffee(cappuccino);
        coffeeMachine.MakeCoffee(americano);

    }
}