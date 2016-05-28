package template_method;

/**
 * Created by zero on 28/05/16.
 */
public class Framework {
    public void start() {
        stepOne();
        stepTwo();
    }

    public void stepOne() {
        System.out.println("Step 1");
    }

    public void stepTwo() {
        System.out.println("Step 2");
    }
}
