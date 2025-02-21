import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Country[] countries = new Country[5];

        String file = "src/countries.txt";


        for (int i = 0; i < 5; i++) {
            System.out.println("Enter details for country " + (i + 1) + ":");
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Population: ");
            int population = scanner.nextInt();
            System.out.print("Area (sq km): ");
            double area = scanner.nextDouble();
            scanner.nextLine();

            countries[i] = new Country(name, population, area);
        }

        // Serialize
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file))) {
            oos.writeObject(countries);
            System.out.println("Countries successfully saved to file.");
        } catch (IOException e) {
            System.out.println("Error saving to file: " + e.getMessage());
        }

        // Deserialize
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
            Country[] loadedCountries = (Country[]) ois.readObject();
            System.out.println("\nCountries loaded from file:");
            for (Country country : loadedCountries) {
                System.out.println(country);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }

        scanner.close();
    }
}