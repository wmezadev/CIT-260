package wemf;

public class Main {

    /**
     * Write a short Java program that does the following:
     *
     * 1) Tells the user what the program does.
     * 2) Uses a loop to display a table of all of the numbers from 100 to 1000
     *    that are divisible by both 5 and 6. The numbers must be separated by
     *    exactly one space and there must be 10 numbers per line.
     * 3) Displays a goodbye message.
     *
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("This program displays all of the numbers from 100 to 1000");
        System.out.println("that are divisible by both 5 and 6.\n");
        final int numbersPerLine = 10;
        final int startNumber = 100;
        final int maxNumber = 1000;
        int displayedNumbers = 0;
        for (int number = startNumber; number < maxNumber; number++) {
            if (number % 5 == 0 && number % 6 == 0) {
                System.out.print(number + " ");
                displayedNumbers++;
                if (displayedNumbers == numbersPerLine) {
                    System.out.print("\n");
                    displayedNumbers = 0;
                }
            }
        }
        System.out.println("\nGoodbye.");
    }
}
