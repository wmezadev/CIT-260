package wemf;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("This program converts a temperature in degrees Celsius into");
        System.out.println("a temperature in degrees Fahrenheit. Enter a temperature in");
        System.out.print("degrees Celsius: ");
        Scanner input = new Scanner(System.in);
        double celsius = input.nextDouble();
        double fahrenheit = (9.0 / 5.0) * celsius + 32.0;

        String celsiusOutput = String.format("%.2f", celsius);
        String fahrenheitOutput = String.format("%.2f", fahrenheit);
        System.out.println("\n" + celsiusOutput + " degrees Celsius is equal to " + fahrenheitOutput + " degrees Fahrenheit.");
        System.out.println("Goodbye.");
    }
}
