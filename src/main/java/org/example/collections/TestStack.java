package org.example.collections;

import java.util.Stack;

public class TestStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println(stack.peek());

        while(!stack.isEmpty()) {
            System.out.println(stack.pop());
        }

     }
}
