package hardware;

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
        delay.delay();

        CoffeeGrinder grinder = new CoffeeGrinder(); //Запустили кофемолку
        grinder.grind(coffee);                       //Кофемолка смолола что-то по рецепту
        delay.delay();

        System.out.println("Готовлю " + coffee.getClass().getSimpleName() + " (" + coffee + ") ");
        System.out.println();
        delay.delay();                        //Машин сварил остальное (пока нет других модулей)

    }

}
