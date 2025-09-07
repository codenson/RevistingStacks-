
import java.util.Stack;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author guero
 */
public class EvaluateReversePolishNotation {

    public static void main(String[] args) {
        System.out.println(evalRPN(new String[]{"2", "1", "+", "3", "*"}));
        System.out.println(evalRPN(new String[]{"4", "13", "5", "/", "+"}));
        System.out.println(evalRPN(new String[]{"10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"}));
//         System.out.println(evalRPN(new String[]{"18"}));

    }

    public static int evalRPN(String[] tokens) {
        int tot = Integer.parseInt(tokens[0]);;
        Stack<String> st = new Stack();
        int val = 0;
        String operand = "+-*/";

        for (String s : tokens) {

            if (!operand.contains(s)) {
                st.push(s);

            } else {
                int val2 = Integer.parseInt(st.pop());
                int val1 = Integer.parseInt(st.pop());
                if (s.equals("+")) {
                    tot = val2 + val1;
                    st.push(String.valueOf(tot));

                } else if (s.equals("-")) {
                    tot = val1 - val2;
                    st.push(String.valueOf(tot));

                } else if (s.equals("*")) {
                    tot = val1 * val2;
                    st.push(String.valueOf(tot));

                } else {

                    if (val2 != 0) {
                        tot = val1 / val2;
                        st.push(String.valueOf(tot));
                    }

                }

            }

        }

        return tot;

    }

    public static int evalRPN1(String[] tokens) {
        int tot = Integer.parseInt(tokens[0]);;
        Stack<String> st = new Stack();
        int val = 0;

        for (String s : tokens) {

            if (!st.isEmpty()) {
                if (s.equals("+")) {

                    val = Integer.parseInt(st.pop()) + Integer.parseInt(st.pop());

                    st.push(String.valueOf(val));
                    tot = val;

                } else if (s.equals("-")) {
                    int val1 = Integer.parseInt(st.pop());
                    int val2 = Integer.parseInt(st.pop());
                    val = Integer.parseInt(String.valueOf(val2 - val1));

                    st.push(String.valueOf(val));
                    tot = val;

                } else if (s.equals("*")) {
                    val = Integer.parseInt(st.pop()) * Integer.parseInt(st.pop());

                    st.push(String.valueOf(val));
                    tot = val;

                } else if (s.equals("/")) {
                    int val1 = Integer.parseInt(st.pop());
                    int val2 = Integer.parseInt(st.pop());
                    if (val1 != 0) {
                        val = val2 / val1;
                        st.push(String.valueOf(val));
                        tot = val;

                    }

                } else {
                    st.push(s);

                }

            } else {

                st.push(s);
            }

        }

        return tot;

    }

}
