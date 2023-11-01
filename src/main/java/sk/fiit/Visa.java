package sk.fiit;

public class Visa implements PaymentMethod {
    @Override
    public void pay(int amount) {
        System.out.println("VISA payment of " + amount + "$ processed.");
    }

    @Override
    public void refund(int amount) {
        System.out.println("VISA refund of " + amount + "$ processed.");
    }
}
