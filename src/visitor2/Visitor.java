package visitor2;

/**
 * Created by zero on 28/05/16.
 */
public interface Visitor {
    void visit(Book book);
    void visit(Movie movie);
}
