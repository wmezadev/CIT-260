package wemf;

public class Main {

    /**
     * Write a short Java program that contains the following two methods:
     * 1) public static double celsiusToFahrenheit(double tempCelsius)
     * 2) public static double fahrenheitToCelsius(double tempFahrenheit)
     *
     * Your program should:
     * 1) Tell the user what the program does.
     * 2) Invoke the above two methods to compute and display the table shown below.
     * 3) Output a goodbye message.
     *
     * @param args
     */
    public static void main(String[] args) {
        double initCelsius = 40.0;
        double initFahrenheit = 120;

        final double celsiusDecrease = 1.0;
        final double fahrenheitDecrease = 10;
        final int rows = 10;

        System.out.println("Celsius\t\tFahrenheit\t|\tFahrenheit\t\tCelsius");
        System.out.println("---------------------------------------------------");
        for (int i = 0; i < rows; i++) {
            double convertedFahrenheit = celsiusToFahrenheit(initCelsius);
            double convertedCelsius = fahrenheitToCelsius(initFahrenheit);
            System.out.format("%.1f\t\t%.1f\t\t|\t%.1f\t\t\t%.2f\n", initCelsius, convertedFahrenheit, initFahrenheit, convertedCelsius);
            initCelsius -= celsiusDecrease;
            initFahrenheit -= fahrenheitDecrease;
        }
        System.out.println("\nGoodbye");
    }


    /**
     * Converts a celsius temperature to a fahrenheit temperature
     *
     * @param tempCelsius the celsius temperature to convert
     * @return fahrenheit equivalent
     */
    public static double celsiusToFahrenheit(double tempCelsius) {
        return tempCelsius * (9.0 /5.0) + 32;
    }

    /**
     * Converts a fahrenheit temperature to a celsius temperature
     *
     * @param tempFahrenheit
     * @return celsius equivalent
     */
    public static double fahrenheitToCelsius(double tempFahrenheit) {
        return (tempFahrenheit - 32)/(9.0/5.0);
    }

}
