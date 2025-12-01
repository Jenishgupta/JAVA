public class BankAccountencap2 {

    private double balance;   // Encapsulated variable

    // Constructor with validation
    public BankAccountencap2(double initialBalance) {
        setBalance(initialBalance);
    }

    // Setter with validation logic
    private void setBalance(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid amount! Balance cannot be negative or zero.");
            this.balance = 0; // default
        } else {
            this.balance = amount;
        }
    }

    // Deposit method (public)
    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Cannot deposit negative or zero amount!");
            return;
        }
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    // Withdraw method (public)
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Cannot withdraw negative or zero amount!");
            return;
        }
        if (amount > balance) {
            System.out.println("Insufficient funds!");
            return;
        }
        balance -= amount;
        System.out.println("Withdrawn: " + amount);
    }

    // Getter
    public double getBalance() {
        return balance;
    }
}
