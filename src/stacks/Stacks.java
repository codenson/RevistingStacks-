/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package stacks;

import java.util.Arrays;
import java.util.Stack;

/**
 *
 * @author guero
 */
public class Stacks {

    int[] arr = new int[10];
    int size = 0;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Stacks m = new Stacks();
        ///  System.err.println(  m.push(10));
        m.push(10);
        m.push(20);
        m.push(30);
        m.push(40);
        m.push(50);
        m.printStack();
        System.err.println(" : " + m.peek() + "  " + m.pop() + +m.peek());
        System.err.println(" : " + m.peek() + " " + m.pop());
        System.err.println(" : " + m.peek() + " " + m.pop());
        System.err.println(" : " + m.peek() + " " + m.pop());
        System.err.println(" : " + m.peek() + " " + m.pop());
        System.err.println(" : " + m.peek() + " " + m.pop());
    }

    public void printStack() {
        for (int i = 0; i < size; i++) {
            System.out.println(arr[i]);
        }

    }
    public int size(){
    return size; 
    }
    public boolean isEmpty(){
    return size ==0;
    }

    public boolean push(int val) {

        int[] temp = new int[size + 1];
        for (int i = 0; i < size; i++) {
            temp[i] = arr[i];

        }
        temp[size] = val;
        size++;
        arr = temp;
        return true;

    }

    public int pop() {
        if (size > 0) {

            int val = arr[size - 1];
            int[] temp = new int[size - 1];
            for (int i = 0; i < size - 1; i++) {
                temp[i] = arr[i];

            }
            arr = temp;
            size--;
            return val;
        }

        return Integer.MIN_VALUE;

    }

    public int peek() {
        if (size != 0) {
            return arr[size - 1];

        }
        return Integer.MIN_VALUE;

    }

}
