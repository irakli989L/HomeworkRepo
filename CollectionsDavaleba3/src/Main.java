import java.util.*;

public class Main {
    public static void main(String[] args) {
        // N1

        ArrayList<BasketballPlayer> players = new ArrayList<>();
        players.add(new BasketballPlayer("LeBron", "James", 30, 10, 5, 7, 3));
        players.add(new BasketballPlayer("Stephen", "Curry", 35, 4, 2, 10, 2));
        players.add(new BasketballPlayer("Goga", "Bitadze", 25, 12, 6, 5, 4)); // did him dirty

        players.sort(Comparator.comparingDouble(BasketballPlayer::getRating).reversed());
        System.out.println("Basketball Players (Descending): " + players);
        Collections.reverse(players);
        System.out.println("Basketball Players (Ascending): " + players);

        System.out.println("\n\n---------------------\n\n");


        // N2

        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Nikoloz", "Gogoberishvili", new GregorianCalendar(2005, Calendar.JANUARY, 2).getTime(), new ArrayList<>(Arrays.asList(3.4, 3.9, 3.5))));
        students.add(new Student("Irakli", "Kakabadze", new GregorianCalendar(2004, Calendar.APRIL, 1).getTime(), new ArrayList<>(Arrays.asList(3.8, 4.0, 3.9))));
        students.add(new Student("Vassiღ", "Mildiani", new GregorianCalendar(2006, Calendar.NOVEMBER, 26).getTime(), new ArrayList<>(Arrays.asList(3.2, 3.7, 3.6))));

        System.out.println("Students (Unsorted): " + students);
        students.sort(Comparator.comparing(Student::getLastName));
        System.out.println("Students (Lexically Sorted): " + students);
        students.sort(Comparator.comparingDouble(Student::getGPA).reversed());
        System.out.println("Students (Sorted by GPA): " + students);
        students.sort(Comparator.comparing(Student::getBirthDate));
        System.out.println("Students (Sorted by DOB): " + students);

        System.out.println("\n\n---------------------\n\n");


        // N3

        ArrayList<Car> cars = new ArrayList<>();
        cars.add(new Car("Ferrari", "488 GTB", 2019, 15000, new Engine("Gasoline", 8, 3.9)));
        cars.add(new Car("Lamborghini", "Huracan", 2021, 12000, new Engine("Gasoline", 10, 5.2)));
        cars.add(new Car("Porsche", "911 Turbo S", 2020, 18000, new Engine("Gasoline", 6, 3.8)));

        System.out.println("Cars (Unsorted):\n");
        cars.forEach(System.out::println);
        System.out.println();

        cars.sort(Comparator.comparingInt(Car::getYear));
        System.out.println("Cars (Sorted by Year):\n");
        cars.forEach(System.out::println);
        System.out.println();

        cars.sort(Comparator.comparingInt(Car::getMileage));
        System.out.println("Cars (Sorted by Mileage):\n");
        cars.forEach(System.out::println);
        System.out.println();

        cars.sort(Comparator.comparingDouble(car -> car.getEngine().getDisplacement()));
        System.out.println("Cars (Sorted by Engine Displacement):\n");
        cars.forEach(System.out::println);
    }
}