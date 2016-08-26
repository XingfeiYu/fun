package round1.arraystring;

import java.util.*;

/**
 * Given an array of integers and an integer k, find out whether there are two distinct indices i and j in the array
 * such that nums[i] = nums[j] and the difference between i and j is at most k.
 * Created by xingfeiy on 7/8/16.
 */
public class ContainDuplicate219 {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if(nums == null || nums.length < 2) {
            return false;
        }
        Map<Integer, List<Integer>> maps = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            if(!maps.containsKey(nums[i])) {
                List<Integer> set = new ArrayList<>();
                set.add(i);
                maps.put(nums[i], set);
            } else {
                List<Integer> list = maps.get(nums[i]);
                if(i - list.get(list.size() - 1) <= k) {
                    return true;
                } else {
                    maps.get(nums[i]).add(i);
                }
            }
        }
        return false;
    }
}
