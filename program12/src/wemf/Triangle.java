package wemf;

public class Triangle extends Shape {

    private double base;
    private double height;

    /**
     * Constructor providing identifier, height and base
     * @param id integer identifier
     * @param height double value
     * @param base double value
     */
    public Triangle (int id, double base, double height){
        super(id);
        this.setHeight(height);
        this.setBase(base);
    }

    /**
     * Gets the base
     * @return double value of base
     */
    public double getBase() {
        return base;
    }

    /**
     * Sets the base
     * @param base value
     */
    public void setBase(double base) {
        this.base = base;
    }

    /**
     * Gets the height
     * @return double value of height
     */
    public double getHeight() {
        return height;
    }

    /**
     * Sets the height
     * @param height value
     */
    public void setHeight(double height) {
        this.height = height;
    }

    /**
     * Calculates the area of this Triangle
     * @return double value of the area
     */
    public double getArea() {
        double half = 2;
        return (this.getHeight() * this.getBase()) / half;
    }
}