package sk.fiit;

public interface PaymentMethod {
    void pay(int amount);

    void refund(int amount);
}
