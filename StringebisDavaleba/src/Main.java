import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // N1

        System.out.print("Enter a string: ");
        String s1 = scanner.nextLine();

        int count = 0;

        for(int i = 0; i<s1.length(); i++){
            if(Character.isDigit(s1.charAt(i))){
                count++;
            }
        }

        System.out.println("Number of digits: "+count);


        // N2

        System.out.print("Enter a string: ");
        String s2 = scanner.nextLine();

        int scount = 0;

        boolean found = false;

        if(s2.contains(".") || s2.contains("?") || s2.contains(";") || s2.contains("!")) found = true;

        String[] sent = s2.split("[.?;!]");

        for (String sentence : sent) {
            if (!sentence.trim().isEmpty()) { // anu tu sheiqmna empty string eseigi es ori nishani gverdigverdaa
                scount++;
            }
        }

        System.out.println("Number of sentences: "+(found ? scount : scount - 1));


        // N3

        System.out.print("Enter a string: ");
        String s3 = scanner.nextLine();

        String ns3 = "";

        for (char c : s3.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                ns3 += Character.toLowerCase(c);
            }
        }
        boolean isPalindrome = true;
        int len = ns3.length();
        for (int i = 0; i < len / 2; i++) {
            if (ns3.charAt(i) != ns3.charAt(len - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }
        System.out.println(isPalindrome);


        // N4

        System.out.println("Enter two strings: ");
        String s41 = scanner.nextLine();
        String s42 = scanner.nextLine();

        System.out.println(s41.contains(s42));


        // N5

        System.out.print("Enter a string: ");
        String s5 = scanner.nextLine();

        boolean bool = false;

        char lastChar = s5.charAt(s5.length()-1);

        switch(Character.toLowerCase(lastChar)){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                bool = true;
                break;
            default:
                break;
        }

        System.out.println("Ends in "+ (bool ? "vowel" : "consonant"));


        // N6

        System.out.print("Enter a string: ");
        String s6 = scanner.nextLine();
        String original = "";

        for (int i = 0; i < s6.length(); i++) {
            if (i == 0 || s6.charAt(i) != s6.charAt(i - 1)) {
                original += s6.charAt(i);
            }
        }

        System.out.println(original);


        // N7

        System.out.print("Enter a word: ");
        String word = scanner.nextLine();

        if (word.length() <= 10) {
            System.out.println("The word is not huge.");
        } else {
            System.out.println("Abbreviation: " + word.charAt(0) + (word.length() - 2) + word.charAt(word.length() - 1));
        }

        scanner.close();
    }
}