package abstract_factory;

/**
 * Created by zero on 28/05/16.
 */
public class RobotFactory {
    private RobotFactory () {}

    public static AbstractRobotFactory getRobotPartFactory(String part) {
        if (part.equals("eye")) {
            return new EyeFactory();
        } else if (part.equals("leg")) {
            return new LegFactory();
        }
        return null;
    }
}
