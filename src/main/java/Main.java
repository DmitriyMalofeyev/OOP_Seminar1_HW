import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product>products = new ArrayList<>();
        HotDrink drink1 = new HotDrink("black tea",15.0,200,85);
        products.add(drink1);
        HotDrink drink2 = new HotDrink("green tea",15.0,200,80);
        products.add(drink2);
        HotDrink drink3 = new HotDrink("coffee",20.0,150,70);
        products.add(drink3);
        HotDrink drink4 = new HotDrink("chocolate",25.0,300,60);
        products.add(drink4);
        HotDrink drink5 = new HotDrink("water",5.0,200,90);
        products.add(drink5);
        HotDrinkMachine hotDrinkVendingMachine = new HotDrinkMachine(products);
        System.out.println(hotDrinkVendingMachine.getProduct("green tea",200,80));
    }
}