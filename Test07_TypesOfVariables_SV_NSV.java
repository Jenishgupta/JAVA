//Example.java
class Example {
	//static variables
	static int a = 10;
	static int b = 20;
	
	//non-static variables
	int x = 30;
	int y = 40;
}

//Test07_TypesOfVariables_SV_NSV.java 
class Test07_TypesOfVariables_SV_NSV {
	public static void main(String[] args) {
		
		Example e1 = new Example();
		Example e2 = new Example();
		
		System.out.println( e1.a + " " + e1.b + " " + e1.x  + " " + e1.y );
		System.out.println( e2.a + " " + e2.b + " " + e2.x  + " " + e2.y );
		System.out.println();
		
		e1.a = 15;		e1.b = 16;
		e1.x = 17;		e1.y = 18;
		
		System.out.println( e1.a + " " + e1.b + " " + e1.x  + " " + e1.y );
		System.out.println( e2.a + " " + e2.b + " " + e2.x  + " " + e2.y );
		System.out.println();
	}
}
