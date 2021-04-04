package wemf;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Given a year and a month in that year, this program will tell you");
        System.out.println("the number of days in that month.");
        int year = promptUser("Enter a year: ");
        int month = promptUser("Enter a value for the month(1 = Jan, 2 = Feb, etc): ");
        System.out.println();
        if (month<1 || month>12) {
            System.out.print(month);
            System.out.println(" is invalid. Month values must be between between 1 and 12, inclusive.");
        } else {
            int days = calculateDays(year, month);
            displayMonthDays(year, month, days);
        }
        System.out.println("Goodbye.");
    }

    public static int promptUser(String message) {
        Scanner input = new Scanner(System.in);
        System.out.print(message);
        return input.nextInt();
    }

    /**
     * https://www.mathsisfun.com/leap-years.html
     */
    public static boolean checkLeapYear(int year) {
        boolean isLeap = false;
        final int leapDivider = 4;
        final int leapDividerCentury = 400;
        final int leapDividerException = 100;

        if (year % leapDivider == 0) {
            if (year % leapDividerException == 0) {
                if (year % leapDividerCentury == 0) {
                    isLeap = true;
                } else {
                    isLeap = false;
                }
            } else {
                isLeap = true;
            }
        } else {
            isLeap = false;
        }
        return isLeap;
    }

    public static int calculateDays(int year, int month) {
        int februaryMonthNumber = 2;
        boolean isFebruary = month == februaryMonthNumber;
        if (isFebruary && checkLeapYear(year)) {
            return 29; // February exception
        }
        int[] monthLengths = {
            31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31
        };
        return monthLengths[month - 1];
    }

    public static void displayMonthDays(int year, int month, int days) {
        String[] months = {
            "January",
            "February",
            "March",
            "April",
            "May",
            "June",
            "July",
            "August",
            "September",
            "October",
            "November",
            "December"
        };
        String monthName = months[month - 1];
        System.out.format("%s of %d has %d days in it.\n", monthName, year, days);
    }

}
