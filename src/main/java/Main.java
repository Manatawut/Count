public class Main {
    public static void main(String[] args) {
        Sensor[] sensors = {
                new Sensor(1, -20),
                new Sensor(2, 32),
                new Sensor(3, -15)
        };
        CreditCard[] cards = {
                new CreditCard("Emma", 300),
                new CreditCard("Chris", 100),
                new CreditCard("Joey", -50)
        };
        int n = StatUtil.countNegative(sensors);
        System.out.println(n);
    }
}
