package sk.fiit;

public class OnlineCardPayment implements Payment {
    @Override
    public void pay(int amount) {
        System.out.println("Online card payment of " + amount + "$ processed.");
    }

    @Override
    public void refund(int amount) {
        System.out.println("Online card refund of " + amount + "$ processed.");
    }
}
