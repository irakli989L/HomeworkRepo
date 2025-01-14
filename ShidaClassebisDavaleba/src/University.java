public class University {
    private String name;
    private boolean isStateUniversity;
    private int numberOfFaculties;

    public University(String name, boolean isStateUniversity, int numberOfFaculties) {
        this.name = name;
        this.isStateUniversity = isStateUniversity;
        this.numberOfFaculties = numberOfFaculties;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isStateUniversity() {
        return isStateUniversity;
    }

    public void setStateUniversity(boolean stateUniversity) {
        isStateUniversity = stateUniversity;
    }

    public int getNumberOfFaculties() {
        return numberOfFaculties;
    }

    public void setNumberOfFaculties(int numberOfFaculties) {
        this.numberOfFaculties = numberOfFaculties;
    }

    public void printInfo() {
        System.out.println("University Name: "+name);
        System.out.println("State University: "+(isStateUniversity ? "Yes" : "No"));
        System.out.println("Number of Faculties: "+numberOfFaculties);
    }

    public class Student {
        private String name;
        private String surname;
        private String personalNumber;
        private String course;
        private int age;
        private double gpa;

        public Student(String firstName, String lastName, int age, String personalNumber, double averageScore, String course) {
            this.name = firstName;
            this.surname = lastName;
            this.age = age;
            this.personalNumber = personalNumber;
            this.gpa = averageScore;
            this.course = course;
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

        public String getPersonalNumber() {
            return personalNumber;
        }

        public void setPersonalNumber(String personalNumber) {
            this.personalNumber = personalNumber;
        }

        public String getCourse() {
            return course;
        }

        public void setCourse(String course) {
            this.course = course;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public double getGpa() {
            return gpa;
        }

        public void setGpa(double gpa) {
            this.gpa = gpa;
        }

        public void printInfo() {
            System.out.println("Student Name: " + name + " " + surname);
            System.out.println("Age: " + age);
            System.out.println("Personal Number: " + personalNumber);
            System.out.println("Average Score (GPA): " + gpa);
            System.out.println("Course: " + course);
        }
    }
}
