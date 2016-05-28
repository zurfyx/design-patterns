package abstract_factory;

/**
 * Created by zero on 28/05/16.
 */
public class Client {
    public static void main(String[] args) {
        AbstractRobotFactory factory = RobotFactory.getRobotPartFactory("eye");
        Eye eye = factory.getEye("red");
        System.out.println(eye.getColor());
    }
}
