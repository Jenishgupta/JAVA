class Studentget2 {

	private int sno;
	private String sname;

	void setSno(int sno){
		this.sno = sno;
	}

	int getSno(){
		return sno;
	}

	void setSname(String sname){
         this.sname = sname;
	}

	String getSname(){
		return sname;
	}

	public void display(){
		System.out.println(sno + "  " + sname);
	}
}
class Collegeget2 {
	public static void main(String[] args) {

		Studentget2 s1 = new Studentget2();
		System.out.println("s1 object is created");
		s1.display();

		s1.setSno(101);
		s1.setSname("HK");
		
		System.out.println("\ns1 object values");
		System.out.println("  sno\t\t: "		+ s1.getSno());
		System.out.println("  sname\t\t: "		+ s1.getSname());
	}
}
