package sk.fiit;

public class Main {
    public static void main(String[] args)  {
        PaymentMethod paypalTest = new PayPal();
        PaymentMethod visaTest = new Visa();
        PaymentMethod mastercardTest = new Mastercard();

        paypalTest.pay(100);
        paypalTest.refund(100);
        System.out.println(paypalTest);

        visaTest.pay(100);
        visaTest.refund(100);
        System.out.println(visaTest);

        mastercardTest.pay(100);
        mastercardTest.refund(100);
        System.out.println(mastercardTest);
    }
}