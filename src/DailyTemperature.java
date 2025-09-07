
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author guero
 */
public class DailyTemperature {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        System.out.println(Arrays.toString(dailyTemperatures(new int[]{73, 74, 75, 71, 69, 72, 76, 73})));
//        System.out.println(Arrays.toString(dailyTemperatures(new int[]{30, 40, 50, 60})));
//        System.out.println(Arrays.toString(dailyTemperatures(new int[]{30, 60, 90})));
//        System.out.println(Arrays.toString(dailyTemperatures(new int[]{73, 74, 75, 71, 69, 72, 76, 73})));
//        System.out.println(Arrays.toString(dailyTemperatures(new int[]{89, 62, 70, 58, 47, 47, 46, 76, 100, 70})));
        System.out.println(Arrays.toString(dailyTemperatures(new int[]{55, 38, 53, 81, 61, 93, 97, 32, 43, 78})));
    }

    public static int[] dailyTemperatures(int[] temperatures) {

        int[] arr = new int[temperatures.length];
        Stack<Integer> st = new Stack();

        for (int i = 0; i < temperatures.length; i++) {

            while (!st.isEmpty() && temperatures[i] > temperatures[st.peek()]) {
                arr[st.peek()] = i - st.pop();

            }

            st.push(i);

        }

        return arr;

    }

    public static int[] dailyTemperatures3(int[] temperatures) {

        int m = 0;
        for (int i = 1; i < temperatures.length; i++) {

            if (temperatures[i] <= temperatures[m]) {

                if (m < i && i == temperatures.length - 1) {

                    temperatures[m++] = 0;

                    i = m;

                }

            } else if (temperatures[i] > temperatures[m]) {
                if ((i - m + 1) == 0) {
                    temperatures[m++] = 1;//

                } else {
                    temperatures[m++] = i - m + 1;//

                    i = m;

                }
            }

        }
        temperatures[temperatures.length - 1] = 0;

        return temperatures;

    }

    public int[] dailyTemperatures2(int[] temperatures) {
        Stack<Integer> s = new Stack();
        int[] arr = new int[temperatures.length];
        int m = 0;
        int counter = 0;
        for (int i = 1; i < temperatures.length; i++) {

            int val = temperatures[m];
            int val2 = temperatures[i];
            if (temperatures[i] <= val) {
                if (s.isEmpty()) {
                    s.push(val);
                }
                s.push(temperatures[i]);
                if (m < i && i == temperatures.length - 1) {

                    arr[m++] = 0;
                    s = new Stack();
                    i = m;

                }

            } else {
                if (s.isEmpty()) {
                    arr[m++] = 1;
                } else {
                    arr[m++] = s.size();
                    s = new Stack();
                    i = m;

                }

            }

        }

        return arr;

    }

    public static int[] dailyTemperatures1(int[] temperatures) {
        Stack<Integer> s = new Stack();
        // int j =1; 
        List<Integer> list = new ArrayList();
        int m = 0;
//          int trigger = 0; 

        for (int i = 0; i < temperatures.length; i++) {

//              if (s.isEmpty())
            {
                int counter = 1;
                int trigger = 0;

                for (int j = i + 1; j < temperatures.length; j++) {

                    if (temperatures[j] > temperatures[i]) {
                        trigger++;
                        temperatures[m] = counter;

                        break;

                    }
                    counter++;

                }
                if (trigger == 0) {
                    temperatures[m] = 0;

                }
//                  trigger = 0; 

                m++;
                //  temperatures[m++]= counter; 

                //  list.add(counter);
            }

        }
        System.err.println("" + list);

        return temperatures;

    }

}
