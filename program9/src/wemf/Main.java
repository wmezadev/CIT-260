package wemf;

import java.util.Scanner;

public class Main {

    /**
     * Tells the user what the program does.
     * Uses the no-arg constructor to create a MyPoint object p1 at (0,0).
     * Prompts the user to enter the x and y coordinates of a point.
     * Saves the users input.
     * Uses the first distance method to calculate and display the distance between the MyPoint object p1 and the point at the x and y coordinates entered by the user. The distance is displayed with two digits after the decimal point.
     * Uses the parameterized constructor to create a MyPoint object p2 using the x-coordinate and the y-coordinate entered  by the user.
     * Uses the second and third distance methods to calculate and display the distance between the MyPoint object p1 and the MyPoint object p2.  The distance is displayed with two digits after the decimal point.
     * Displays a goodbye message.
     *
     * @param args
     */
    public static void main(String[] args) {

        System.out.println("This program creates a point at (0,0) and a point at the coordinates");
        System.out.println("entered by you. It then computes and displays the distance from (0,0)");
        System.out.println("to the point defined by you, using three different methods.");

        int x = promptUser("Enter the x coordinate of a point: ");
        int y = promptUser("Enter the y coordinate of a point: ");

        MyPoint initPoint = new MyPoint();
        MyPoint altPoint = new MyPoint(x, y);

        System.out.format("Using method 1, the distance from %s to %s is %.2f\n", initPoint.display(), altPoint.display(), altPoint.distance(initPoint.getX(), initPoint.getY()));
        System.out.format("Using method 2, the distance from %s to %s is %.2f\n", initPoint.display(), altPoint.display(), altPoint.distance(initPoint));
        System.out.format("Using method 3, the distance from %s to %s is %.2f\n", initPoint.display(), altPoint.display(), MyPoint.distance(initPoint, altPoint));

        System.out.println("Goodbye...");
    }

    /**
     * Prompts the user using a message
     *
     * @param msg message to display
     * @return the coordinate entered by the user
     */
    public static int promptUser(String msg){
        Scanner input = new Scanner(System.in);
        System.out.print(msg);
        return input.nextInt();
    }

}
