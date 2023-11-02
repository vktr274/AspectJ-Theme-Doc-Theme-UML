package sk.fiit;

public aspect ChangePaymentType {
    boolean useSaferMethod = true;
    pointcut paymentMethodConstructor() : call(OnlineCardPayment.new());

    OnlineCardPayment changePaymentType(OnlineCardPayment paymentMethod) {
        if (useSaferMethod) {
            return new PayPal();
        }
        return paymentMethod;
    }

    OnlineCardPayment around() : paymentMethodConstructor() {
        return changePaymentType(proceed());
    }
}
