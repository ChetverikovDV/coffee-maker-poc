package coffee;

import Ingredient.CoffeeSort;

public class Coffee {
    String sort;

    public void getSort() {
        System.out.println(sort);
    }
public void setSort(){
        sort = String.valueOf(CoffeeSort.Arabika);
}
}
