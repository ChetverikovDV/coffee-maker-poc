package coffee;

public class CoffeeMachine implements Boiled {

    public void MakeCoffee(Recipe coffee) {
        System.out.println("Готовлю " + coffee.getClass().getSimpleName() +" ("+ coffee+")");
    }

}
