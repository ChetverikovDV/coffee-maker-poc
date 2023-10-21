package coffee;

public class CoffeeMachine implements Boiled {

    public void MakeCoffee(Recipe coffee) {

        System.out.println("Запускаю процессор");
        System.out.println();

        CoffeeGrinder grinder = new CoffeeGrinder(); //Запустили кофемолку
        grinder.grind(coffee);                       //Кофемолка смолола что-то по рецепту

        System.out.println("Готовлю " + coffee.getClass().getSimpleName() + " (" + coffee + ")");
        System.out.println();                        //Машин сварил остальное (пока нет других модулей)
    }

}
