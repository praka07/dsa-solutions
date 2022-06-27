package com.dsa.solution.sap.interview;

import java.util.Stack;

public class ImplementQByStack {
    //1 . push
    // 2.pop
    //3.enQ
    //4.DQ
    Stack<Integer> stackOne = new Stack<Integer>();
    Stack<Integer> stackTwo = new Stack<Integer>();

    public static void main(String[] args) {


    }

    public void enQ(int input) {

        while (!stackOne.empty()) {
            stackTwo.push(stackOne.pop());
        }

        stackOne.push(input);

    }

    public int deQ() {

        return stackTwo.pop();

    }

}
