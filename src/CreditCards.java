public class CreditCards {
    private String name;
    private int sum;

    public CreditCards(String name, int sum) {
        this.name = name;
        this.sum = sum;
    }

    public String getName() {
        return name;
    }

    public int getSum() {
        return sum;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    @Override
    public String toString() {
        return
                "Кредитная карта " + name  +
                        ": сумма " + sum +" руб.";
    }
}
