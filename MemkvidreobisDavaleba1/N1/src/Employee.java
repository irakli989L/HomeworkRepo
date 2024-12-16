public class Employee extends Person{
    private String employeeID;

    public Employee(String name, String surname, int age, String employeeID) {
        super(name, surname, age);
        this.employeeID = employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public String getEmployeeID() {
        return employeeID;
    }
}
