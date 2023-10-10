package coffee;

import recipe.Espresso;

public class Main {
    public static void main(String[] args) {
        Title title = new Title();
        title.ShowTitle();

        Coffee espresso = new Espresso(5, 55);
        Coffee doubleEspresso = new Espresso(10, 110);

        espresso.getSort();

        CoffeeMachine coffeeMachine = new CoffeeMachine();

        coffeeMachine.MakeCoffee(espresso);
        coffeeMachine.MakeCoffee(doubleEspresso);

    }
}