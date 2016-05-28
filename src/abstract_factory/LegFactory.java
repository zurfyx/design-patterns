package abstract_factory;

/**
 * Created by zero on 28/05/16.
 */
public class LegFactory implements AbstractRobotFactory {
    @Override
    public Eye getEye(String color) {
        return null;
    }

    @Override
    public Leg getLeg(String length) {
        if (length.equals("long")) {
            return new LongLeg();
        } else if (length.equals("medium")) {
            return new MediumLeg();
        }
        return null;
    }
}
