
public class Player extends GameObject {

    private String name;
    private int health;

    public Player(String name, int x, int y,
                  int width, int height, int health) {

        super(x, y, width, height);

        setName(name);
        setHealth(health);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {

        if (name != null && !name.trim().isEmpty()) {

            name = name.trim().toLowerCase();

            String[] rijeci = name.split("\\s+");

            String novoIme = "";

            for (int i = 0; i < rijeci.length; i++) {

                String rijec = rijeci[i];

                rijec = rijec.substring(0, 1).toUpperCase()
                        + rijec.substring(1);

                if (i > 0) {
                    novoIme = novoIme + " ";
                }

                novoIme = novoIme + rijec;
            }

            this.name = novoIme;
        }
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {

        if (health >= 0 && health <= 100) {
            this.health = health;
        }
    }

    @Override
    public String toString() {
        return "Player[" + name + "] @ ("
                + getX() + "," + getY() + ") "
                + getWidth() + "x" + getHeight()
                + " HP=" + health;
    }
}


//Bogdan Savicevic 25054