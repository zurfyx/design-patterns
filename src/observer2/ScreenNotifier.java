package observer2;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by zero on 28/05/16.
 */
public class ScreenNotifier implements Observer {

    @Override
    public void update(Observable o, Object arg) {
        String msg = String.format("Counter changed to: %d", arg);
        System.out.println("(push)");
        System.out.println(msg);
    }
}
