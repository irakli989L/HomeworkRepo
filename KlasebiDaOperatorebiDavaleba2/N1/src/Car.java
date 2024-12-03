public class Car {
    private String name;
    private String model;
    private int year;
    private String carNumber;

    void setName(String name){
        this.name = name;
    }
    void setModel(String model){
        this.model= model;
    }
    void setYear(int year){
        this.year=year;
    }
    void setCarNumber(String carNumber){
        this.carNumber = carNumber;
    }


    public void printInfo(){
        System.out.println("Car name: "+name);
        System.out.println("Car model: "+model);
        System.out.println("Car year: "+year);
        System.out.println("Car Number: "+carNumber);
    }
}
