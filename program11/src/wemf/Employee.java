package wemf;

public class Employee {

    private String name;
    private int serialNumber;

    public Employee() {
        this.setName("none");
        this.setSerialNumber(0);
    }

    public Employee(String name, int serialNumber) {
        this.setName(name);
        this.setSerialNumber(serialNumber);
    }

    public String getName(){
        return this.name;
    }

    public int getSerialNumber() {
        return this.serialNumber;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public double getGrossPay() {
        return 0;
    };

    public double getFedWithholding(){
        return 0;
    }

    public double getStateWithholding(){
        return 0;
    }
}
