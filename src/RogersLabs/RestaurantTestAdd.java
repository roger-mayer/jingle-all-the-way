package RogersLabs;

import java.awt.font.TextAttribute;

public class RestaurantTestAdd {



    public static void main(String[] args) {


        RestuarantDish burger = new RestuarantDish(12, "burger", true);
        RestuarantDish pizza = new RestuarantDish(18, "pizza", true);
        System.out.println(pizza.toString());
        System.out.println(burger.toString());

    }
}
