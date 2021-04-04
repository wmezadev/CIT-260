package wemf;

public class Point {

    private int x;
    private int y;

    /**
     * Constructor with required coordinates
     * @param x
     * @param y
     */
    public Point(int x, int y) {
        this.setX(x);
        this.setY(y);
    }

    /**
     * Gets X axis value
     * @return integer x
     */
    public int getX() {
        return x;
    }

    /**
     * Sets X axis
     * @param x value
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * Gets Y axis value
     * @return integer y
     */
    public int getY() {
        return y;
    }

    /**
     * Sets Y axis
     * @param y value
     */
    public void setY(int y) {
        this.y = y;
    }

    /**
     * Formatted point position to string
     */
    public String getPosition(){
        return getX() + "," + getY();
    }
}
