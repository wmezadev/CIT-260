package wemf;

import java.util.Scanner;

public class Main {

    /**
     *
     * Write a method that calculates and returns the average value for an array of doubles. The method header will look like the following:
     *
     *     public static double average(double[ ] array)
     *
     * Then write a main( ) method that does the following:
     *  1) Tells the user what the program does.
     *  2) Prompts the user to enter 5 double values.
     *  3) Stores these values in an array.
     *  4) Calls the average method you wrote to calculate and return the average value of the numbers in the array.
     *  5) Displays the average value, with two digits after the decimal point.
     *  6) Displays a goodbye message.
     *
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("This program calculates the average of five numbers.");
        final int SIZE = 5; // five iterations only
        double [] arrayNumbers = new double[SIZE];
        for(int i = 0; i < SIZE; i++){
            arrayNumbers[i] = promptUser("Please enter a number: ");
        }
        double result = average(arrayNumbers);
        System.out.println("The average of these five numbers is " + result);
    }

    /**
     * prompts a user for a number and returns it
     *
     * @param message a message to display to the user as a prompt
     * @return the value of the number that the user inputs
     */
    public static double promptUser(String message) {
        Scanner input = new Scanner(System.in);
        System.out.print(message);
        return input.nextDouble();
    }

    /**
     * Iterates over the array to calculate the average
     *
     * @param array of numbers
     * @return the average of the numbers in the array
     */
    public static double average(double[] array) {
        double total = 0.0;
        for (double number: array) {
            total += number;
        }
        return total / array.length;
    }
}
