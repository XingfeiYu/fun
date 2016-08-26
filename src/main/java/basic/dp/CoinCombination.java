package basic.dp;

import java.util.Collections;

/**
 * Created by xingfeiy on 7/26/16.
 */
public class CoinCombination {

    /**
     * http://www.hawstein.com/posts/dp-novice-to-advanced.html
     * @param sum
     * @return
     */
    public static int getMinCombination(int sum) {
        if(sum < 1) {
            return 0;
        }
        int[] values = new int[]{1, 3, 5};

        int[] min = new int[sum + 1];
        for(int i = 0; i < sum + 1; i++) {
            min[i] = Integer.MAX_VALUE;
        }

        min[0] = 0;
        for(int i = 1; i < sum + 1; i++) {
            for(int j = 0; j < values.length; j++) {
                if(values[j] > i) {
                    break;
                }
                min[i] = Math.min(min[i - values[j]] + 1, min[i]);
            }
        }
        return min[sum];
    }

    public static int implLIS(int[] array) {
        if(array == null || array.length < 1) {
            return 0;
        }

        int[] max = new int[array.length];

        int maxValue = 1;
        for(int i = 0; i < array.length; i++) {
            max[i] = 1;
            for(int j = 0; j < i; j++) {
                if(array[j] <= array[i]) {
                    max[i] = Math.max(max[j] + 1, max[i]);
                    maxValue = Math.max(max[i], maxValue);
                }
            }
        }

        return maxValue;
    }

    public static int pickApple(int[][] array, int x, int y) {
        int[][] sums = new int[x][y];
        for(int i = 0; i < x; i++) {
            for(int j = 0; j < y; j++) {
                sums[i][j] = array[i][j] + Math.max(i > 0 ? sums[i - 1][j] : 0, j > 0 ? sums[i][j - 1] : 0);
            }
        }

        for(int i = 0; i < x; i++) {
            for(int j = 0; j< y; j++) {
                System.out.print(sums[i][j] + " ");
            }
            System.out.println();
        }
        return sums[x - 1][y - 1];
    }

    public static void main(String[] args) {
//        System.out.println(getMinCombination(0));
//        System.out.println(getMinCombination(1));
//        System.out.println(getMinCombination(2));
//        System.out.println(getMinCombination(3));
//        System.out.println(getMinCombination(4));
//        System.out.println(getMinCombination(5));
//        System.out.println(getMinCombination(6));
//        System.out.println(getMinCombination(7));
//        System.out.println(getMinCombination(8));
//        System.out.println(getMinCombination(9));
//        System.out.println(getMinCombination(10));
//        System.out.println(getMinCombination(11));

//        int[] array = new int[]{1, 2, 3, 4, 5, 6};
//        int[] array = new int[]{5, 4, 3, 2, 1};
//        System.out.println(implLIS(array));

        int[][] array = new int[3][3];
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                array[i][j] = i + 1;
            }
        }

        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println(pickApple(array, 3, 3));
    }
}
