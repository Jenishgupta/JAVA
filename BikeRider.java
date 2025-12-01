import java.util.Scanner;
import java.util.InputMismatchException;

class BikeRider {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        Bike b1 = new Bike();

        while (true) {
            try {

                System.out.print("\nChange gear: ");
                b1.setGear(scn.nextInt());   // may throw InputMismatch / IllegalArgument

                b1.currentGear();            // print current gear status

            } catch (InputMismatchException e) {

                System.out.println("Pass only integer!");
                scn.nextLine();  // clear invalid input from scanner

            } catch (IllegalArgumentException e) {

                System.out.println(e.getMessage());
            }
        }
    }
}
