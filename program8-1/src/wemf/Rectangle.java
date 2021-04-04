package wemf;

public class Rectangle {

    private double height;
    private double width;

    /**
     * Constructor
     * @param height - number
     * @param width - number
     */
    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    /**
     * @return the height current instance
     */
    public double getHeight() {
        return height;
    }

    /**
     * @return the width current instance
     */
    public double getWidth() {
        return width;
    }

    /**
     * Calculates the area of the rectangle object using height and width
     *
     * @return the area for current instance
     */
    public double getArea() {
        return getHeight() * getWidth();
    }

    /**
     * Calculates the perimeter of the rectangle object using height and width
     *
     * @return the perimeter for current instance
     */
    public double getPerimeter () {
        return 2 * (getHeight() + getWidth());
    }

}
