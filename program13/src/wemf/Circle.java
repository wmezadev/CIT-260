package wemf;

public class Circle extends Shape {

    private double radius;

    /**
     * Constructor providing identifier and radius
     * @param id integer identifier
     * @param radius double value for radius
     * @param point Object
     */
    public Circle(int id, double radius, Point point) {
        super(id, point);
        this.setRadius(radius);
    }

    /**
     * Gets the radius of this Circle
     * @return double value of the radius
     */
    public double getRadius() {
        return radius;
    }

    /**
     * Sets the radius of this Circle
     * @param radius double value
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    /**
     * Calculates the area of this Circle
     * @return double value of the area
     */
    public double getArea(){
        return Math.PI * (this.getRadius() * this.getRadius());
    }

    /**
     * Override Shape to Circle for string format
     * @return a row string
     */
    @Override
    public String toStringRow() {
        return String.format(
            "%s,%.2f",
            super.toStringRow(),
            this.getRadius()
        );
    }
}