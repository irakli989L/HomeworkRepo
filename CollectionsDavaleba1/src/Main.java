import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // N1

        ArrayList<Integer> numbers = new ArrayList<>();
        Random rand = new Random();
        while (true) {
            int num = rand.nextInt(51); // 51 excluded
            numbers.add(num);
            if (num == 40) break;
        }
        System.out.println("Length: " + numbers.size());
        System.out.println(numbers.toString().replace("[", "").replace("]", ""));  // moashoros []

        // Removing even elements
        ArrayList<Integer> oddNumbers = new ArrayList<>();
        for (int num : numbers) {
            if (num % 2 != 0) {
                oddNumbers.add(num);
            }
        }
        numbers = oddNumbers;
        System.out.println(numbers.toString().replace("[", "").replace("]", ""));


        // N2

        printNicely(numbers);


        // N3

        int[] arr = new int[5];
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            arr[i] = rand.nextInt(51);
            arrayList.add(arr[i]);
        }

        System.out.println("List: " + arrayList.toString().replace("[", "").replace("]", ""));

        int maxIndex = arrayList.indexOf(Collections.max(arrayList));
        System.out.println("Max number index: " + maxIndex);


        // N4

        Library library = new Library();
        library.populateList("src/books.txt");
        library.printBooks();
    }


    public static void printNicely(ArrayList<Integer> list) {
        System.out.print("List of { ");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
            if (i < list.size() - 1) System.out.print(", ");
        }
        System.out.println(" }");
    }
}