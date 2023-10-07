package coffee;

import recipe.Espresso;

public class Main {
    public static void main(String[] args) {
        Title title = new Title();
        title.ShowTitle();


        CoffeeMachine coffeeMachine = new CoffeeMachine();   //Запускаем кофемашину
        Espresso espresso = new Espresso();                  //Загружаем рецепт эспрессо

        coffeeMachine.makeEspresso(espresso);                // Варим эспрессо
    }
}