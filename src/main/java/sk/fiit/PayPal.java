package sk.fiit;

public class PayPal extends OnlineCardPayment {
    @Override
    public void pay(int amount) {
        System.out.println("PayPal payment of " + amount + "$ processed.");
    }

    @Override
    public void refund(int amount) {
        System.out.println("PayPal refund of " + amount + "$ processed.");
    }
}
