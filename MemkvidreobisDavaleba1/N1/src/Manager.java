public class Manager extends Employee{
    private String managerId;

    public Manager(String name, String surname, int age, String employeeID, String managerId) {
        super(name, surname, age, employeeID);
        this.managerId = managerId;
    }

    public void setManagerId(String managerId) {
        this.managerId = managerId;
    }

    public String getManagerId() {
        return managerId;
    }
}
