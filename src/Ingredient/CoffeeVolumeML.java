package Ingredient;

public enum CoffeeVolumeML {
    ML50(50),
    ML200(200),
    ML300(300),
    ML400(400),
    ML500(500);
    private int value;

    CoffeeVolumeML(int value){
        this.value = value;
    }

}
