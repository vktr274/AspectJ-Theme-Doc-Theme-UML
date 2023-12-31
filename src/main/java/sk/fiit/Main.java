package sk.fiit;

public class Main {
    public static void main(String[] args)  {
        PayPal paypal = new PayPal();
        paypal.pay(100);
        paypal.refund(100);
        System.out.println("Class of paypal object is " + paypal.getClass().getSimpleName() + ".\n");

        OnlineCard onlineCard = new OnlineCard();
        onlineCard.pay(200);
        onlineCard.refund(200);
        /* If useSaferMethod in the UseSaferPaymentMethod aspect is set to true,
        the class printed out will be PayPal, otherwise it will be OnlineCard. */
        System.out.println("Class of onlineCard object is " + onlineCard.getClass().getSimpleName() + ".");
    }
}