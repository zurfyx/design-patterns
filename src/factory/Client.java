package factory;

/**
 * Created by zero on 28/05/16.
 */
public class Client {
    public static void main(String[] args) {
        Database mysqldb = DatabaseFactory.construct("mysql");
        Database mongodb = DatabaseFactory.construct("mongodb");

        mysqldb.query("mysql query");
        mongodb.query("mongo query");
    }
}
