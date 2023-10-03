package coffee;

public class Main {
    public static void main(String[] args) {
Title title = new Title();
title.ShowTitle();

CoffeeMachine coffeeMachine = new CoffeeMachine();

coffeeMachine.makeCappuccino(
        VolumeML.ML300,
        Roasting.LIGHT,
        Milk.NO,
        Foam.YES
);

coffeeMachine.makeLatte(
        VolumeML.ML500,
        Roasting.DARK,
        Milk.YES,
        Foam.YES
);
    }
}