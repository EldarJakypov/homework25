package util;

import java.util.Scanner;

public class CardAcceptorImpl implements PaymentInterface {
    private int balance;

    public CardAcceptorImpl() {
        this.balance = 0;
    }

    @Override
    public void acceptPayment(int amount) {
        System.out.print("Введите номер карты: ");
        String cardNumber = new Scanner(System.in).nextLine();
        System.out.print("Введите одноразовый пароль: ");
        String otp = new Scanner(System.in).nextLine();
        this.balance += amount;
        System.out.println("Платеж прошел успешно. Баланс пополнен на " + amount + " единиц.");
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
