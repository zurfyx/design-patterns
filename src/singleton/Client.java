package singleton;

/**
 * Created by zero on 28/05/16.
 */
public class Client {
    public static void main(String[] args) {
        Singleton s1 = Singleton.INSTANCE;
        Singleton s2 = Singleton.INSTANCE;

        if (s1 == s2) {
            System.out.println("s1 == s2");
        }

        LazySingleton ls1 = LazySingleton.getInstance();
        LazySingleton ls2 = LazySingleton.getInstance();

        if (ls1 == ls2) {
            System.out.println("ls1 == ls2");
        }
    }
}
