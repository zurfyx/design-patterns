package adapter;

/**
 * Created by zero on 28/05/16.
 */
public class Client {
    public static void main(String[] args) {
        ExistingCalculator existingCalculator = new ExistingCalculator();
        existingCalculator.addition(2);
        System.out.println(String.format("[old] 0+2 = %d", existingCalculator.getVal()));

        NewCalculator newCalculator = new NewCalculator();
        newCalculator.add(2);
        System.out.println(String.format("[adapted] 0+2 = %d", newCalculator.getVal()));
    }
}
