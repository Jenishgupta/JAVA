import java.util.Scanner;

class AdditionUserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // Create a Scanner object for input

        System.out.print("Enter first number:- ");
        int a = sc.nextInt();  // Read first number

        System.out.print("Enter second number:- ");
        int b = sc.nextInt();  // Read second number

        int sum = a + b;  // Calculate sum

        System.out.println("The sum is:- " + sum);  // Display result

        sc.close();  //  Close the scanner
    }
}
