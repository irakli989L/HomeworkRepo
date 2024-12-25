package N4;

public abstract class Employee {
    private String name;
    private String surname;
    private String phoneNumber;

    public Employee(String name, String surname, String phoneNumber) {
        this.name = name;
        this.surname = surname;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    public abstract double calculateIncome();

    public void printData() {
        System.out.println("Name: " + name + " " + surname);
        System.out.println("Phone: " + phoneNumber);
    }
}
