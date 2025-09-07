/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author guero
 */
public class test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        User user1  = new User("Josh", 22);
//        user1.sayHi();
        System.out.println(climbStairs(10));
    }
     public static int climbStairs(int n){
         
         if (n  == 1){
         return 1; 
         }
         else if (n  == 2){
         return 2; 
         }
         int tot  = 0; 
         tot+=climbStairs( n-1)+climbStairs( n-2);
         return tot; 
    
     }

    public static int climbStairs1(int n) {
        // HashMap <Integer, Integer> map = new HashMap(); 
        // map.put(1, 1); 
        //  map.put(2, 2); 
        int[] arr = new int[n + 1];
        if (n == 1) {
            return 1;
        } else if (n == 2) {
            return 2;
        } else {

            for (int i = 1; i <= n; i++) {
                if (i == 1) {
                    arr[1] = 1;
                } else if (i == 2) {
                    arr[2] = 2;

                } else {
                    arr[i] = arr[i - 1] + arr[i - 2];

                }

            }
        }

        return arr[n];

    }

    public record User(String name, int age) {

        public void sayHi() {
            System.err.println(name + " " + age + " says hi :");

        }

    }

}
