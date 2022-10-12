package www.vrapalis.com.datastructures.stack;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class StackItem<T> {
    private final T value;
    private StackItem<T> link;
}
