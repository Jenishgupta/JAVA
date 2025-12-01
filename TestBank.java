import java.util.Scanner;

public class TestBank {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // User enters starting balance
        System.out.print("Enter initial balance: ");
        BankAccountencap2 acc = new BankAccountencap2(sc.nextDouble());

        System.out.println("Initial Balance: " + acc.getBalance());
        System.out.println();

        // deposit
        System.out.print("Enter deposit amount: ");
        acc.deposit(sc.nextDouble());
        System.out.println();

        // withdraw
        System.out.print("Enter withdraw amount: ");
        acc.withdraw(sc.nextDouble());
        System.out.println();

        /* invalid deposit
        System.out.print("Enter invalid deposit (-ve or 0): ");
        acc.deposit(sc.nextDouble());
        System.out.println();

        // invalid withdraw
        System.out.print("Enter invalid withdraw (-ve or 0): ");
        acc.withdraw(sc.nextDouble());
        System.out.println();
		*/

        // insufficient balance test
        System.out.print("Enter huge withdraw (insufficient funds): ");
        acc.withdraw(sc.nextDouble());
        System.out.println();

        System.out.println("Final Balance: " + acc.getBalance());

        sc.close();
    }
}
