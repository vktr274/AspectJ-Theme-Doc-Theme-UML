package sk.fiit;

public aspect ChangePaymentType {
    boolean useSaferMethod = true;
    pointcut paymentMethodConstructor() : call(PaymentMethod.new());
    PaymentMethod changePaymentType(PaymentMethod paymentMethod) {
        if (useSaferMethod) {
            return new PayPal();
        }
        return paymentMethod;
    }

    PaymentMethod around() : paymentMethodConstructor() {
        return changePaymentType(proceed());
    }
}
