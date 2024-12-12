package util;

public class CoinAcceptorImpl implements PaymentInterface {
    private int balance;

    public CoinAcceptorImpl(int initialBalance) {
        this.balance = initialBalance;
    }

    @Override
    public void acceptPayment(int amount) {
        this.balance += amount;
        System.out.println("Баланс пополнен на " + amount + " монет.");
    }

    @Override
    public int getBalance() {
        return this.balance;
    }

    @Override
    public void resetBalance() {
        this.balance = 0;
    }
}
