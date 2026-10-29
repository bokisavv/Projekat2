
public class GameObject {

    private int x;
    private int y;
    private int width;
    private int height;

    public GameObject(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;

        if (width > 0) {
            this.width = width;
        } else {
            this.width = 1;
        }

        if (height > 0) {
            this.height = height;
        } else {
            this.height = 1;
        }
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        if (width > 0) {
            this.width = width;
        }
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        if (height > 0) {
            this.height = height;
        }
    }

    public boolean intersects(GameObject drugiobjekat) {

        if (this.x < drugiobjekat.x + drugiobjekat.width
                && this.x + this.width > drugiobjekat.x
                && this.y < drugiobjekat.y + drugiobjekat.height
                && this.y + this.height > drugiobjekat.y) {

            return true;
        }

        return false;
    }

    @Override
    public String toString() {
        return "GameObject @ (" + x + "," + y + ") "
                + width + "x" + height;
    }
}
