// Java program to add two numbers using command-line arguments
class Addition2
{
	public static void main(String[] args) 
	{
		// converting command-line arguments from String to integer
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);

		// performing addition
		int c = a + b;

		// displaying the result
		System.out.println("Result: " + c);
	}
}
