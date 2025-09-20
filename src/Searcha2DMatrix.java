/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author guero
 */
public class Searcha2DMatrix {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[][] arr = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}};
//        System.err.println(searchMatrix(arr, 3));
//        System.err.println(searchMatrix(arr, 34));
//        System.err.println(searchMatrix(arr, -10));
              System.err.println(searchMatrix(arr, 24));
    }

    public static boolean searchMatrix(int[][] matrix, int target) {

        int start = 0;
        int end = matrix.length - 1;
        int mid = 0;

        while (start <= end) {
            mid = start + (end - start) / 2;
            if (target >= matrix[mid][0] && target <= matrix[mid][matrix[mid].length - 1]) {

                start = 0;
                end = matrix[mid].length - 1;
                int curr = mid;
                while (start <= end) {
                    mid = start + (end - start) / 2;
                    if (target == matrix[curr][mid]) {

                        return true;
                    } else if (target > matrix[curr][mid]) {
                        start = mid + 1;
                    } else {
                        end = mid - 1;

                    }

                }
                return false;
            } else if (target > matrix[mid][0] && target > matrix[mid][matrix[mid].length - 1]) {
                start = mid + 1;

            } else {

                end = mid - 1;

            }

        }

        return false;

    }
}
