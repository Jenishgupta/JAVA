class Example {
	
	int x;
	int y;

	//no-param constructor
	Example() {
		x = 10;
		y = 20;
	}

	//param constructor
	Example(int x, int y) {
		this.x = x;
		this.y = y;
	}

	//copy constructor
	Example(Example e) {
		this.x = e.x;
		this.y = e.y;
	}

	public void display(){
		System.out.println(x + "  " + y);
	}
}	

class constructor {
	public static void main(String[] args) {
		Example e1 = new Example();	//creating object by calling NPC			
		e1.display();

		Example e2 = new Example(15, 16);	//creating object by calling PC	
		e2.display();

		System.out.println();

		e2.x = 45;	//modifying e2 object data
		e2.y = 55;

		Example e3 = new Example(e2);	//creating object by calling Copy Constructor	
		e2.display();					//this new object e3 data is same as			
		e3.display();					//e2 object data				
		System.out.println(e2 == e3);   //data is same but memory is different	
		System.out.println();
		
		Example e4 = e2;		//copying e2 object ref into e4				
		e2.display();			//both e4 and e2 pointing to same object					
		e4.display();			//here new object is not created					
		System.out.println(e2 == e4); 

/**/
	}
}