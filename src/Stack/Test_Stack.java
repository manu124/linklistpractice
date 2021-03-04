package Stack;

import java.util.Stack;

public class Test_Stack {
    static void stack_push(Stack<Integer> stack) {
        for (int i = 0; i < 5; i++) {
            stack.push(i);
        }
    }

    static void stack_pop(Stack<Integer> stack) {
        System.out.println("pop operation");
        for (int i = 0; i < 5; i++) {
            Integer y = (Integer) stack.pop();
            System.out.println(y);
        }
    }

    //search element
    static void stack_peek(Stack<Integer> stack) {
        Integer element = (Integer) stack.peek();
        System.out.println("element on the stack top:" + element);
    }
    //search


    static void stack_search(Stack<Integer> stack, int element) {
        Integer pos = (Integer) stack.search(element);
        if (pos == -1) {
            System.out.println("element found");

        }
    }
}