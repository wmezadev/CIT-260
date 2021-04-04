package wemf;

public abstract class Shape {

    private int id;
    private Point point;

    /**
     * Constructor with the required identifier
     *
     * @param id the identifier
     * @param point Object
     */
    public Shape(int id, Point point) {
        this.setId(id);
        this.setPoint(point);
    }

    /**
     * Gets identifier
     * @return integer id
     */
    public int getId() {
        return id;
    }

    /**
     * Gets Point
     * @return Point object
     */
    public Point getPoint() {
        return point;
    }

    /**
     * Sets identifier
     * @param id the identifier
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Sets point
     * @param point object
     */
    public void setPoint(Point point) {
        this.point = point;
    }

    /**
     * Displays formatted string shape
     */
    public void display() {
        System.out.format(
            "%-10s%-5d(%s)%11.2f\n",
            this.getClass().getSimpleName(),
            this.getId(),
            this.getPoint().getPosition(),
            this.getArea()
        );
    }

    /**
     * Calculates the area of current the Shape
     * @return double value of the area
     */
    public abstract double getArea();

    /**
     * Formats Shape attributes into a string row
     * @return a row string
     */
    public String toStringRow() {
        return String.format(
                "%s,%d,%s",
                this.getClass().getSimpleName(),
                this.getId(),
                this.getPoint().getPosition()
        );
    }
}
