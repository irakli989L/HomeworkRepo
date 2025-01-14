public class Main {
    public static void main(String[] args) {
        // N1

//        University university = new University("Stanford University", false, 48);
//        University.Student student = university.new Student("Irakli", "Kakabadze", 20, "1234567", 3.8, "Computer Science");
//        university.printInfo();
//        System.out.println();
//        student.printInfo();


        // N2

//        Car[] cars = new Car[3];
//
//        cars[0] = new Car("Ferrari", "SF90 Stradale", "SUP123", "Petrol", 8, 12.5);
//        cars[1] = new Car("Lamborghini", "Aventador", "SUP456", "Petrol", 12, 9.1);
//        cars[2] = new Car("Bugatti", "Chiron", "SUP789", "Petrol", 16, 8.6);
//
//        Car maxResourceCar = cars[0];
//        for (Car car : cars) {
//            if (car.getEngine().getResource() > maxResourceCar.getEngine().getResource()) {
//                maxResourceCar = car;
//            }
//        }
//
//        System.out.println("Car with maximum resource: ");
//        System.out.println();
//        maxResourceCar.printInfo();


        // N3

//        Computer computer = new Computer("USA", "Dell", 1500.00, true,
//                27, "1920x1080", 144,
//                4, "DDR4", 3200);
//
//        computer.printInfo();


        // N4

//        Notification smsNotification = new Notification("Stanford University", "Irakli", "You have been accepted!") {
//            @Override
//            public void send() {
//                System.out.println("Sending SMS...");
//                System.out.println("From: " + sender);
//                System.out.println("To: " + receiver);
//                System.out.println("Message: " + messageText);
//            }
//
//            @Override
//            public void receive() {
//                System.out.println("Receiving SMS...");
//                System.out.println("Message received by: " + receiver);
//            }
//        };
//
//        smsNotification.send();
//        smsNotification.receive();


        // N5

        Library library = new Library(18, "State Library");
        library.printInfo();
    }
}