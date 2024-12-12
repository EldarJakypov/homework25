package util;

public interface PaymentInterface {
    void acceptPayment(int amount);
    int getBalance();
    void resetBalance();
}
