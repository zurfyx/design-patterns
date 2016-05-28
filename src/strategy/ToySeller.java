package strategy;

/**
 * Created by zero on 28/05/16.
 */
public class ToySeller {
    private int toyPrice = 1;
    private final PriceStrategy strategy;

    public ToySeller (PriceStrategy strategy) {
        this.strategy = strategy;
    }

    public void printBill() {
        double finalPrice = strategy.getFinalPrice(toyPrice);
        System.out.println(String.format("Toy price: %f", finalPrice));
    }
}
