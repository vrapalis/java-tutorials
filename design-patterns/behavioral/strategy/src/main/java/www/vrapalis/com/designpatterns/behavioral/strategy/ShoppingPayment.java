package www.vrapalis.com.designpatterns.behavioral.strategy;

import java.util.List;

@FunctionalInterface
public interface ShoppingPayment {
    void pay(List<ShoppingItem> shoppingItems);

    static void printBill(List<ShoppingItem> shoppingItems) {
        Double price = shoppingItems.stream().map(ShoppingItem::getPrice).reduce(0.0, (endPrice, shItemPrice) -> endPrice + shItemPrice);
        System.out.println(String.format("Bill: %s price", price).toString());
    }
}
