package factory;

/**
 * Created by zero on 28/05/16.
 */
public class DatabaseFactory {
    private DatabaseFactory() {}

    public static Database construct(String databaseName) {
        databaseName = databaseName.toLowerCase();
        if (databaseName.equals("mongodb")) {
            return new MongoDatabase();
        } else if (databaseName.equals("mysql")) {
            return new MysqlDatabase();
        }
        throw new IllegalArgumentException();
    }
}
