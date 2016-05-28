package observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

/**
 * Created by zero on 28/05/16.
 */
public class Counter extends Observable {
    private int counter = 0;

    public void increase() {
        counter++;
        setChanged();
        notifyObservers(); // pull
    }

    public int getCounter() {
        return counter;
    }
}
