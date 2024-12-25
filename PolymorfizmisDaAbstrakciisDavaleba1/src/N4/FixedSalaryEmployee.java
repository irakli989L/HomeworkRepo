package N4;

public class FixedSalaryEmployee extends Employee{
    private double income;

    public FixedSalaryEmployee(String name, String surname, String phoneNumber, double income) {
        super(name, surname, phoneNumber);
        this.income = income;
    }

    public double getIncome() {
        return income;
    }

    public void setIncome(double income) {
        this.income = income;
    }


    @Override
    public double calculateIncome(){
        return income;
    }

    @Override
    public void printData(){
        super.printData();
        System.out.println("Total income: $"+calculateIncome());
    }
}
