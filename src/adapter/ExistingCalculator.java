package adapter;

/**
 * Created by zero on 28/05/16.
 */
public class ExistingCalculator {
    private int val = 0;

    public void addition(int val) {
        this.val += val;
    }

    public int getVal() {
        return val;
    }
}
