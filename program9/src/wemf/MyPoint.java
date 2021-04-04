package wemf;

public class MyPoint {
    private int x;
    private int y;

    /**
     * Default no-arg constructor
     */
    public MyPoint(){
        this.x = 0;
        this.y = 0;
    }

    /**
     * Override constructor with arguments
     *
     * @param x axis value
     * @param y axis value
     */
    public MyPoint(int x, int y){
        this.x = x;
        this.y = y;
    }

    /**
     * Gets the "x" value
     *
     * @return integer value for "x"
     */
    public int getX(){
        return this.x;
    }

    /**
     * Gets the "x" value
     *
     * @return integer value for "y"
     */
    public int getY(){
        return this.y;
    }

    /**
     * Sets the "x" value
     *
     * @param x axis value for the Point
     */
    public void setX(int x){
        this.x = x;
    }

    /**
     * Sets the "y" value
     *
     * @param y axis value for the Point
     */
    public void setY(int y) {
        this.y = y;
    }

    /**
     * Display coordinates of the Point
     *
     * @return the x and y coordinate of the Point
     */
    public String display(){
        return "(" + this.x + "," + this.y + ")";
    }

    /**
     * Calculates and returns the distance between this MyPoint object and another point that is specified by its x- and y-coordinates.
     *
     * @param xCoord the x coordinate of another point
     * @param yCoord the y coordinate of another point
     * @return the distance between a point and the coordinates
     */
    public double distance(int xCoord, int yCoord) {
        double deltaX = Math.abs(this.x - xCoord);
        double deltaY = Math.abs(this.y - yCoord);
        double aSquared = Math.pow(deltaX, 2);
        double bSquared = Math.pow(deltaY, 2);

        return Math.sqrt(aSquared + bSquared);
    }

    /**
     * Calculates and returns the distance between this MyPoint object and another object of the MyPoint class.
     *
     * @param p the second Point
     * @return the distance between the current object Point and a second Point
     */
    public double distance(MyPoint p) {
        return this.distance(p.getX(), p.getY());
    }

    /**
     * Takes two objects of the MyPoint class as parameters, and calculates and returns the distance between the two of them.
     *
     * @param mp1 The first Point
     * @param mp2 The second Point
     * @return the distance between the two of them
     */
    public static double distance (MyPoint mp1, MyPoint mp2){
        return mp1.distance(mp2);
    }
}
