package www.vrapalis.com.designpatterns.behavioral.strategy;

import java.util.List;

/**
 * Credit card algorithm.
 */
public class ShoppingPaymentCreditCard implements ShoppingPayment {

    @Override
    public void pay(List<ShoppingItem> shoppingItems) {
        System.out.println("Shopping items payed with credit card");
    }
}
