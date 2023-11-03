package sk.fiit;

public class Main {
    public static void main(String[] args)  {
        var paypal = new PayPal();
        paypal.pay(100);
        paypal.refund(100);
        System.out.println("Class of paypal is " + paypal.getClass().getSimpleName() + ".");

        var onlineCard = new OnlineCard();
        onlineCard.pay(200);
        onlineCard.refund(200);
        /* If useSaferMethod in the ChangePaymentType aspect is set to true,
        the class printed out will be PayPal, otherwise it will be OnlineCardPayment. */
        System.out.println("Class of onlineCard is " + onlineCard.getClass().getSimpleName() + ".");
    }
}