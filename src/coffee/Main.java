package coffee;

import Ingredient.CoffeePowderGramm;
import recipe.Espresso;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Title title = new Title();
        title.ShowTitle();

        CoffeeMachine coffeeMachine = new CoffeeMachine();   //Запускаем кофемашину
        Espresso espresso = new Espresso();                  //Загружаем рецепт эспрессо

        espresso.addEspresso(CoffeePowderGramm.Double);     //Указываем объем
        coffeeMachine.makeEspresso(espresso);                // Варим эспрессо
    }
}