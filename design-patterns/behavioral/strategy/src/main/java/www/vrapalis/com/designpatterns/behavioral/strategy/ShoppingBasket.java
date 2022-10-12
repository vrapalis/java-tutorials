package www.vrapalis.com.designpatterns.behavioral.strategy;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.List;

@Data
@RequiredArgsConstructor
public class ShoppingBasket {
    private ShoppingPayment payment;
    private final List<ShoppingItem> shoppingItems;

    public void executePayment() {
        payment.pay(shoppingItems);
        ShoppingPayment.printBill(shoppingItems);
    }
}
