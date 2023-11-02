package sk.fiit;

public aspect ChangePaymentType {
    boolean useSaferMethod = true;
    pointcut paymentMethodConstructor() : call(OnlineCardPayment.new());

    OnlineCardPayment around() : paymentMethodConstructor() {
        if (useSaferMethod) {
            return new PayPal();
        }
        return proceed();
    }
}
