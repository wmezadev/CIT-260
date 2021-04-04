package wemf;

import java.util.Scanner;

public class Main {

    /**
     * Write a short Java program that does the following:
     * 1)  Tells the user what the program does.
     * 2)  Prompts the user to enter their first and last name.
     * 3)  Gets the user's input and saves it as a String.
     * 4)  Prompts the user to enter the number of hours they worked this week.
     * 5)  Gets the user's input and saves it.
     * 6)  Prompts the user to enter their hourly wage.
     * 7)  Get's the user's input and saves it.
     * 8)  Calculates the state withholding tax (9%) and the federal withholding
     *     tax (20%).
     * 9)  Calculates the gross pay and the net pay after subtracting the
     *     withholding taxes.
     * 10) Outputs a pay statement as shown in the example below.
     * 11) Outputs a goodbye message.
     *
     * @param args
     */
    public static void main(String[] args) {
        // Display intro
        System.out.println("Given your name, hours worked, and hourly wage, this program calculates your");
        System.out.println("gross pay, state withholding tax, federal withholding tax, and your net pay.");
        System.out.println("It then displays your pay stub.");
        // Prompt user
        Scanner inputFullName = promptUser("Enter your first and last name");
        User user = new User(inputFullName.next(), inputFullName.next());
        // Prompt hours and wage
        float hours = promptFloat("Enter the hours you worked this week");
        float wage = promptFloat("Enter your hourly wage");

        displayReceipt(user, hours, wage);
        System.out.println("Goodbye.");
    }

    /**
     * prompts the user for a number using the message that has been supplied
     *
     * @param message the message to show the user
     * @return the number inputted by the user as a response
     */
    public static float promptFloat(String message){
        Scanner input = new Scanner(System.in);
        System.out.print(message + ": ");
        return input.nextFloat();
    }

    /**
     * prompts the user for their name
     *
     * @param message the message to show the user
     * @return a Scanner input with the full user name
     */
    public static Scanner promptUser(String message){
        Scanner input = new Scanner(System.in);
        System.out.print(message + ": ");
        return input;
    }

    /**
     *  Displays the itemized list of deductions from the pay
     *
     * @param user the user
     * @param hours the total hours worked
     * @param wage the hourly wage
     */
    public static void displayReceipt(User user, float hours, float wage) {
        final float stateTaxFactor = 0.09f; // 9% State tax
        final float federalTaxFactor = 0.2f; // 20% Federal Tax
        float grossPay = hours * wage;
        float stateTaxWithheld = grossPay * stateTaxFactor;
        float federalTaxWithheld = grossPay * federalTaxFactor;
        float netPay = grossPay - stateTaxWithheld - federalTaxWithheld;

        System.out.format("\nPay Stub for %s\n", user.getFullName());
        System.out.format("Hourly Wage: $%.2f\n", wage);
        System.out.format("Gross Pay: $%.2f\n", grossPay);
        System.out.format("State Tax Withheld: $%.2f\n", stateTaxWithheld);
        System.out.format("Federal Tax Withheld: $%.2f\n", federalTaxWithheld);
        System.out.format("Net Pay: $%.2f\n\n", netPay);
    }


}
