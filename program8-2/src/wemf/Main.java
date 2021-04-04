package wemf;

import java.util.Date;

public class Main {

    /**
     * Tells the user what the program does.
     * Using the Date class (described in section 9.6.1 of the textbook) Create a Date object and set it's elapsed time to 10000, 100000, 1000000, 10000000, 100000000, 1000000000, and 10000000000 and displays the data and time using the toString( ) method, respectively.
     * Display a goodbye message.
     *
     * @param args
     */
    public static void main(String[] args) {
	// write your code here
        System.out.println("This program uses the Date class to display a set of dates and times.\n");

        final long initElapsedTime = 10000;
        final long maxElapsedTime = initElapsedTime * 1000000; // to long integer

        for (long elapsedTime = initElapsedTime; elapsedTime <= maxElapsedTime; elapsedTime=elapsedTime*10) {
            Date date = new Date();
            date.setTime(elapsedTime);
            System.out.println(date.toString());
        }

        System.out.println("\nGoodbye ...");
    }
}
