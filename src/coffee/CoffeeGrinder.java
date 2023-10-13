package coffee;

public class CoffeeGrinder {

    public void grind(Coffee coffee) {
        System.out.println("Кофемолка смолола для " + coffee.getClass().getSimpleName() +
                " " + coffee.getCoffee() + " грамм кофе " + coffee.getGrinding()
                + " обжарки");
    }
}

