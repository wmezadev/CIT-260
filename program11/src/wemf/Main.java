package wemf;

import java.util.ArrayList;
import java.util.List;

public class Main {

    /**
     * Your main( ) method should do the following:
     * 1) Tells the user what the program does.
     * 2) Creates an ArrayList<Employee>.
     * 3) Create instances for the following employees and add them to the
     *    ArrayList:
     *       - Hourly employee Harry Hacker, serial number 123. Harry earns
     *         $15.00 and hour and works 30 hours a week.
     *       - Hourly employee Isabel Intern, serial number 233. Isabel earns
     *         $12.50 and hour and works 20 hours a week.
     *       - Salaried employee Cathy Coder, serial number 611. Cathy earns
     *         $80,000 a year.
     * 7) Using an appropriate loop to go through the Employees in the ArrayList,
     *    print out a payroll report as shown in the following diagram:
     * 8) Display a goodbye message.
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("This program shows some employees and their payroll information.\n");


        List<Employee> employees = new ArrayList<Employee>();
        employees.add(new Hourly("Harry Hacker", 123, 15.0, 30));
        employees.add(new Hourly("Isabel Intern", 233, 12.50, 20));
        employees.add(new Salaried("Cathy Coder", 611, 80000));

        System.out.println("Payroll Report");
        for (Employee employee : employees) {
            System.out.format("Employee: %s Serial: %d\n", employee.getName(), employee.getSerialNumber());
            System.out.format("Gross Pay: $%,.2f\n", employee.getGrossPay());
            System.out.format("Federal Withholding: $%,.2f\n", employee.getFedWithholding());
            System.out.format("State Withholding: $%,.2f\n", employee.getStateWithholding());
            System.out.format("Net Pay: $%,.2f\n", employee.getGrossPay() - employee.getFedWithholding() - employee.getStateWithholding());
            System.out.println();
        }

        System.out.println("\nGoodbye...");
    }
}
