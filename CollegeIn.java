import java.util.Scanner;

class Student {
    int sno;
    String sname;
    String course;
    double fee;
    String email;
    long mobile;
    char gender;
    boolean studyingStatus;
}

public class CollegeIn {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Student st = new Student();

        System.out.print("Enter student number: ");
        st.sno = scn.nextInt();
        scn.nextLine(); // consume leftover newline

        System.out.print("Enter student name: ");
        st.sname = scn.nextLine();

        System.out.print("Enter course name: ");
        st.course = scn.nextLine();

        System.out.print("Enter course fee: ");
        st.fee = scn.nextDouble();
        scn.nextLine();

        System.out.print("Enter email: ");
        st.email = scn.nextLine();

        System.out.print("Enter mobile number: ");
        st.mobile = scn.nextLong();
        scn.nextLine();

        System.out.print("Enter gender (M/F): ");
        st.gender = scn.next().charAt(0);

        System.out.print("Is the student currently studying? (true/false): ");
        st.studyingStatus = scn.nextBoolean();

        // Display the  printing details
        System.out.println("\n=== Student Details ===");
        System.out.println("Student No.     : " + st.sno);
        System.out.println("Name            : " + st.sname);
        System.out.println("Course          : " + st.course);
        System.out.println("Fee             : " + st.fee);
        System.out.println("Email           : " + st.email);
        System.out.println("Mobile          : " + st.mobile);
        System.out.println("Gender          : " + st.gender);
        System.out.println("Studying Status : " + st.studyingStatus);

        scn.close();
    }
}
