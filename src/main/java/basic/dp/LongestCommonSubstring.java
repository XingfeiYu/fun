package basic.dp;

import utils.PrintUtils;

/**
 * Created by xingfeiy on 8/22/16.
 */
public class LongestCommonSubstring {
    public static int lcs(String str1, String str2) {
        if(str1 == null || str2 == null) {
            return 0;
        }

        int[][] matrix = new int[str1.length() + 1][str2.length() + 1];
        for(int i = 1; i < str1.length() + 1; i++) {
            for(int j = 1; j < str2.length() + 1; j++) {
                if(str1.charAt(i - 1) == str2.charAt(j - 1)) {
                    matrix[i][j] = matrix[i - 1][j - 1] + 1;
                } else {
                    matrix[i][j] = Math.max(matrix[i][j - 1], matrix[i - 1][j]);
                }
            }
        }
//        PrintUtils.print(matrix, str1.length() + 1, str2.length() + 1);
        return matrix[str1.length()][str2.length()];
    }

    public static void main(String[] args) {
        String str1 = "aaaba";
        String str2 = "aaaa";
        System.out.println(lcs(str1, str2));
    }
}
