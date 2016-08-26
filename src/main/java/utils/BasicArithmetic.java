package utils;

import java.util.Arrays;

/**
 * Created by xingfeiy on 9/14/15.
 */
public class BasicArithmetic {

    public int findDifference(int[] num, int k) {
        if(num == null || num.length < 2) {
            return 0;
        }
        Arrays.sort(num);
        int i = 0;
        int count = 0;
        for(int j = 1; j < num.length;) {
            if(num[j] - num[i] == k) {
                count++;
                i++;
            } else if(num[j] - num[i] < k) {
                j++;
            } else {
                i++;
            }
        }
        return count;
    }

    public int findDifference2(int[] num, int k)
    {
        int count = 0;
        for (int i = 0; i < num.length; i++)
        {
            for (int j = i + 1; j < num.length; j++)
                if (Math.abs(num[i] - num[j]) == k)
                    count++;
        }
        return count;
    }
}
