package coffee;

public class CoffeeMachine implements Boiled {

    public void MakeCoffee(Coffee coffee) {
        System.out.println("Готовлю " + coffee.getClass().getSimpleName() +" ("+ coffee+")");
    }

}
