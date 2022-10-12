package www.vrapalis.com.datastructures.stack;

import lombok.val;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

@DisplayName("This class test array based stack implementation")
class ArrayStackGroupTest {
    Stack<String> stack;

    @BeforeEach
    void setUp() {
        stack = new ArrayStack<>(1);
    }

    @Nested
    @DisplayName("This class tests isFull method")
    class ArrayStackIsFullGroupTest {

        @Test
        @DisplayName("If stack is full then isFull method should return true test")
        void isFullShouldReturnTrueTest() {
            // Given stack with spase for one item (setUp method)

            //When adding one item
            stack.push("Item 1");

            //Then stack with size one should return true
            Assertions.assertThat(stack.isFull()).isTrue();
        }

        @Test
        @DisplayName("If item was pushed to the stack the top index of stack should increase by one test")
        void isFullShouldReturnTest() {
            // Given stack with spase for one item (setUp method)
            // When nothing adding to the stack
            // Then stack with no items should return false
            Assertions.assertThat(stack.isFull()).isFalse();
        }

    }

    @Nested
    @DisplayName("This class tests isEmpty method")
    class ArrayStackIsEmptyGroupTest {

        @Test
        @DisplayName("IsEmpty method should return true if stack has no items test")
        void isEmptyShouldReturnTrueTest() {
            // Given stack with spase for one item (setUp method)
            // When nothing was added to the stack
            // Then isEmpty method should return true
            Assertions.assertThat(stack.isEmpty()).isTrue();
        }

        @Test
        @DisplayName("IsEmpty method should return false if item was added to the stack test")
        void isEmptyShouldReturnFalseTest() {
            // Given stack with spase for one item (setUp method)
            // When item was added to the stack
            stack.push("Item 1");
            // Then isEmpty method should return false
            Assertions.assertThat(stack.isEmpty()).isFalse();
        }
    }

    @Nested
    @DisplayName("This class tests push method")
    class ArrayStackPushGroupTest {

        @Test
        @DisplayName("Push method should throw exception if stack has no space test")
        void pushItemToFullStackShouldThrowExceptionTest() {
            Assertions.assertThatThrownBy(() -> {
                // Given stack with spase for one item (setUp method)
                // When more items is added then the space
                stack.push("Item 1");
                // Then push method should throw exception
                stack.push("Item 2");
            }).isInstanceOf(StackOverflowException.class);
        }
    }

    @Nested
    @DisplayName("This class tests pop method")
    class ArrayStackPopGroupTest {

        @Test
        @DisplayName("Pop item from stack should return item test")
        void popItemFromStackShouldReturnItemTest() {
            // Given stack with spase for one item (setUp method)
            // When item was added to the stack
            final var item = "Item 1";
            stack.push(item);
            // Then pop item from the stack
            Assertions.assertThat(stack.pop()).isEqualTo(item);
            Assertions.assertThat(stack.isEmpty()).isTrue();
        }

        @Test
        @DisplayName("Pop item from empty stack should throw exception test")
        void popItemFromEmptyStackShouldThrowExceptionTest() {
            Assertions.assertThatThrownBy(() -> {
                // Given stack with spase for one item (setUp method)
                // When nothing was added to the empty stack
                // Then pop method should throw exception
                stack.pop();
            }).isInstanceOf(StackUnderflowException.class);
        }
    }

    @Test
    @DisplayName("Default stack initialization test")
    void defaultStackInitializationTest() {
        // Given default stack initialization
        val withDefaultStackLengthStack = new ArrayStack<String>();
        // Then
        Assertions.assertThat(withDefaultStackLengthStack.length()).isEqualTo(ArrayStack.DEFAULT_LENGTH);
    }

    @Test
    @DisplayName("With given stack initialization test")
    void withGivenStackLengthInitializationTest() {
        // Given stack length initialization
        val withGivenStackLengthStack = new ArrayStack<String>(3);
        // Then
        Assertions.assertThat(withGivenStackLengthStack.length()).isEqualTo(3);
    }
}