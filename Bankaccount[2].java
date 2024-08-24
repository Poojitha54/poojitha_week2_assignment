public class Bankaccount {
    private double balance;
    public Bankaccount(double initialBalance) {
        this.balance = initialBalance;
    }
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: $" + amount);
        } else {
            System.out.println("Invalid withdrawal amount!");
        }
    }
    public void displayBalance() {
        System.out.println("Current Balance: $" + balance);
    }
    public static void main(String[] args) {
        Bankaccount account = new Bankaccount(1000.0);
        account.deposit(500.0);
        account.withdraw(200.0);

        account.displayBalance();
    }
}



