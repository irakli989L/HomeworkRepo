import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // N1

        List<Integer> numbers = Arrays.asList(5, 10, 15, 20, 25, 3, 8);
        int sum = numbers.stream()
                .filter(n -> n >= 10)
                .map(n -> n * n)
                .reduce(0, Integer::sum);

        System.out.println("Sum of squared numbers >= 10: " + sum);


        // N2

        List<String> words = Arrays.asList("Java", "Python", "JavaScript", "C++", "C#");
        List<String> filteredWords = words.stream()
                .filter(s -> s.startsWith("J"))
                .map(String::toUpperCase)
                .toList();

        System.out.println("Words that start with J (Uppercase): " + filteredWords);


        // N3

        List<String> wordsToSort = Arrays.asList("banana", "apple", "grape", "orange", "kiwi");
        List<String> sortedWords = wordsToSort.stream()
                .sorted()
                .toList();

        System.out.println("Sorted words stored in a list: " + sortedWords);


        // N4

        List<Human> humans = Arrays.asList(
                new Human("Levani", 16),
                new Human("David", 14),
                new Human("Nina", 20),
                new Human("Levani", 10)
        );
        List<Human> filteredHumans = humans.stream()
                .filter(h -> h.getAge() >= 15)
                .toList();
        boolean hasLevani = !filteredHumans.isEmpty() && filteredHumans.stream().map(Human::getName).toList().contains("Levani");

        System.out.println(hasLevani);


        // N5

        List<Integer> nums = Arrays.asList(5, 10, 15, 20, 25, 3, 8);
        List<Integer> sortedNums = nums.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .toList();
        Integer secondLargest = sortedNums.size() > 1 ? sortedNums.get(1) : null;
        System.out.println("Second largest number: " + secondLargest);
    }
}