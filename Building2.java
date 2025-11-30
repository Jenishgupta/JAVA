class Building2 {
	public static void main(String[] args) {
		//Room2 r1 = new Room2();  //CE: c f s Room(), 
								//because compiler does not add default constructor

		Room2 r1 = new Room2(100, 50);

		System.out.println("r1 values");
		r1.display();

		System.out.println();
		r1.findArea();

		System.out.println();
		r1.setL(90);
		r1.setB(30);

		System.out.println("r1 changed values");
		r1.display();

		System.out.println();
		r1.findArea();

	}
}