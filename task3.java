import java.util.Scanner;
class ATM {
    private double balance;

    public ATM(double initialBalance) {
        this.balance = initialBalance;
    }

    public void depositing(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdrawing(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: " + amount);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient funds.");
        }
    }

    public double getBalance() {
        return balance;
    }
}
public class task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ATM myATM = new ATM(1000.0);
        System.out.println("Enter the amount to deposit:"); 
        double depositAmount = sc.nextDouble();
        myATM.depositing(depositAmount);
        System.out.println("Enter the amount to withdraw:");
        double withdrawAmount = sc.nextDouble();
        myATM.withdrawing(withdrawAmount); 
        System.out.println("Current Balance: " + myATM.getBalance());
    }
    
}
