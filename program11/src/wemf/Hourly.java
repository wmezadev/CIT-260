package wemf;

public class Hourly extends Employee {

    private double hourlyWage;
    private double hoursWorked;

    public Hourly() {
        super();
        this.setHoursWorked(0.0);
        this.setHourlyWage(0.0);
    }

    public Hourly(String name, int serialNumber, double hourlyWage, double hoursWorked) {
        super(name, serialNumber);
        this.setHoursWorked(hoursWorked);
        this.setHourlyWage(hourlyWage);
    }

    public double getHourlyWage() {
        return hourlyWage;
    }

    public void setHourlyWage(double hourlyWage) {
        this.hourlyWage = hourlyWage;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double getFedWithholding(){
        final double federalTaxRate = 0.15; // 15%
        return this.getGrossPay() * federalTaxRate;
    }

    @Override
    public double getStateWithholding(){
        final double stateTaxRate = 0.07; // 7%
        return this.getGrossPay() * stateTaxRate;
    }

    @Override
    public double getGrossPay(){
        return this.getHourlyWage() * this.getHoursWorked();
    }
}
