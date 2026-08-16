package oops.encapsulation;
class ATM {

    private int balance = 10000;
    private final int pin = 1234;

    public void withdraw(int enteredPin, int amount) {

        if (enteredPin == pin && amount <= balance) {
            balance = balance - amount;
            System.out.println("Withdrawal successful");
        } else {
            System.out.println("Invalid PIN or insufficient balance");
        }
    }

    public int getBalance() {
        return balance;
    }
}

public class encapsulation {
    public static void main(String[] args) {

        ATM atm = new ATM();

        atm.withdraw(1234, 2000);

        System.out.println("Balance: " + atm.getBalance());
    }
}