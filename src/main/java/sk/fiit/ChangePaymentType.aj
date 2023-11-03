package sk.fiit;

public aspect ChangePaymentType {
    boolean useSaferMethod = true;
    pointcut paymentMethodConstructor() : call(OnlineCardPayment.new());

    OnlineCardPayment around() : paymentMethodConstructor() {
        System.out.println("Changing OnlineCardPayment to PayPal.");
        if (useSaferMethod) {
            return new PayPal();
        }
        return proceed();
    }
}
