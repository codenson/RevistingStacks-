
import java.util.Stack;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author guero
 */
public class ValidParenthisis {

    public static void main(String[] args) {
        System.out.println(isValid("()"));
        System.out.println(isValid("()[]{}"));
        System.out.println(isValid("(]"));

    }

    public static boolean isValid(String s) {
        Stack<Character> st = new Stack();

        for (Character c : s.toCharArray()) {

            if (!st.isEmpty()) {
             

                    if (c == ')') {
                        if (st.pop() != '(') {
                            return false;
                        }

                    } else if (c == '}') {
                        if (st.pop() != '{') {
                            return false;
                        }

                    } else if (c == ']') {
                        if (st.pop() != '[') {
                            return false;
                        }

                    } else {
                        st.push(c);
                    }
                
            }
            else {
            st.push(c); 
            }

        }

        return st.isEmpty();

    }
}
