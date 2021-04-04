package wemf;

public class Square extends Shape {

    private double side;

    /**
     * Constructor providing identifier and a side of the square (all four sides are equal)
     * @param id integer identifier
     * @param side double value for a side
     */
    public Square(int id, double side) {
        super(id);
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
}
