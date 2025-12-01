import java.util.Scanner;
class Examplestaticvar {
    static int a;
	static int b;

    static {
        System.out.println("SB");
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter a: ");
        a = scn.nextInt();
		System.out.print("Enter b: ");
        b = scn.nextInt();
        System.out.println("value is stored in SV a\n");
    }

    public static void main(String[] args) {
        System.out.println("main");
        System.out.println(" a: " + a);
		System.out.println(" a: " + b);
    }
}
