import java.io.Serializable;
import java.util.List;

public abstract class Card implements Serializable {
protected static int COUNTER=0;
      protected int amount;
    protected static String name;
   // private int id;
    protected transient List<Transaction> transactions;
protected int id;
public abstract void transferMoney(Card other, int amount);
public abstract void spendMoney (int amount);

    public int getAmount() {
        return amount;
    }
    public String setName(String Sber){return name;}

    public void setAmount(int amount) {
        this.amount = amount;
    }



    @Override
    public String toString() {
        return "Card{" +
                "amount=" + amount +
                ", transactions=" + transactions +
                ", id=" + id +
                '}';
    }
}
