package coffee;

public class Main {
    public static void main(String[] args) {
Title title = new Title();
title.ShowTitle();

CoffeeMachine coffeeMachine = new CoffeeMachine();

coffeeMachine.makeCappuccino();
coffeeMachine.makeLatte();
    }
}