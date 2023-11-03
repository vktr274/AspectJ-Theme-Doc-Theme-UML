package sk.fiit;

public aspect ChangePaymentMethod {
    boolean useSaferMethod = true;
    pointcut paymentMethodConstructor() : call(sk.fiit.OnlineCard.new());

    OnlineCard around() : paymentMethodConstructor() {
        System.out.println("Changing OnlineCardPayment to PayPal.");
        if (useSaferMethod) {
            return new PayPal();
        }
        return proceed();
    }
}
