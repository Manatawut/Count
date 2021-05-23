public class CreditCard implements Value {
    private double balance;
    private String name;

    public CreditCard(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }
    public double getBalance() {
        return balance;
    }

    @Override
    public double getValue() {
        return balance;
    }
}
