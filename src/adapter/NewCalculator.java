package adapter;

/**
 * Created by zero on 28/05/16.
 */
public class NewCalculator extends ExistingCalculator implements RequiredCalculator {

    @Override
    public NewCalculator add(int val) {
        addition(val);
        return this;
    }
}
