package www.vrapalis.com.designpatterns.behavioral.strategy;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class ShoppingItem {
    private final String name;
    private final double price;
}
