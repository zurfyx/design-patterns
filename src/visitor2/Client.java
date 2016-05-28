package visitor2;

import java.util.ArrayList;

/**
 * Created by zero on 28/05/16.
 */
public class Client {
    public static void main(String[] args) {
        ArrayList<Item> shoppingCart = new ArrayList<Item>() {{
            add(new Book(10));
            add(new Movie(20));
        }};


        PremiumCashier cashier = new PremiumCashier();
        for (Item item: shoppingCart) {
            item.accept(cashier);
        }

        String msg = String.format("Total: %s", cashier.getTotal());
        System.out.println(msg);
    }
}
