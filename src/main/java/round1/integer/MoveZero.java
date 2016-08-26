package round1.integer;

import java.util.ArrayList;
import java.util.List;

/**
 * Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.

 For example, given nums = [0, 1, 0, 3, 12], after calling your function, nums should be [1, 3, 12, 0, 0].

 Note:
 You must do this in-place without making a copy of the array.
 Minimize the total number of operations.

 * Created by xingfeiy on 6/20/16.
 */
public class MoveZero {
    public void moveZeroes(int[] nums) {
        if(nums == null || nums.length < 2) {
            return;
        }
        List<Integer> zeroIndex = new ArrayList<>();
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == 0) {
                zeroIndex.add(i);
            }
        }

        zeroIndex.add(nums.length);
        for(int i = 0; i < zeroIndex.size() - 1; i++) {
            if(zeroIndex.get(i + 1) - zeroIndex.get(i) < 2) {
                continue;
            } else {
                for(int j = zeroIndex.get(i) + 1; j < zeroIndex.get(i + 1); j++) {
                    nums[j - i - 1] = nums[j];
                    nums[j] = 0;
                }
            }
        }
    }

    public void moveZeroesBetter(int[] nums) {
        if(nums == null || nums.length < 2) {
            return;
        }
        int count = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != 0) {
                nums[count++] = nums[i];
            }
        }

        while (count < nums.length) {
            nums[count++] = 0;
        }
    }


}
