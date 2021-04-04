package wemf;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    System.out.println("This program creates two rectangle objects and displays their width, height, area and perimeter.");
        // create rectangle instace 1
	    Rectangle r1 = new Rectangle(4.00, 40.00);
        System.out.println("\nRectangle 1:");
        // calculate and print rectangle 1 values and methods
        System.out.println("height = "+r1.getHeight()+"\n"+"width = "+r1.getWidth()+"\n"+"area = "+r1.getArea()+"\n"+"perimeter = "+r1.getPerimeter());
        // create rectangle instace 2
        Rectangle r2 = new Rectangle(3.50, 5.00);
        System.out.println("\nRectangle 2:");
        // calculate and print rectangle 2 values and methods
        System.out.println("height = "+r2.getHeight()+"\n"+"width = "+r2.getWidth()+"\n"+"area = "+r2.getArea()+"\n"+"perimeter = "+r2.getPerimeter());
        System.out.println("goodbye ...");
    }

}
