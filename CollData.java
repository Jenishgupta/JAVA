class Student {
    int sno;
    String sname;
    String course;
    double fee;
}

class College {
    void displayStudent() {
        Student s1 = new Student();
        s1.sno = 101;
        s1.sname = "HK";
        s1.course = "CoreJava";
        s1.fee = 3000;
		
		System.out.println("S1 Object Values");
        System.out.println("Sno:-" + s1.sno);
		System.out.println("Sname:-" + s1.sname);
		System.out.println("Course:-" + s1.course);
		System.out.println("Fee:-" + s1.fee);
    }

    Student getStudent() {
		System.out.println();
        Student s2 = new Student();
        s2.sno = 102;
        s2.sname = "BK";
        s2.course = "Acting";
        s2.fee = 3500;

        return s2;
    }
}

public class CollData {
    public static void main(String[] args) {
        College clg = new College();

        clg.displayStudent();
		
        Student s3 = clg.getStudent();
		
        System.out.println("s2 Object Values");
		System.out.println("Sno:-" + s3.sno);
		System.out.println("Sname:-" + s3.sname);
		System.out.println("Course:-" + s3.course);
		System.out.println("Fee:-" + s3.fee);

        
    }
}
