import java.util.Scanner;

class Bankencap {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        BankAccountencap acc1 = new BankAccountencap();   // [balance = 0.0]

        while (true) {
            try {
                System.out.print("\nEnter balance: ");
                acc1.setBalance(scn.nextDouble());

                System.out.println("Current Balance: " + acc1.getBalance());
                break;   // exit loop when correct value is entered
            }
            catch (IllegalArgumentException e) {

                System.out.println("Error: " + e.getMessage());
                // loop repeats until valid value is entered
            }
        }

        scn.close();
    }
}
