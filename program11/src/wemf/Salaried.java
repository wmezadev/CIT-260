package wemf;

public class Salaried extends Employee{

    private double annualSalary;

    public Salaried() {
        super();
        this.setAnnualSalary(0.0);
    }

    public Salaried(String name, int serialNumber, double annualSalary) {
        super(name, serialNumber);
        this.setAnnualSalary(annualSalary);
    }

    public double getAnnualSalary() {
        return annualSalary;
    }

    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
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
    public double getGrossPay() {
        final double weeksInAYear = 52;
        return this.getAnnualSalary() / weeksInAYear;
    }
}
