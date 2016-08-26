package round1.arraystring;

import java.util.HashSet;
import java.util.Set;

/**
 * Given an array of integers, find if the array contains any duplicates.
 * Your function should return true if any value appears at least twice in the array,
 * and it should return false if every element is distinct.
 * Created by xingfeiy on 6/22/16.
 */
public class ContainDuplicate {
    public static boolean containsDuplicate(int[] nums) {
        if(nums == null || nums.length < 2) {
            return false;
        }
        Set<Integer> set = new HashSet<>();
        for(int num : nums) {
            if(set.contains(num)) {
                return true;
            } else {
                set.add(num);
            }
        }
        return false;
    }
}
