
abstract class BankAccount {
    protected String accountHolder;
    protected double balance;

    public BankAccount(String accountHolder) {
        this.accountHolder = accountHolder;
        this.balance = 0.0;
    }

    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);

    public double getBalance() {
        return balance;
    }

    public String getAccountHolder() {
        return accountHolder;
    }
}

interface AccountOperations {
    void deposit(double amount);
    void withdraw(double amount);
}

class SavingsAccount extends BankAccount implements AccountOperations {

    public SavingsAccount(String accountHolder) {
        super(accountHolder);
    }

    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount + " new balance: " + balance);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    } 
    @Override
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("withdraw must grand of 0");
        }
         else if (amount > balance) {
            System.out.println("not alloweed");
         }
         else {
            balance -= amount;
            System.out.println("Withdrw: " + amount + "new balance: " + balance);
         }
    }
}

public class exam {
    public static void main(String [] args) {
        SavingsAccount account = new SavingsAccount("Amine");
        account.deposit(6000);
        account.withdraw(1500);
        
    }
}


