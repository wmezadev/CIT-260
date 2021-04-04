package wemf;

public class Circle extends Shape {

    private double radius;

    /**
     * Constructor providing identifier and radius
     * @param id integer identifier
     * @param radius double value for radius
     */
    public Circle(int id, double radius) {
        super(id);
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
}