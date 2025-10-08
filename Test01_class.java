// Test01_class.java

// User-defined class Duoclass
class Duoclass {
    // Variables of different data types
    int i1 = 5;          // Primitive data type (int)
    double d1 = 6.7;     // Primitive data type (double)
    char ch = 'A';       // Primitive data type (char)
    long[] la = {8, 9};  // Array object
    String s1 = "Hari";  // String class object
}

// Main class containing main() method
public class Test01_class {
    public static void main(String[] args) {

        // Creating an object of Duoclass class
        // This allocates memory for all non-static variables in Duoclass
        Duoclass e1 = new Duoclass();

        // Accessing and printing the values stored in the object
        System.out.println("int:-" +e1.i1);     // Output: 5
        System.out.println("float:-" +e1.d1);     // Output: 6.7
        System.out.println("character:-" +e1.ch);     // Output: A
        System.out.println("la1:-" +e1.la[0]);  // Output: 8
        System.out.println("la2:-" +e1.la[1]);  // Output: 9
        System.out.println("Name:-" +e1.s1);     // Output: Hari
    }
}
