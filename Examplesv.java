/*Assignment: Develop a program to count number of objects created from a class.

           Because this class can contain overloaded constructors, 
	       user programmer can create object of this class 
	       by call any one of the available constructors
	       hence we must create a stataic variable and 
	       must increase it in non-static block common to all constructors. 
*/
//Examplesv.java
class Examplesv { 
    private static int count; 
     
    { 
        count++;				 
    } 
     
    Examplesv(){ 
        System.out.println("NPC"); 
    } 
     
    Examplesv(int x){ 
        System.out.println("IPC"); 
    } 

    Examplesv(String x){ 
        System.out.println("SPC"); 
    } 
     
    public static int getCount(){ 
        return count; 
    } 
} 
     
class Test { 
    public static void main(String[] args) { 
     
        Examplesv e1  = new Examplesv(); 
        Examplesv e2  = new Examplesv(5); 
        Examplesv e3  = new Examplesv("a"); 
         
        System.out.println("Number of object created: " + Examplesv.getCount());
    } 
}
