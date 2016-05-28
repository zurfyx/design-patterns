package factory;

/**
 * Created by zero on 28/05/16.
 */
public class MongoDatabase implements Database {
    @Override
    public void query(String queryset) {
        System.out.println(String.format("[MongoDB] Processing queryset: %s", queryset));
    }
}
