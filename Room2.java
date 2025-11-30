public class Room2 {

	private double l;
	private double b;
	
	public Room2(double l, double b){
		this.l = l;
		this.b = b;
	}

	public void setL(double l){
		this.l = l;	
	}
	
	public double getL(){
		return l;
	}

	public void setB(double b){
		this.b = b;
	}
	
	public double getB(){
		return b;
	}

	public void findArea(){
		System.out.println("Total Area: "+ (l * b));
	}

	public void display(){
		System.out.println("  l: "+ l);
		System.out.println("  b: "+ b);
	}
}