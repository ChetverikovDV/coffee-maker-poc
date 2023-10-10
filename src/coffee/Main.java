package coffee;

import recipe.Espresso;

public class Main {
    public static void main(String[] args) {
        Title title = new Title();
        title.ShowTitle();

        Espresso espresso = new Espresso(5, 55);
        System.out.println(espresso);

        CoffeeMachine coffeeMachine = new CoffeeMachine();
        coffeeMachine.makeCoffee();

    }
}