# Cuckoo's Egg Design Pattern Implementation in AspectJ

## Proof of Concept

The proof of concept contains an interface called `PaymentMethod` containing methods
`pay` and `refund` which is implemented by the `OnlineCard` class overriding the `pay` and
`refund` methods. The `PayPal` class inherits from `OnlineCard` and overrides its
`pay` and `refund` methods.

The aspect `ChangePaymentMethod`contains a pointcut `paymentMethodConstructor()`
to the `OnlineCard` constructor. The aspect also contains a boolean variable
`useSaferMethod`, which, if set to `true`, will cause the `around()` advice to call the
`PayPal` constructor and return the created instance, and if set to `false`, will
cause the `around` advice to return `proceed()`.

In the `Main` class, we create an instance of `PayPal` and call its `pay` and `refund`
methods and then print the class name, which is `PayPal`.

Next, we create an instance of `OnlineCard` and call its `pay` and `refund` methods and
then print the class name, which is `OnlineCard` if `useSaferMethod` is set to `false`
and `PayPal` if `useSaferMethod` is set to `true`.

This proves that the aspect is working as intended and that we successfully implemented
the Cuckoo's Egg design pattern to change an object's class at runtime.

## Theme/Doc and Theme/UML Diagram

![Theme/Doc and Theme/UML Diagram](./theme_doc_uml.png)