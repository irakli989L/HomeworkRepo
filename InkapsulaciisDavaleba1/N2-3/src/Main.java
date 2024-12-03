import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Student[] arr = new Student[5];

        for (int i = 0; i<5; i++) {
            System.out.println("Enter details for Student " + (i + 1));

            Student student = new Student();

            System.out.print("Enter name: ");
            student.setName(scanner.nextLine());

            System.out.print("Enter surname: ");
            student.setSurname(scanner.nextLine());

            System.out.print("Enter age: ");
            student.setAge(scanner.nextInt());

            System.out.print("Enter course: ");
            student.setCourse(scanner.nextInt());

            System.out.print("Enter GPA: ");
            student.setGpa(scanner.nextDouble());

            scanner.nextLine();

            arr[i] = student;
        }

        System.out.println("Student with highest GPA is: "+highestGpa(arr));
    }

    // N3

    public static String highestGpa(Student[] arr){
        int ind = 0;

        for(int i = 1; i<5; i++){
            if(arr[i].getGpa()>arr[ind].getGpa()) ind = i;
        }

        return arr[ind].getName() + " " + arr[ind].getSurname();
    }
}