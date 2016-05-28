package visitor;

/**
 * Created by zero on 28/05/16.
 */
public class Cashier implements Visitor {
    private double transportFee = 0;
    private double bookCost = 0;

    @Override
    public void visit(Book book) {
        bookCost += book.getPrice();
        transportFee += 1;
    }

    public double getTotal() {
        return bookCost + transportFee;
    }
}
