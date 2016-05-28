package abstract_factory;

/**
 * Created by zero on 28/05/16.
 */
public interface AbstractRobotFactory {
    Eye getEye(String color);
    Leg getLeg(String length);
}
