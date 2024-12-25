package N4;

public class DailySalaryEmployee extends Employee{
    private int days;
    private double dailyIncome;

    public DailySalaryEmployee(String name, String surname, String phoneNumber, int days, double dailyIncome) {
        super(name, surname, phoneNumber);
        this.days = days;
        this.dailyIncome = dailyIncome;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public double getDailyIncome() {
        return dailyIncome;
    }

    public void setDailyIncome(double dailyIncome) {
        this.dailyIncome = dailyIncome;
    }


    @Override
    public double calculateIncome(){
        return dailyIncome*days;
    }

    @Override
    public void printData(){
        super.printData();
        System.out.println("Daily income: $"+dailyIncome);
        System.out.println("Days worked: "+days);
        System.out.println("Total income: $"+calculateIncome());
    }
}
