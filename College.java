/* Develop a program to read student values from command line
store those values in the Student class object, and read
those values from Student object print on console 
Must read 
   sno, sname, course, fee, email, mobile, 
   gender and studyingStatus */

class Student {
	
	int	sno;
	String Name;
	String Course;
	double Fees;
	String Email;
	long Mobile;
	char Gender;
	boolean StudyingStatus;
}

class College  {
	public static void main(String[] args) {
		
		Student s1 = new Student ();
		
		s1.sno = Integer.parseInt(args[0]);
		s1.Name = args[1];
		s1.Course = args[2];
		s1.Fees = Double.parseDouble(args[3]);
		s1.Email = args[4];
		s1.Mobile = Long.parseLong(args[5]);
		s1.Gender = args[6].charAt(0);
		s1.StudyingStatus = Boolean.parseBoolean(args[7]);
		
		System.out.println("Student_Values");
		
		System.out.println("sno.:-\t\t" + s1.sno); // (\t - use for allign)
		System.out.println("Name:-\t\t" + s1.Name);
		System.out.println("Course:-\t" + s1.Course);
		System.out.println("Fees:-\t\t" + s1.Fees);
		System.out.println("Email:-\t\t" + s1.Email);
		System.out.println("Mobile:-\t" + s1.Mobile);
		System.out.println("Gender:-\t" + s1.Gender);
		System.out.println("StudyingStatus:-" + s1.StudyingStatus);
		
	}
}

/* CMD :-
javac College.java
java College 01 JENISH CoreJava 3500 jk@gmail.com 1234567890 M true
OUTPUT:-
Student_Values
sno.:-          1
Name:-          JENISH
Course:-        CoreJava
Fees:-          3500.0
Email:-         jk@gmail.com
Mobile:-        1234567890
Gender:-        M
StudyingStatus:-true
*/