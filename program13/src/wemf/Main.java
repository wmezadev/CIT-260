package wemf;

import java.util.ArrayList;

public class Main {

    /**
     * Your main( ) method must do the following:
     *
     * 1. Tell the user what the program does.
     * 2. Create the following objects and store the references to them in a single ArrayList.
     *    - A Circle object at point (1,1) with a radius of 10 inches and an identifier of 156
     *    - A Square object at point (1,3) with a side of 2 inches and an identifier of 237
     *    - A  Right Triangle at point (3,3) with a height of 3 inches, a base of 4 inches and an identifier of 212
     * 3. Create a text file and write the data for each object to the file. Handle any IO exceptions.
     * 4. Read the data from the file back into your program. Handle any IO Exceptions.
     * 5. Using the data you just read from the file, display a report that looks like the following:
     *
     * Shape      ID  Position  Area
     * Circle    156  (1,1)     314.16
     * Square    237  (1,3)       4.00
     * Triangle  212  (3,3)       6.00
     * @param args default
     */
    public static void main(String[] args) {
        System.out.println("This program creates a series of shapes.");
        System.out.println("It will write those shapes to a file, read them from a file.\n");
        // Create Shape objects
        ArrayList<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle(156, 10.0,  new Point(1, 1)));
        shapes.add(new Square(237, 2.0, new Point(1, 3)));
        shapes.add(new Triangle(212, 3.0, 4.0, new Point(3, 3)));
        // Save Shapes into File
        ShapesFile dataFile = new ShapesFile("./data.csv");
        dataFile.save(shapes);
        // Read data an create Array of Shapes
        ArrayList<Shape> newShapes = dataFile.getShapes();
        // Display Shapes data
        System.out.println("Shape     ID   Position  Area");
        for (Shape shape: newShapes) {
            shape.display();
        }
        System.out.println("\nGoodbye...");
    }
}
