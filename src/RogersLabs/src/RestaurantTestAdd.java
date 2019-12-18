import java.awt.font.TextAttribute;

public class RestaurantTestAdd {



    public static void main(String[] args) {


        RestaurantDish burger = new RestaurantDish(12.51, "burger", true);
        RestaurantDish pizza = new RestaurantDish(18.05, "pizza", true);
        System.out.println(pizza.toString());
        System.out.println(burger.toString());

    }
}