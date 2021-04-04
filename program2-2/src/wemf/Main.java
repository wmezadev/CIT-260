package wemf;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Given the price of a meal and a percentage to use for the tip,");
        System.out.println("this program calculates the tip, the tax, and the total amount of the bill.");
        double bill = promptDouble("Enter the cost of the meal: ");
        double tipPercent = promptDouble("Enter the tip percentage: ");

        double tipAmount = calculateTip(bill, tipPercent);
        double taxAmount = calculateTax(bill);
        double total = calculateTotal(bill, tipAmount, taxAmount);

        System.out.println("\nThe tip is $" + String.format("%.2f", tipAmount));
        System.out.println("The tax is $" + String.format("%.2f", taxAmount));
        System.out.println("The total bill is $" + String.format("%.2f", total));
        System.out.println("Goodbye.");

    }

    public static double promptDouble(String message){
        Scanner input = new Scanner(System.in);
        System.out.print(message);
        return input.nextDouble();
    }

    public static double calculateTip(double bill, double tip){
        double percent = tip / 100.0;
        return bill * percent;
    }

    public static double calculateTax(double bill){
        return bill * 0.032;
    }

    public static double calculateTotal(double bill, double tip, double tax){
        return bill + tip + tax;
    }

}
