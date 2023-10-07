package Ingredient;

public enum WaterVolumeML {
    ML50(50),
    ML200(200),
    ML300(300),
    ML400(400),
    ML500(500);
    private int value;

     WaterVolumeML(int value){
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
