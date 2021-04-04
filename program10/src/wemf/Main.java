package wemf;

import java.util.Scanner;

public class Main {

    /**
     * Your main( ) method should
     *
     * Tells the user what the program does.
     * Prompts the user to enter the values for the sides, color, and filled attribute for a triangle object.
     * Saves the users input.
     * Using the values entered by the user, creates the Triangle object.
     * Displays the string representation of the Triangle object by calling its toString( ) method. Look at the output example below to see what this output should look like.
     * Displays a goodbye message.
     */
    public static void main(String[] args) {

        System.out.println("This program gets input for a triangle from the user.");
        System.out.println("It then creates a Triangle object and displays its description.\n");
        Triangle triangle = new Triangle();

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the color of the triangle (e.g. \"red\"):");
        triangle.setColor(input.next());

        System.out.println("Is the triangle filled (y or n):");
        triangle.setFilled( input.next().equals("y"));

        System.out.println("Enter the non-zero, positive lengths of the three sides of the triangle:");
        triangle.setSide1(input.nextDouble());
        triangle.setSide2(input.nextDouble());
        triangle.setSide3(input.nextDouble());

        System.out.println("\n" + triangle.toString());
        System.out.println("\nGoodbye...");

    }
}
