package com.com.day2.bootcamp;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by akhil on 17/3/17.
 */

//Design a Data Structure SpecialStack that supports all the stack operations like push(), pop(), isEmpty(), isFull()
// and an additional operation getMin() which should return minimum element from the SpecialStack.
// (Expected complexity ­ O(1))

public class Q9 {
    static int[] specialStack;
    static int pointer = 0;
    private static int min = Integer.MAX_VALUE;
    static List<Integer> list = new LinkedList<>();

    static void push(int el) {
        specialStack[pointer] = el;
        pointer++;
        if (el <= min)
            min = el;
    }

    static void updateMin(){
        min=specialStack[pointer-1];
        System.out.println("in update min min is "+min);
        for(int i=0;i<pointer;i++){
            if(specialStack[i]<min)
                min=specialStack[i];
        }

    }

    static int pop() {
        pointer--;
        if(specialStack[pointer]==min) {
            min=specialStack[pointer];
            updateMin();
        }
        return specialStack[pointer];

    }

    static int getMin(){
        return min;
    }

    static void printStack(){
        for(int i=0;i<pointer;i++){
            System.out.println(specialStack[i]);
        }
    }

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int size = sc.nextInt();
        specialStack = new int[size];
        push(2);
        push(22);
        push(25);
        push(26);
        push(82);
        push(29);
        push(1);
        push(20);
        printStack();
        System.out.println("popped value "+pop());
        System.out.println("minimum is "+getMin());
        System.out.println("popped value "+pop());
        System.out.println("minimum is "+getMin());
        System.out.println("popped value "+pop());
        System.out.println("minimum is "+getMin());
        System.out.println("popped value "+pop());
        System.out.println("minimum is "+getMin());


    }
}
