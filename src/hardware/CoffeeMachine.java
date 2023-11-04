package hardware;

import module.Boiler;
import module.Cappuccinator;
import module.CoffeeGrinder;
import visual.*;

public class CoffeeMachine {

    public void MakeCoffee(CurrentRecipe coffee) {

        Visual visual = new Visual();

        System.out.println();

        System.out.println("Запускаю процессор ");
        visual.fill(5);

        System.out.println();
        visual.delay(10);

        System.out.println("Готовлю " + coffee.getClass().getSimpleName() + " (" + coffee + ") ");
        System.out.println();                        //Читаем рецепт
        visual.delay(10);

        if (coffee.getGrammOfCoffee() > 0) {
            CoffeeGrinder grinder = new CoffeeGrinder(); //Запустили кофемолку
            grinder.grind(coffee);                       //Кофемолка смолола что-то по рецепту
            visual.delay(10);
        }

        if (coffee.getWater() > 0) {
            Boiler boiler = new Boiler();                //Запустили "чайник"
            boiler.boil(coffee);                         //Чайник вскипятил по рецепту
            visual.delay(10);
        }

        if (coffee.getSimpleBoiledWater() > 0) {
            Boiler boiler = new Boiler();
            boiler.flood(coffee);                        //просто добавил воды по рецепту
            visual.delay(10);
        }

        if (coffee.getMilkFoam() > 0) {
            Cappuccinator cappuccinator = new Cappuccinator();
            cappuccinator.makeMilkFoam(coffee);
            visual.delay(10);
        }
        System.out.println("__________________________________________________________________");

    }

    public void CheckPWR() {

        int total;
        Boiler boiler = new Boiler();
        Cappuccinator cappuccinator = new Cappuccinator();
        CoffeeGrinder coffeeGrinder = new CoffeeGrinder();

        total = boiler.getPower() + coffeeGrinder.getPower() + cappuccinator.getPower();

        System.out.println("_____________________");
        System.out.print(total+ " Ватт в сумме");
        System.out.println();

    }
}


