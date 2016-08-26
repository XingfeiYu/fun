package round1.integer;

import java.util.*;

/**
 * Created by xingfeiy on 9/14/15.
 *
 * Given an array of integers, find two numbers such that they add up to a specific target number.

 The function twoSum should return indices of the two numbers such that they add up to the target, where index1 must be less than index2. Please note that your returned answers (both index1 and index2) are not zero-based.

 You may assume that each input would have exactly one solution.

 Input: numbers={2, 7, 11, 15}, target=9
 Output: index1=1, index2=2
 */
public class TwoSum {

    public int[] solution1(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        int[] results = new int[2];
        for(int i = 0; i < nums.length; i++) {
            if(map.containsKey(nums[i])) {
                results[0] = map.get(nums[i]) + 1;
                results[1] = i + 1;
                return results;
            } else {
                map.put(target - nums[i], i);
            }
        }
        return results;
    }


}
