package strategy;

/**
 * Created by zero on 28/05/16.
 */
public class NormalStrategy implements PriceStrategy {
    @Override
    public double getFinalPrice(double initialPrice) {
        return initialPrice;
    }
}
