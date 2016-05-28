package abstract_factory;

/**
 * Created by zero on 28/05/16.
 */
public class EyeFactory implements AbstractRobotFactory {
    @Override
    public Eye getEye(String color) {
        if (color.equals("red")) {
            return new RedEye();
        } else if (color.equals("blue")) {
            return new BlueEye();
        }
        return null;
    }

    @Override
    public Leg getLeg(String length) {
        return null;
    }
}
