package sk.fiit;

public class Mastercard implements Payment {
    @Override
    public void pay(int amount) {
        System.out.println("Mastercard payment of " + amount + "$ processed.");
    }

    @Override
    public void refund(int amount) {
        System.out.println("Mastercard refund of " + amount + "$ processed.");
    }
}
