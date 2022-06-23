package io.wolfinger.algos.ds;

import java.util.ArrayList;

public class Stack {
    private ArrayList<Integer> stack;

    public Stack() {
        stack = new ArrayList<Integer>();
    }

    public void push(int item) {
        // add to stack
        stack.add(item);
    }

    public int pop() {
        int item;

        // remove from stack
        if (stack.size() > 0) {
            item = stack.get(stack.size()-1);
            stack.remove(stack.size()-1);
        } else {
            item = 0; // return zero if stack is empty -- yes i know this can be confusing
        }

        return item;
    }

    public int read() {
        // read from stack
        if (stack.size() == 0) {
            return 0;
        } else {
            return(stack.get(stack.size()-1));
        }
    }
}
