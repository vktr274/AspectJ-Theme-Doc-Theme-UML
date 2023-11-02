package sk.fiit;

public interface Payment {
    void pay(int amount);

    void refund(int amount);
}
