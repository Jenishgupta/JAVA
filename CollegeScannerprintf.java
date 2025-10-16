/* Develop a program to read student values from command line
store those values in the Student class object, and read
those values from Student object (printf) on console using Scanner and one class
Must read 
   sno, sname, course, fee, email, mobile, 
   gender and studyingStatus */
   
import java.util.Scanner;   
class  CollegeScannerprintf
{
	public static void main(String[] args) 
	{
		Scanner scn = new Scanner(System.in);
		Student st = new Student();
		String width = "-20";
		
		System.out.println("=== Enter Student Details ===");
		System.out.printf(" %"+width+"s: ", "Enter sno.");
		st.sno	= scn.nextInt();  
		scn.nextLine();
		
		System.out.printf(" %"+width+"s: ", "Enter ename: ");
		st.sname = scn.nextLine();
		
		System.out.printf(" %"+width+"s: ", "Enter course name: ");
        st.course = scn.nextLine();

        System.out.printf(" %"+width+"s: ", "Enter course fee: ");
        st.fee = scn.nextDouble();
        scn.nextLine();

        System.out.printf(" %"+width+"s: ", "Enter email: ");
        st.email = scn.nextLine();

        System.out.printf(" %"+width+"s: ", "Enter mobile number: ");
        st.mobile = scn.nextLong();
        scn.nextLine();

        System.out.printf(" %"+width+"s: ", "Enter gender (M/F): ");
        st.gender = scn.next().charAt(0);

        System.out.printf(" %"+width+"s: ", "studyingStatus? (true/false): ");
        st.studyingStatus = scn.nextBoolean();
		
		// Display the  printing details
        System.out.println("\n=== Student Details ===");
        System.out.printf(" %"+width+"s: %d\n","Student no.", st.sno);
        System.out.printf(" %"+width+"s: %s\n","Name: " , st.sname);
        System.out.printf(" %"+width+"s: %s\n","Course: " , st.course);
        System.out.printf(" %"+width+"s: %.2f\n","Fee: " , st.fee);
        System.out.printf(" %"+width+"s: %s\n","Email: " , st.email);
        System.out.printf(" %"+width+"s: %d\n","Mobile: " , st.mobile);
        System.out.printf(" %"+width+"s: %c\n","Gender: " , st.gender);
        System.out.printf(" %"+width+"s: %b\n","Studying Status: " , st.studyingStatus);

        scn.close();
		
	}
}
