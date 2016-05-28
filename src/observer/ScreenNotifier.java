package observer;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by zero on 28/05/16.
 */
public class ScreenNotifier implements Observer {

    @Override
    public void update(Observable o, Object arg) {
        Counter c = (Counter) o;
        String msg = String.format("Counter changed to: %d", c.getCounter());
        System.out.println("(pull)");
        System.out.println(msg);
    }
}
