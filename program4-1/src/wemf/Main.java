package wemf;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Main {

    /**
     * Write a short Java program that does the following:
     * 1) Tells the user what the program does.
     * 2) Prompts the user to enter a single hexadecimal digit.
     * 3) Gets the user's input and saves it. If the value is not a valid
     *    hexadecimal digit tell the user and terminate the program.
     * 4) Converts the hexadecimal digit into a four digit binary number.
     *    You may not use any of the conversion methods built into Java, such
     *    as toBinaryString( ), to do this.
     * 5) Outputs the four digit binary number, including any leading zeros.
     * 6) Outputs a goodbye message.
     *
     * @param args
     */
    public static void main(String[] args) {
        // Display introduction and prompt
	    System.out.println("This program converts a hexadecimal digit into a four digit binary number.");
        System.out.print("Enter a hexadecimal number: ");
        Scanner input = new Scanner(System.in);
        String hexString = input.next();
        // Check if user input is a valid hexadecimal digit, and no more than 1 character
        if (hexString.length() != 1 || !isHexadecimal(hexString)) {
            System.out.println("\n" + hexString + " is not a valid hexadecimal digit.");
        }
        // print result
        else {
            System.out.println("\nThe binary value is " + hexTo4Binary(hexString) + ".");
        }
        System.out.println("Goodbye.");
    }

    /**
     * Determines whether or not a string is a valid hexadecimal number
     *
     * @param hexString the String to be evaluated
     * @return boolean of whether or not the String is a valid hex
     */
    public static boolean isHexadecimal(String hexString) {
        // Regex pattern for a Hexadecimal value
        final String hexPattern = "^[0-9A-Fa-f]+$";
        Pattern pattern = Pattern.compile(hexPattern);
        Matcher matcher = pattern.matcher(hexString);
        return matcher.matches();
    }

    /**
     * Converts a string hexadecimal value into an integer
     *
     * @param hexString the hexadecimal that should be converted to a decimal
     * @return the decimal number equivalent of the hexadecimal number
     */
    public static int hexToDecimal (String hexString) {
        // allowed hexadecimal digits or characters
        final String hexDigits = "0123456789ABCDEF";
        hexString = hexString.toUpperCase();
        int value = 0;
        for (int i = 0; i < hexString.length(); i++) {
            char c = hexString.charAt(i);
            int d = hexDigits.indexOf(c);
            value = 16 * value + d;
        }
        return value;
    }

    /**
     * Converts a string hexadecimal value into an 4 digits binary string
     *
     * @param hexString the hexadecimal that should be converted to binary string
     * @return the 4 digits binary string equivalent of the hexadecimal number
     */
    public static String hexTo4Binary (String hexString) {
        final int decimalValue = hexToDecimal(hexString);
        String binary = Integer.toBinaryString(decimalValue);
        return String.format("%4s", binary).replace(" ", "0");
    }

}
