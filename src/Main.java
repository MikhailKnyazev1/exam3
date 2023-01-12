import java.io.*;
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
        Card card1 = new Wallet();
        Card card2 = new Wallet();
        Card card3 = new Wallet();
        card1.setName("Sber");
        card2.setName("Tinkoff");
        card3.setName("VTB");

        ArrayList<Wallet> wallets = new ArrayList<Wallet>();
        wallets.add((Wallet) card1);
        wallets.add((Wallet) card2);
        wallets.add((Wallet) card3);
        card1.setAmount(1000);
        card2.setAmount(2000);
        card3.setAmount(3000);
//        System.out.println(card1.amount);


        Card card4 = new CreditCards();
        Card card5 = new CreditCards();
        Card card6 = new CreditCards();
        card4.setName("Sber");
        card5.setName("Tinkoff");
        card6.setName("VTB");
        ArrayList<CreditCards> creditCards = new ArrayList<CreditCards>();
        card4.setAmount(1000);
        card5.setAmount(1000);
        card6.setAmount(1000);
        creditCards.add((CreditCards) card4);
        creditCards.add((CreditCards) card5);
        creditCards.add((CreditCards) card6);


        card1.transferMoney(card2, 500);
        card2.transferMoney(card3, 50);
        card3.transferMoney(card2, 1);


        card1.spendMoney(100);
        card2.spendMoney(10);
        card4.spendMoney(100);

//        card1.transactions.stream()
//                .limit(5)
//                        .forEach(System.out::print);
//
//        card2.transactions.stream()
//                .limit(5)
//                .forEach(System.out::print);
//
//        card3.transactions.stream()
//                .limit(5)
//                .forEach(System.out::print);

////
//
//     try(ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("cards.bin"))){
//objectOutputStream.writeObject(card1);
//     }
//catch (IOException ex){
//         ex.printStackTrace();
//}


//try {
//    ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("cards.bin"));
//Card card =(Card) objectInputStream.readObject();
//    System.out.println(card.getAmount());
//}catch (IOException  | ClassNotFoundException ex){
//    System.out.println(ex.getMessage());
//}


//
//        Wallet wallet1 = new Wallet("Первый", 10000);
//        Wallet wallet2 = new Wallet("Второй", 20000);
//        ArrayList<Wallet> wallets = new ArrayList<Wallet>();
//        wallets.add(wallet1);
//        wallets.add(wallet2);
//
//        CreditCards creditCard1 = new CreditCards("Сбербанк", 10000);
//        CreditCards creditCard2 = new CreditCards("Тинькофф", 20000);
//        ArrayList<CreditCards> creditCards = new ArrayList<CreditCards>();
//        creditCards.add(creditCard1);
//        creditCards.add(creditCard2);
//
        System.out.println("«Система учета финансов»\n");
        char choice, ignore;
        for (; ; ) {
            do {
                System.out.println("Меню:");
                System.out.println(" 1. Кошельки(Дебевовые карты)");
                System.out.println(" 2. Кредитные карты");
                System.out.println(" 3. Транзакции дебетовых карт");
                System.out.println(" 4. Сумма всех карт");
                System.out.print("\nBыбepитe(q to quit): ");
                choice = (char) System.in.read();

                do {
                    ignore = (char) System.in.read();
                } while (ignore != '\n');
            } while (choice < '1' | choice > '4' & choice != 'q');
            if (choice == 'q') break;

            System.out.println("\n");
            switch (choice) {
                case '1':
                    System.out.println("Всего кошельков " + wallets.size());
                    System.out.println(wallets.toString());
                    System.out.println();
                    break;

                case '2':
                    System.out.println("Всего кредитных карт " + creditCards.size());
                    System.out.println(creditCards.toString());
                    System.out.println();
                    break;


                case '3':
                    card1.transactions.stream()
                            .limit(5)
                            .forEach(System.out::print);
                    System.out.println();
                    card2.transactions.stream()
                            .limit(5)
                            .forEach(System.out::print);
                    System.out.println();
                    card3.transactions.stream()
                            .limit(5)
                            .forEach(System.out::print);
                    System.out.println();
                    break;


                case '4':

                    System.out.println(card1.getAmount() + card2.getAmount() + card3.getAmount() + card4.getAmount() + card5.getAmount() + card6.getAmount() + " руб.");
                    System.out.println();
//                default:
//                    System.out.println("Запрос не найден.");
                    break;
            }


        }


    }
}