package wemf;

public class Main {

    /**
     * Write a short Java program that does the following:
     *
     * 1) Tells the user what the program does.
     * 2) Uses a loop to calculate pounds per kilogram (1 kilogram = 2.2 pounds) and display the following table.
     * 3) Outputs a goodbye message.
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("This Program displays a table of kilogram to punds conversions.\n");
        System.out.println("kilograms\tpounds");
        System.out.println("---------\t------");
        final int kiloLimit = 15;
        final float lbsPerKilo = 2.2f;
        for (int kilo = 1; kilo <= kiloLimit; kilo+=2){
            float lbs = kilo * lbsPerKilo;
            System.out.format("%d\t\t\t%.1f\n", kilo, lbs);
        }
        System.out.println("\nGoodbye.");
    }
}
