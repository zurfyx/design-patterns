package factory;

/**
 * Created by zero on 28/05/16.
 */
public class MysqlDatabase implements Database {
    @Override
    public void query(String queryset) {
        System.out.println(String.format("[MySQL] Processing queryset: %s", queryset));
    }
}
