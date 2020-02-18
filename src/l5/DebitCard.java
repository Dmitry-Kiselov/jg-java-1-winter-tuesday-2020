package l5;

public class DebitCard {

    private int balance;

    public void deposit(int amount) {
        if (amount > 0) {
            this.balance = this.balance + amount;
        }
    }

    public void withdraw(int amount) {
        if (balance >= amount) {
            this.balance = this.balance - amount;
        }
    }

    public int getBalance() {
        return balance;
    }

}
