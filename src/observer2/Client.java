package observer2;

/**
 * Created by zero on 28/05/16.
 */
public class Client {
    public static void main(String[] args) {
        Counter counter = new Counter();
        ScreenNotifier notifier = new ScreenNotifier();

        counter.addObserver(notifier);

        counter.increase();
        counter.increase();
    }
}
