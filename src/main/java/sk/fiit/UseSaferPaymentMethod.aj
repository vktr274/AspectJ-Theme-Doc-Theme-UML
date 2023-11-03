package sk.fiit;

public aspect UseSaferPaymentMethod {
    boolean useSaferMethod = true;
    pointcut paymentMethodConstructor() : call(OnlineCard.new());

    OnlineCard around() : paymentMethodConstructor() {
        if (useSaferMethod) {
            System.out.println("Changing OnlineCard class to PayPal class.");
            return new PayPal();
        }
        System.out.println("Using OnlineCard class.");
        return proceed();
    }
}
