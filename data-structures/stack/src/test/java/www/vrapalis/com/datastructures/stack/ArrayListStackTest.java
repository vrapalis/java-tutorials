package www.vrapalis.com.datastructures.stack;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("This class test array list stack implementation")
class ArrayListStackTest {

    private Stack<String> stack;

    @BeforeEach
    void setUp() {
        stack = new ArrayListStack<>();
    }

    @Nested
    @DisplayName("This class test push method test")
    class ArrayListStackPushGroupTest {

        @Test
        @DisplayName("Push method should add item to the stack test")
        void pushMethodShouldAddItemToTheStackTest() {
            // Given empty stack
            // When adding new item to the stack
            stack.push("Item 1");
            // Then stack should not be empty
            Assertions.assertThat(stack.isEmpty()).isFalse();
        }
    }

    @Nested
    @DisplayName("This class should test pop method")
    class ArrayListStackPopGroupTest {

        @Test
        @DisplayName("Pop method should return and delete item from the stack")
        void popShouldReturnAndDeleteItemFromTheStack() {
            // Given stack with one item
            String givenItem = "Item 1";
            stack.push(givenItem);
            // When pop the item from the stack
            String item = stack.pop();
            // Then stack should be empty
            Assertions.assertThat(stack.isEmpty()).isTrue();
            // Then removed item should be the same as added before
            Assertions.assertThat(item).isEqualTo(givenItem);
        }

    }

    @Test
    @DisplayName("Is full method should return false test")
    void isFullTest() {
        // Given empty stack
        // When the method is called
        boolean full = stack.isFull();
        //Then stack should not be full
        Assertions.assertThat(full).isFalse();
    }

    @Test
    @DisplayName("Is empty method should return true for empty stack test")
    void isEmptyTest() {
        // Given empty stack
        // When call the method
        boolean empty = stack.isEmpty();
        // Then stack should be empty true
        Assertions.assertThat(empty).isTrue();
    }

    @Test
    @DisplayName("Length method should return 1 for one item in the stack test")
    void lengthTest() {
        // Given stack with one item
        stack.push("Item 1");
        // When calling the method
        int length = stack.length();
        // Then the length should return one
        Assertions.assertThat(length).isEqualTo(1);
    }
}