package coffee;

public class Main {
    public static void main(String[] args) {
Title title = new Title();
title.ShowTitle();

CoffeeMachine coffeeMachine = new CoffeeMachine();

coffeeMachine.makeCappuccino(
        Roasting.LIGHT,
        VolumeML.ML300,
        Milk.NO,
        Foam.YES
);

coffeeMachine.makeLatte(
        Roasting.DARK,
        VolumeML.ML500,
        Milk.YES,
        Foam.YES
);
    }
}