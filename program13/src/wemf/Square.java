package wemf;

public class Square extends Shape {

    private double side;

    /**
     * Constructor providing identifier and a side of the square (all four sides are equal)
     * @param id integer identifier
     * @param side double value for a side
     * @param point Object
     */
    public Square(int id, double side, Point point) {
        super(id, point);
        this.setSide(side);
    }

    /**
     * Gets a side of the Square (all four sides are equal)
     * @return double value of the side
     */
    public double getSide() {
        return side;
    }

    /**
     * Sets a side of the Square
     * @param side double value
     */
    public void setSide(double side) {
        this.side = side;
    }

    /**
     * Calculates the area of this Square
     * @return double value of the area
     */
    public double getArea(){
        return this.getSide() * this.getSide();
    }

    /**
     * Override Shape to Square for string format
     * @return a row string
     */
    @Override
    public String toStringRow() {
        return String.format(
                "%s,%.2f",
                super.toStringRow(),
                this.getSide()
        );
    }
}
