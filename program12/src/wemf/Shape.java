package wemf;

public abstract class Shape {

    private int id;

    /**
     * Constructor with the required identifier
     *
     * @param id the identifier
     */
    public Shape(int id) {
        this.setId(id);
    }

    /**
     * Gets identifier
     * @return integer id
     */
    public int getId() {
        return id;
    }

    /**
     * Sets identifier
     * @param id the identifier
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Displays formatted string shape
     */
    public void display() {
        System.out.format("%d %14.2f sq. inches\n", this.getId(), this.getArea());
    }

    /**
     * Calculates the area of current the Shape
     * @return double value of the area
     */
    public abstract double getArea();
}
