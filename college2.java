class Student {
    int sno;
    String sname;
    String course;
    double fee;
	
	void display() {
		System.out.println(sno);
		System.out.println(sname);
		System.out.println(course);
		System.out.println(fee);
		System.out.println("---------------------------");
	}
}
class college2 {
	public static void main(String[] args) {
		Student s1 = new Student();
		Student s2 = new Student();
		
		s1.sno = 101;
		s1.sname = "HK";
		s1.course = "Core Java";
		s1.fee = 3500;
			
		s2.sno = 102;
		s2.sname = "BK";
		s2.course = "Acting";
		s2.fee = 4000;
		
		s1.display();
		s2.display();
	}
}
