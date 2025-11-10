import java.util.Scanner;

class Student {
    int sno;
    String sname;
    String course;
    double fee;

    void display() {
        System.out.println("Student No: " + sno);
        System.out.println("Student Name: " + sname);
        System.out.println("Course: " + course);
        System.out.println("Fee: " + fee);
        System.out.println("---------------------------");
    }
}

class Collegescn2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = readInt(sc);

        Student[] students = new Student[n];

        for (int i = 0; i < n; i++) {
            students[i] = new Student();
            System.out.println("\nEnter details for student " + (i + 1) + ":");

            System.out.print("Enter Student No: ");
            students[i].sno = readInt(sc);

            System.out.print("Enter Student Name: ");
            students[i].sname = sc.nextLine();

            System.out.print("Enter Course: ");
            students[i].course = sc.nextLine();

            System.out.print("Enter Fee: ");
            students[i].fee = readDouble(sc);
        }

        System.out.println("\n----- Student Details -----");
        for (Student s : students) {
            s.display();
        }

        sc.close();
    }

    // Helper method to safely read integers
    private static int readInt(Scanner sc) {
        while (true) {
            try {
                int value = Integer.parseInt(sc.nextLine());
                return value;
            } catch (NumberFormatException e) {
                System.out.print("Invalid input! Please enter an integer: ");
            }
        }
    }

    // Helper method to safely read doubles
    private static double readDouble(Scanner sc) {
        while (true) {
            try {
                double value = Double.parseDouble(sc.nextLine());
                return value;
            } catch (NumberFormatException e) {
                System.out.print("Invalid input! Please enter a number: ");
            }
        }
    }
}
