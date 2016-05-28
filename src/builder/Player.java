package builder;

/**
 * Created by zero on 28/05/16.
 */
public class Player {
    private final String name;
    private final String email;

    private int stamina;
    private int mana;
    private double speed;

    private Player(Builder builder) {
        name = builder.name;
        email = builder.email;
        stamina = builder.stamina;
        mana = builder.mana;
        speed = builder.speed;
    }

    public static class Builder {
        // required
        private final String name;
        private final String email;

        // optional
        private int stamina;
        private int mana;
        private double speed;

        public Builder(String name, String email) {
            this.name = name;
            this.email = email;
        }

        public Builder setStamina(int val) {
            stamina = val;
            return this;
        }

        public Builder setMana(int val) {
            mana = val;
            return this;
        }

        public Builder setSpeed(int val) {
            speed = val;
            return this;
        }

        public Player build() {
            return new Player(this);
        }
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getStamina() {
        return stamina;
    }

    public int getMana() {
        return mana;
    }

    public double getSpeed() {
        return speed;
    }
}
