package wemf;

public class Triangle extends GeometricObject {
    private double side1;
    private double side2;
    private double side3;

    /**
     * Constructor default for Triangle
     */
    public Triangle () {
        super();
        this.setSide1(1);
        this.setSide2(1);
        this.setSide3(1);
    }

    /**
     * Creates a Triangle using the values provided
     *
     * @param s1 the value of side 1
     * @param s2 the value of side 2
     * @param s3 the value of side 3
     * @param color the color of the Triangle
     * @param filled whether or not the Triangle is filled
     */
    public Triangle (double s1, double s2, double s3, String color, boolean filled) {
        super(color, filled);
        this.setSide1(s1);
        this.setSide2(s2);
        this.setSide3(s3);
    }

    /**
     * Gets the value of side1 of the Triangle
     * @return the value of side1
     */
    public double getSide1(){
        return this.side1;
    }

    /**
     * Gets the value of side2 of the Triangle
     * @return the value of side2
     */
    public double getSide2(){
        return this.side2;
    }

    /**
     * Gets the value of side3 of the Triangle
     * @return the value of side3
     */
    public double getSide3(){
        return this.side3;
    }

    /**
     * Sets the value of side1 of the Triangle
     * @param value of side1
     */
    public void setSide1(double value) {
        this.side1 = value;
    }

    /**
     * Sets the value of side2 of the Triangle
     * @param value of side2
     */
    public void setSide2(double value) {
        this.side2 = value;
    }

    /**
     * Sets the value of side3 of the Triangle
     * @param value of side 3
     */
    public void setSide3(double value) {
        this.side3 = value;
    }

    /**
     * Calculates and returns the area of the Triangle given the dimensions of the sides
     * @return the area of the Triangle
     */
    public double getArea() {
        double partialPerimeter = (this.getSide1() + this.getSide2() + this.getSide3()) / 2.0;
        return Math.sqrt(partialPerimeter * (partialPerimeter - this.getSide1()) * (partialPerimeter - this.getSide2()) * (partialPerimeter - this.getSide3()));
    }

    /**
     * Creates a representation of this Triangle
     * @return a string representation of this object
     */
    @Override
    public String toString() {
        return String.format (
            "side1 = %.2f, side2 = %.2f, side3 = %.2f\n%s\nArea = %.2f",
            this.getSide1(),
            this.getSide2(),
            this.getSide3(),
            super.toString(),
            this.getArea()
        );
    }
}
