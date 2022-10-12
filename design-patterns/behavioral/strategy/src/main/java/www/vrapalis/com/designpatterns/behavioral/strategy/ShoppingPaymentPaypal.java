package www.vrapalis.com.designpatterns.behavioral.strategy;

import java.util.List;

/**
 * Paypal algorithm.
 */
public class ShoppingPaymentPaypal implements ShoppingPayment {

    @Override
    public void pay(List<ShoppingItem> shoppingItems) {
        System.out.println("Shopping items payed with pay pal");
    }
}
