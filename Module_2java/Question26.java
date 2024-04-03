package Module_2java;
//W.A.J.Pto create a custom exception if Customer withdraw amount 
//which is greater than account balance then program will show custom 
//exception otherwise amount will deduct from account balance. Account 
//balance is: 2000 Enter withdraw amount: 2500 o Sorry, insufficient 
//balance, you need more 500 Rs. To perform this transaction.
class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        balance = initialBalance;
    }

    public void withdraw(double amount) throws InsufficientBalanceException {
        if (amount > balance) {
            double shortfall = amount - balance;
            throw new InsufficientBalanceException("Sorry, insufficient balance, you need more " + shortfall + " Rs. To perform this transaction.");
        } else {
            balance -= amount;
            System.out.println("Amount withdrawn: " + amount);
        }
    }

    public double getBalance() {
        return balance;
    }
}

public class Question26 {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(2000);
        double withdrawAmount = 2500;

        try {
            account.withdraw(withdrawAmount);
            System.out.println("Remaining balance: " + account.getBalance());
        } catch (InsufficientBalanceException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
