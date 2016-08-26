package basic.common;


import round1.tree.SymmetricTree;
import utils.PrintUtils;

/**
 * Created by xingfeiy on 8/11/16.
 */
public class FloydWarshallGraph {
    public static int[][] impl(int[][] array, int n) {
        if(array == null) {
            return null;
        }

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                for(int k = 0; k < n; k++) {
                    if(array[i][k] == Integer.MAX_VALUE || array[k][j] == Integer.MAX_VALUE) {
                        continue;
                    }

                    if(array[i][j] > array[i][k] + array[k][j]) {
                        array[i][j] = array[i][k] + array[k][j];
                    }
                }
            }
        }
        return array;
    }

    public static void main(String[] args) {
        int[][] array = new int[4][4];
        array[0][0] = 0;
        array[0][1] = 5;
        array[0][2] = Integer.MAX_VALUE;
        array[0][3] = 10;

        array[1][0] = Integer.MAX_VALUE;
        array[1][1] = 0;
        array[1][2] = 3;
        array[1][3] = Integer.MAX_VALUE;

        array[2][0] = Integer.MAX_VALUE;
        array[2][1] = Integer.MAX_VALUE;
        array[2][2] = 0;
        array[2][3] = 1;

        array[3][0] = Integer.MAX_VALUE;
        array[3][1] = Integer.MAX_VALUE;
        array[3][2] = Integer.MAX_VALUE;
        array[3][3] = 0;

        PrintUtils.print(array, 4, 4);
        System.out.println("-------------");
        PrintUtils.print(impl(array, 4), 4, 4);
    }
}
