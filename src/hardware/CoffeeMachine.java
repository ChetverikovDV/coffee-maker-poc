package hardware;

import interfaces.Checkble;
import module.Boiler;
import module.Cappuccinator;
import module.CoffeeGrinder;
import visual.*;

public class CoffeeMachine implements Checkble {
    int powerConsumption = 200;

    public void MakeCoffee(CurrentRecipe coffee) {

        Visual visual = new Visual();

        System.out.println();


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
        System.out.println("________________________________________________________");


    }

    public void check() {

        System.out.println("Запускаю процессор ");

        System.out.println(powerConsumption + " Ватт - собственное потребление кофепроцессора");

        Boiler boiler = new Boiler();
        Cappuccinator cappuccinator = new Cappuccinator();
        CoffeeGrinder coffeeGrinder = new CoffeeGrinder();
        CoffeeMachine coffeeMachine = new CoffeeMachine();

        boiler.check();
        boiler.ready();

        cappuccinator.check();
        coffeeGrinder.check();

        if (!boiler.ready()|!coffeeMachine.ready()|!cappuccinator.ready()|!coffeeGrinder.ready()) {
            System.out.println("Не попьем мы кофе сегодня. Что-то не так");
            System.exit(1);
        }

        int total = boiler.getPowerConsumption() + cappuccinator.getPowerConsumption()
                + coffeeGrinder.getPowerConsumption() + powerConsumption;
        System.out.println("________________________________________________________");
        System.out.println(total + " Ватт - Суммарное энергпотребление");


    }

    @Override
    public boolean ready() {
        return true;
    }


}



