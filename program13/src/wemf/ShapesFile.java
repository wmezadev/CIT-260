package wemf;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class ShapesFile {

    private String filePath;

    /**
     * No args Constructor, setting default file path
     */
    public ShapesFile() {
        final String defaultPath = "./data.csv";
        this.setFilePath(defaultPath);
    }

    /**
     * Constructor with file-path as arg
     * @param filePath string to file
     */
    public ShapesFile(String filePath) {
        this.setFilePath(filePath);
    }

    /**
     * Gets file-path string
     * @return string filePath
     */
    public String getFilePath() {
        return filePath;
    }

    /**
     * Sets file-path
     * @param filePath String value
     */
    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    /**
     * Writes shapes array into a File
     * @param shapes ArrayList
     */
    public void save(ArrayList<Shape> shapes) {
        try {
            FileWriter fileWriter = new FileWriter(this.getFilePath());
            // File data content
            for (int i = 0; i < shapes.size(); i++) {
                fileWriter.write(shapes.get(i).toStringRow());
                // if is not the last line, add a line break
                if (shapes.size() - 1 != i) {
                    fileWriter.write("\n");
                }
            }
            fileWriter.close();
        } catch (IOException e) {
            System.out.println("Error while writing data into File\n");
            e.printStackTrace();
        }
    }

    /**
     * Creates a shape (Circle, Triangle, or Square) based on a string data
     * @param row String data
     * @return Shape object
     */
    public Shape rowToShape(String[] row){
        String className = row[0];
        int id = Integer.parseInt(row[1]);
        int x = Integer.parseInt(row[2]);
        int y = Integer.parseInt(row[3]);
        double data = Double.parseDouble(row[4]);
        Point point = new Point(x, y);

        switch (className){
            case "Circle":
                return new Circle(id, data, point);
            case "Square":
                return new Square(id, data, point);
            default:
                double height = Double.parseDouble(row[5]);
                return new Triangle(id, data, height, point);
        }
    }

    /**
     * Reads data from this file and parse into Objects
     * @return Shapes ArrayList
     */
    public ArrayList<Shape> getShapes() {
        ArrayList<Shape> shapes = new ArrayList<>();
        try {
            File file = new File(this.getFilePath());
            Scanner scanner = new Scanner(file);
            while(scanner.hasNext()){
                String[] row = scanner.nextLine().split(",");
                shapes.add(rowToShape(row));
            }
            scanner.close();
        } catch(Exception e) {
            System.out.println("Error while reading file data");
            e.printStackTrace();
            return shapes;
        }
        return shapes;
    }
}
