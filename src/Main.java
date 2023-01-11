import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
//        Четвертый вариант
//        Создать приложение «Система учета финансов».
//        Основная задача проекта: взаимодействовать с информацией о финансах пользователя.
//        Система хранит следующую информацию:
// кошельки (название кошелька, сумма в нем и т. д.);
// кредитные карты (название карты, сумма на ней и т. д.);
// список текущих затрат;
// список потенциальных затрат;
// список потенциальных доходов (премия, зарплата и т. д.).
//                Приложение должно предоставлять интерфейс для:
// отображения состояния кошелька;
// получения суммы по всем кошелькам;
// отображения состояния кредитной карты;
// получения суммы по всем кредитным картам;
// получения общей суммы по всем кошелькам и картам;
// добавления, удаления, редактирования информации кошелька;
// добавления, удаления, редактирования информации кредитной карты;
// работы со списком потенциальных затрат;
// работы со списком текущих затрат;
// работы со списком потенциальных доходов.

        Wallet wallet1 = new Wallet("Первый", 10000);
        Wallet wallet2 = new Wallet("Второй", 20000);
        ArrayList<Wallet> wallets = new ArrayList<Wallet>();
        wallets.add(wallet1);
        wallets.add(wallet2);

        CreditCards creditCard1 = new CreditCards("Сбербанк", 10000);
        CreditCards creditCard2 = new CreditCards("Тинькофф", 20000);
        ArrayList<CreditCards> creditCards = new ArrayList<CreditCards>();
        creditCards.add(creditCard1);
        creditCards.add(creditCard2);

        System.out.println("«Система учета финансов»\n");


        char choice, ignore;
        for (; ; ) {
            do {
                System.out.println("Меню:");
                System.out.println(" 1. Кошельки");
                System.out.println(" 2. Кредитные карты");
                System.out.print("\nBыбepитe(q to quit): ");
                choice = (char) System.in.read();

                do {
                    ignore = (char) System.in.read();
                } while (ignore != '\n');
            } while (choice < '1' | choice > '2' & choice != 'q');
            if (choice == 'q') break;

            System.out.println("\n");
            switch (choice) {
                case '1':
                    System.out.println("Всего кошельков " + wallets.size());
                    System.out.println(wallets.toString());

                    break;

                case '2':
                    System.out.println("Всего кредитных карт " + creditCards.size());
                    System.out.println(creditCards.toString());
                    break;
                default:
                    System.out.println("Запрос не найден.");
                    break;
            }


        }


    }
}