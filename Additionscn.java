import java.util.Scanner;

class Inputscanner 
{
	public static void main(String[] args) 
	{
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Number:");
		int num = scn.nextInt();
		
		System.out.print("Name:-");
		String name = scn.nextLine();
		
		
		System.out.print("Num:-" + num);
		
		System.out.println("Name:" + name);
	}
}
