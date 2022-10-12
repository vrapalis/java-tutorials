package www.vrapalis.com.designpatterns.behavioral.strategy;

import lombok.val;

import java.util.ArrayList;
import java.util.Arrays;

public class StrategyRunner {
    public static void main(String[] args) {
        System.out.println("Strategy Pattern Running ...");
        System.out.println("");

        val shoppingItems = new ArrayList<ShoppingItem>(Arrays.asList(
                new ShoppingItem("Milk", 3.15),
                new ShoppingItem("Bread", 2.15)
        ));
        val shoppingBasket = new ShoppingBasket(shoppingItems);

        shoppingBasket.setPayment(new ShoppingPaymentPaypal());
        shoppingBasket.executePayment();

        System.out.println("");

        shoppingBasket.setPayment(new ShoppingPaymentCreditCard());
        shoppingBasket.executePayment();
    }
}
