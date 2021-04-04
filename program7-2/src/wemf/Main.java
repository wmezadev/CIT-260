package wemf;

import java.util.Scanner;

public class Main {

    /**
     *
     * Now write a main( ) method that does the following:
     *
     *  1) Tells the use what the program does.
     *  2) Prompts the user to enter five numbers.
     *  3) Saves the user's input in an array of doubles.
     *  4) Uses the methods above to compute the mean and the standard deviation for the numbers in the array.
     *  5) Displays the mean and the standard deviation with 2 digits after the decimal point.
     *  6) Displays a goodbye message.
     *  7) Your file should have the proper file prologue, and each method should have the proper method prologue.
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
        System.out.println("The mean of this set of numbers is " + String.format("%.2f", mean(arrayNumbers)));
        System.out.println("The standard deviation is " + String.format("%.2f", deviation(arrayNumbers)));
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
     * Iterates over the array to calculate the mean (average)
     *
     * @param x is an array of numbers
     * @return the average of the numbers in the array
     */
    public static double mean(double[ ] x) {
        double total = 0.0;
        for (double number: x) {
            total += number;
        }
        return total / x.length;
    }

    /**
     * Calculates the standard deviation from an array of numbers
     *
     * @param x is an array of numbers
     * @return the standard deviation for given array
     */
    public static double deviation(double[ ] x) {
        // Step 1. Work out the mean
        double meanValue = mean(x);
        // Step 2. Then for each number: subtract the Mean and square the result
        double xiSum = 0.0;
        for (double number : x) { // for each value, subtract the mean and square the result
            // Step 3. Then work out the mean of those squared differences.
            xiSum += Math.pow(number - meanValue, 2);
        }
        double variance = xiSum / (x.length - 1); // divide by how many, which is done by multiplying by 1/N-1
        // Step 4. Take the square root of that:
        return Math.sqrt(variance);
    }
}
