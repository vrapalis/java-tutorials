package www.vrapalis.com.datastructures.stack;

import lombok.val;

public class StackRunner {
    public static void main(String[] args) {
        System.out.println("Stack Runner ...");

        System.out.println("---");
        System.out.println("Array Bound Stack: [||,||,||]");
        val arrayBoundStack = new ArrayStack<String>(3);
        arrayBoundStack.push("Item 1");
        arrayBoundStack.push("Item 2");
        arrayBoundStack.push("Item 3");
        System.out.println(arrayBoundStack);
        System.out.println("---");

        System.out.println("---");
        System.out.println("Linked Stack: ->||->||->||");
        val linkedStack = new LinkedStack<String>();
        linkedStack.push("Item 1");
        linkedStack.push("Item 2");
        linkedStack.push("Item 3");
        System.out.println(linkedStack);
        System.out.println("---");
    }
}
