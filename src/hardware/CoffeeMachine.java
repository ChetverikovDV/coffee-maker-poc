package hardware;

import module.Boiler;
import module.CoffeeGrinder;
import visual.Delay;
import visual.Filling;

public class CoffeeMachine {

    public void MakeCoffee(CurrentRecipe coffee) {
        Filling filling = new Filling();
        Delay delay = new Delay();

        System.out.println("Запускаю процессор ");
        filling.fill();
        System.out.println();
        delay.delay(20);

        System.out.println("Готовлю " + coffee.getClass().getSimpleName() + " (" + coffee + ") ");
        System.out.println();                        //Читаем рецепт
        delay.delay(20);

        CoffeeGrinder grinder = new CoffeeGrinder(); //Запустили кофемолку
        grinder.grind(coffee);                       //Кофемолка смолола что-то по рецепту
        delay.delay(20);

        Boiler boiler = new Boiler();                //Запустили "чайник"
        boiler.boil(coffee);                         //Чайник вскипятил по рецепту
        delay.delay(20);

    }

}
