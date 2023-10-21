package hardware;

public class CoffeeMachine implements Boiled {

    public void MakeCoffee(Recipe coffee) {
        Filling filling = new Filling();

        System.out.print("Запускаю процессор ");
        filling.fill();
        System.out.println();

        CoffeeGrinder grinder = new CoffeeGrinder(); //Запустили кофемолку
        grinder.grind(coffee);                       //Кофемолка смолола что-то по рецепту
        filling.fill();
        System.out.println();

        System.out.print("Готовлю " + coffee.getClass().getSimpleName() + " (" + coffee + ") ");
        filling.fill();
        System.out.println();
        System.out.println();;                        //Машин сварил остальное (пока нет других модулей)

    }

}
