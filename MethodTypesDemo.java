// Java Program Demonstrating Different Types of Methods

// Abstract class to demonstrate abstract method
abstract class Shape {
    abstract void draw(); // abstract method
}

public class MethodTypesDemo extends Shape {

    // 1) User-defined method (non-static, non-parameterized, void)
    void greet() {
        System.out.println("Hello from a user-defined method!");
    }

    // 2) User-defined method (parameterized, with return type)
    int add(int a, int b) {
        return a + b;
    }

    // 3) Static method (can be called without creating an object)
    static void showStatic() {
        System.out.println("This is a static method.");
    }

    // 4) Constructor (special type of method)
    MethodTypesDemo() {
        System.out.println("Constructor called!");
    }

    // 5) Getter and Setter (Accessor and Mutator)
    private String name;

    public String getName() {  // getter
        return name;
    }

    public void setName(String name) {  // setter
        this.name = name;
    }

    // 6) Final method (cannot be overridden)
    final void displayFinal() {
        System.out.println("This is a final method.");
    }

    // 7) Synchronized method (thread-safe)
    synchronized void syncMethod() {
        System.out.println("Synchronized method is running safely.");
    }

    // 8) Abstract method implementation
    @Override
    void draw() {
        System.out.println("Drawing a shape (abstract method implemented).");
    }

    // 9) Native method declaration (example only - cannot run without JNI setup)
    // native void nativeMethod();

    // 10) Main method (predefined entry point)
    public static void main(String[] args) {
        // Calling static method
        showStatic();

        // Creating object to call instance methods
        MethodTypesDemo obj = new MethodTypesDemo();

        // Calling instance methods
        obj.greet();

        // Calling parameterized method
        int result = obj.add(10, 20);
        System.out.println("Sum = " + result);

        // Using setter and getter
        obj.setName("Jenish");
        System.out.println("Name = " + obj.getName());

        // Calling final method
        obj.displayFinal();

        // Calling synchronized method
        obj.syncMethod();

        // Abstract method implementation
        obj.draw();

        // Calling predefined method from Java library
        System.out.println("Square root of 16 = " + Math.sqrt(16));
    }
}
