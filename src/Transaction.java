import java.io.Serializable;
import java.util.Date;

public class Transaction implements Serializable {
    private Wallet wallet;
    private Date date;
    private int amount;

    public Transaction(Card wallet, int amount) {
        this.wallet = (Wallet) wallet;
        this.amount = amount;
        this.date = new Date();
    }


    @Override
    public String toString() {
        return "Transaction{" +
                "Карта=" + wallet +
                ", date=" + date +
                ", перевод = " + amount +" руб."+
                '}';
    }
}