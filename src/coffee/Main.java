package coffee;

import Ingredient.CoffeePowderGramm;
import recipe.Espresso;


public class Main {
    public static void main(String[] args) {
        Title title = new Title();
        title.ShowTitle();

        CoffeeMachine coffeeMachine = new CoffeeMachine();   //Запускаем кофемашину
        Espresso espresso = new Espresso();                  //Загружаем рецепт эспрессо

        espresso.addEspresso(CoffeePowderGramm.Double);      //Указываем объем эспрессо
        coffeeMachine.makeEspresso(espresso);                // Варим эспрессо
    }
}