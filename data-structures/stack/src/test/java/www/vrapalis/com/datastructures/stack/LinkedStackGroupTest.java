package www.vrapalis.com.datastructures.stack;

import lombok.val;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Linked implementation stack group test")
class LinkedStackGroupTest {

    private Stack<String> stack;

    @BeforeEach
    void setUp() {
        stack = new LinkedStack<>();
    }

    @Test
    @DisplayName("Push method should add item to the stack test")
    void pushTest() {
        // Given empty stack
        // When adding one item to the stack
        String item = "Item 1";
        stack.push(item);
        // Then pop method should return previous added item
        Assertions.assertThat(stack.pop()).isEqualTo(item);
        // Then stack should be empty
        Assertions.assertThat(stack.isEmpty()).isTrue();
    }

    @Test
    @DisplayName("Pop method should return and remove item from the stack test")
    void popTest() {
        // Given stack with one item
        val givenItem = "Item 1";
        stack.push(givenItem);
        // When pop item from the stack
        String item = stack.pop();
        // Then stack should be empty
        Assertions.assertThat(stack.isEmpty()).isTrue();
    }

    @Test
    @DisplayName("Pop from empty stack should result in stack underflow exception test")
    void popFromEmptyStackShouldResultInStackUnderflowExceptionTest() {
        // Given empty stack
        // When pop from empty stack
        // Then exception should be thrown
        Assertions.assertThatThrownBy(() -> stack.pop()).isInstanceOf(StackUnderflowException.class);
    }

    @Test
    @DisplayName("Is full method test")
    void isFullTest() {
        // Then stack should not be full, cant be full
        Assertions.assertThat(stack.isFull()).isFalse();
    }

    @Test
    @DisplayName("Length should represent items count in the stack")
    void lengthTest() {
        // Given stack with 3 items
        stack.push("Item 1");
        stack.push("Item 2");
        stack.push("Item 3");
        // When length is called
        int length = stack.length();
        // Then length should be 3
        Assertions.assertThat(length).isEqualTo(3);
    }
}