package sk.fiit;

public aspect UseSaferPaymentMethod {
    boolean useSaferMethod = true;
    pointcut paymentMethodConstructor() : call(OnlineCard.new());

    OnlineCard around() : paymentMethodConstructor() {
        System.out.println("Changing OnlineCard to PayPal.");
        if (useSaferMethod) {
            return new PayPal();
        }
        return proceed();
    }
}
