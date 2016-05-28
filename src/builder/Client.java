package builder;

/**
 * Created by zero on 28/05/16.
 */
public class Client {
    public static void main(String[] args) {
        Player player = new Player
                .Builder("Francis", "francis@mail.com")
                .setStamina(200)
                .setMana(100)
                .setSpeed(2)
                .build();

        System.out.println(String.format("My name is %s", player.getName()));
    }
}
