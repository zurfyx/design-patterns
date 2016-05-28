package visitor;

import java.util.ArrayList;

/**
 * Created by zero on 28/05/16.
 */
public class Client {
    public static void main(String[] args) {
        ArrayList<Book> shoppingCart = new ArrayList<Book>() {{
            add(new Book(20));
            add(new Book(10));
        }};

        Cashier cashier = new Cashier();
        for (Book book: shoppingCart) {
            book.accept(cashier);
        }

        String msg = String.format("Total: %s", cashier.getTotal());
        System.out.println(msg);
    }
}
