/*
Develop a project to create real world object Person 
with its sub types 'Student, Faculty and Admin' and user type 'College' 
by developing 
	1. OOP basics[class,f<s,ns>,b<s,ns>,c<dc,np,p>,m<s, ns{s,g,b,d}>,instances]
	2. Encapsulation and 
	3. Inheritance 
for obtainting Security, code reusability, Loose coupling, Dynamic binding/RP
*/


// Person.java (super class)
public class Person {   // Inheritance (extending from Object class)

    // static fields with data hiding
    private static int eyes;
    private static int ears;
    private static int hands;
    private static int legs;

    // non-static fields with data hiding
    private String name;
    private double height;
    private double weight;

    // static block (encapsulation of common state)
    static {
        eyes  = 2;
        ears  = 2;
        hands = 2;
        legs  = 2;
    }

    // constructor
    public Person(String name, double height, double weight) {
        this.name   = name;
        this.height = height;
        this.weight = weight;
    }

    // getter and setter methods for static fields

    public static int getEyes() {
        return eyes;
    }

    public static void setEyes(int eyes) {
        Person.eyes = eyes;
    }

    public static int getEars() {
        return ears;
    }

    public static void setEars(int ears) {
        Person.ears = ears;
    }

    public static int getHands() {
        return hands;
    }

    public static void setHands(int hands) {
        Person.hands = hands;
    }

    public static int getLegs() {
        return legs;
    }

    public static void setLegs(int legs) {
        Person.legs = legs;
    }

    // getter and setter methods for non-static fields

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    // Business logic methods

    public void eat() {
        System.out.println(name + " is eating");
    }

    public void sleep() {
        System.out.println(name + " is deep sleeping");
    }

    // method for returning 'object state' to println() method to print on console
    @Override
    public String toString() {   // Polymorphism (method overriding from Object class)
        return  " eyes\t\t: "   + eyes   + "\n" +
                " ears\t\t: "   + ears   + "\n" +
                " hands\t\t: "  + hands  + "\n" +
                " legs\t\t: "   + legs   + "\n" +
                " name\t\t: "   + name   + "\n" +
                " height\t\t: " + height + "\n" +
                " weight\t\t: " + weight;
    }
}
