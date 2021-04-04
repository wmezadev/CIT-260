package wemf;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Given today's day of the week and some number of days in the future");
        System.out.println("this program will tell you the day of the week for the future day.");
        int todayNum = promptUser("Enter today's day of the week (0 for Sunday, 1 for Monday, etc):");
        if (todayNum < 0 || todayNum > 6) {
            System.out.println("\n" + todayNum + " is invalid. You must enter a number between 0 and 6.");
            return;
        }
        int nextNum = promptUser("Enter the number of days in the future:");
        if (nextNum < 0) {
            System.out.println("\n" + nextNum + " is invalid. You must enter a positive number.");
            return;
        }
        displayDayChange(todayNum, nextNum);
        System.out.println("Goodbye.");
    }

    public static int promptUser(String message) {
        Scanner input = new Scanner(System.in);
        System.out.print(message + " ");
        return input.nextInt();
    }

    public static void displayDayChange(int todayNum, int nextNum) {
        String[] days = {
            "Sunday",
            "Monday",
            "Tuesday",
            "Wednesday",
            "Thursday",
            "Friday",
            "Saturday"
        };
        String today = days[todayNum];
        String futureDay = days[(todayNum + nextNum) % 7];
        System.out.println("Today is " + today + " and the future day is " + futureDay + ".");
    }
}
