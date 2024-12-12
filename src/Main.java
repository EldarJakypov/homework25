import util.CoinAcceptorImpl;
import util.CardAcceptorImpl;
import util.PaymentInterface;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Выберите способ оплаты:");
        System.out.println("1 - Монеты");
        System.out.println("2 - Карта");

        int choice = scanner.nextInt();
        PaymentInterface paymentMethod = null;

        switch (choice) {
            case 1:
                paymentMethod = new CoinAcceptorImpl(0);
                break;
            case 2:
                paymentMethod = new CardAcceptorImpl();
                break;
            default:
                System.out.println("Неверный выбор. Программа завершена.");
                return;
        }
        AppRunner.run(paymentMethod);
    }
}
