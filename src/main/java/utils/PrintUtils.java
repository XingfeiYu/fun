package utils;


import java.util.List;

/**
 * Created by xingfeiy on 9/16/15.
 */
public class PrintUtils {
    public static void print(int[] array) {
        for(int i : array) {
            System.out.print(i);
            System.out.print(", ");
        }
        System.out.println();
    }

    public static void print(int[][] arrays, int n, int m) {
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                System.out.print(arrays[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void print(List<List<Integer>> lists) {
        for(List<Integer> list : lists) {
            for(int value : list) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}
