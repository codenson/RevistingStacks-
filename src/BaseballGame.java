
import java.util.Arrays;
import java.util.Stack;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author guero
 */
public class BaseballGame {

    public static void main(String[] args) {
        System.err.println(calPoints(new String[]{"5", "2", "C", "D", "+"}));
        System.err.println(calPoints(new String[]{"5", "-2", "4", "C", "D", "9", "+", "+"}));
        System.err.println(calPoints(new String[]{"1", "C"}));

    }

    public static int calPoints(String[] operations) {
        int tot = 0;
        Stack<Integer> stack = new Stack();

        for (String s : operations) {

            if (s.equals("C")) {
                if (!stack.isEmpty()) {
                    stack.pop();

                }

            } else if (s.equals("D")) {
                if (stack.size() > 0) {
                    stack.push(2 * stack.peek());

                }
            } else if (s.equals("+")) {

                int temp = stack.pop();
                int localTot = stack.peek() + temp;

                stack.push(temp);
                stack.push(localTot);

            } else {

                stack.push(Integer.parseInt(s));
            }

        }

        for (Integer n : stack) {
            tot += n;
        }
        return tot;
    }

}
