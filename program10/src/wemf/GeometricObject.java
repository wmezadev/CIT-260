package wemf;

import java.util.Date;

public class GeometricObject {
    private String color = "white";
    private boolean filled;
    private java.util.Date dateCreated;

    /** Construct a default geometric object */
    public GeometricObject() {
        this.dateCreated = new Date();
    }

    /** Construct a geometric object with the specified color
     *  and filled value
     */
    public GeometricObject(String color, boolean filled) {
        this.dateCreated = new Date();
        this.color = color;
        this.filled = filled;
    }

    /** Return color */
    public String getColor() {
        return this.color;
    }

    /** Set a new color */
    public void setColor(String color){
        this.color = color;
    }

    /** Return filled. Since filled is boolean,
     * its getter method is named isFilled
     */
    public boolean isFilled() {
        return this.filled;
    }

    /** Set a new filled */
    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    /** Get dateCreated */
    public Date getDateCreated() {
        return this.dateCreated;
    }

    /** Return a string representation of this object */
    public String toString() {
        return "created on " + dateCreated + "\ncolor: " + color + " and filled: " + filled;
    }
}
