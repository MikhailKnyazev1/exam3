import java.io.Serializable;
import java.util.ArrayList;

public class CreditCards extends Card implements Serializable {

    @Override
    public void transferMoney(Card other,int amount) {
other.amount += amount;
this.amount-=amount;
this.transactions.add(new Transaction(this,amount));
    }

    @Override
    public void spendMoney(int amount) {
        this.amount -=amount;

    }



    private String name;
    private int sum;

    public CreditCards() {
this.transactions = new ArrayList<>();
this.id = Card.COUNTER++;

    }

    public String getName() {
        return name;
    }

    public int getSum() {
        return sum;
    }

    public String setName(String name) {
        this.name = name;
        return name;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }




    @Override
    public String toString() {
        return
                "Кредитная карта " + name  +
                        ": баланс " + this.getAmount() +" руб.";
    }
}
