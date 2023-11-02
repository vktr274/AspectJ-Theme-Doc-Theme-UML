package sk.fiit;

public class Main {
    public static void main(String[] args)  {
        Payment paypalTest = new PayPal();
        Payment onlineCardTest = new OnlineCardPayment();

        paypalTest.pay(100);
        paypalTest.refund(100);
        System.out.println(paypalTest);

        onlineCardTest.pay(100);
        onlineCardTest.refund(100);
        System.out.println(onlineCardTest);
    }
}