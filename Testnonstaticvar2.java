//Develop program to count number of objects created from a class

class Example {
    private static int count;  // static variable to count objects

    // Instance Initialization Block (IIB)
    {
        count++;   // runs every time an object is created
    }

    Example() {
        System.out.println("\nobject is created by using NPC");
    }

    Example(int x) {
        System.out.println("\nobject is created by using IPC");
    }

    Example(String s) {
        System.out.println("\nobject is created by using SPC");
    }

    Example(double d) {
        System.out.println("\nobject is created by using DPC");
    }

    public static int getCount() {
        return count;
    }
}
public class Testnonstaticvar2 {
    public static void main(String[] args) {

        // Before creating objects
        System.out.println("Number of objects created: " + Example.getCount());
        System.out.println();

        Example e1 = new Example();
        Example e2 = new Example(5);
        Example e3 = new Example("a");
        Example e4 = new Example("a");
        Example e5 = new Example(5.6);

        System.out.println();

        // After creating objects
        System.out.println("Number of objects created: " + Example.getCount());
    }
}
