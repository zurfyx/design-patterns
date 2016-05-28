package visitor2;

/**
 * Created by zero on 28/05/16.
 */
public class Movie implements Item {
    private double price;

    public Movie(double price) {
        this.price = price;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public double getPrice() {
        return price;
    }
}
