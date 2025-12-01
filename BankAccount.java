class BankAccountencap {

    private double balance;   // encapsulated (private) variable

    // Setter with validation + exception throwing
    public void setBalance(double balance) throws IllegalArgumentException {

        if (balance <= 0)
            throw new IllegalArgumentException("Do not pass -ve value or zero");

        this.balance = balance;
    }

    // Getter
    public double getBalance() {
        return balance;
    }
}
