package strategy;

/**
 * Created by zero on 28/05/16.
 */
public class Client {
    public static void main(String[] args) {
        PriceStrategy christmasStrategy = new ChristmasStrategy();
        ToySeller seller = new ToySeller(christmasStrategy);
        seller.printBill();
    }
}
