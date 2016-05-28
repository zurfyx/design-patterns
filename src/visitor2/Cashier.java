package visitor2;

/**
 * Created by zero on 28/05/16.
 */
public class Cashier implements Visitor {
    private double transportFee = 0;
    private double cost = 0;

    @Override
    public void visit(Book book) {
        cost += book.getPrice();
        transportFee += 1;
    }

    @Override
    public void visit(Movie movie) {
        cost += movie.getPrice();
        transportFee += 0.5;
    }

    public double getTotal() {
        return cost + transportFee;
    }
}
