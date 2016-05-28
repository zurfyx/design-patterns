package visitor;

/**
 * Created by zero on 28/05/16.
 */
public class Book implements Visitable {
    private double price;

    public Book(double price) {
        this.price = price;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public double getPrice() {
        return price;
    }
}
