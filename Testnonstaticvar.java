/*Below program explains initializing non-static variable in instance initialize block common specific to
one object common to all constructors
*/
import java.util.Scanner;
class Example {
    static Scanner scn = new Scanner(System.in);
    int x;

    {
        System.out.print("\nEnter x value: ");
        x = scn.nextInt();
        System.out.print("NSV is initialized in IIB ");
    }

    Example() {
        System.out.println(" NPC");
    }

    Example(int x) {
        System.out.println(" IPC");
    }

    Example(String s) {
        System.out.println(" SPC");
    }

    Example(double d) {
        System.out.println(" DPC");
    }
}

class Testnonstaticvar {
    public static void main(String[] args) {
        Example e1 = new Example();
        Example e2 = new Example(5);
        Example e3 = new Example("a");
        Example e4 = new Example(4.5);
        Example e5 = e4;

        System.out.println();
        System.out.println(e1.x);
        System.out.println(e2.x);
        System.out.println(e3.x);
        System.out.println(e4.x);
    }
}
