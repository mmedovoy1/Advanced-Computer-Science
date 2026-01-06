public class BankAccount{
    private double balance;

    public BankAccount() {
        balance = 100;
    }

    // exceptional problems
    //withdrew too much
    // withdrew negative
    // withdrew no number
    // withdrew 0
    public void withdraw(double amount) {
        
        if (balance - amount < 0) {
            throw new IllegalArgumentException("You are attempting to withdraw too much money!");
        }

        if (amount < 0) {
            throw new IllegalArgumentException("The amount you're attempting to withdraw is negative");
        }

        balance -= amount;
    }
}

    // Exceptino class:
    // - Illegal Argument Ecpetion
    // - Null Pointer Exception
    // Array Index Exception
    // Arithmetic Exception