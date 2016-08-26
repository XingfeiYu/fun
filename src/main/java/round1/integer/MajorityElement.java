package round1.integer;

import java.util.Arrays;

/**
 * Created by xingfeiy on 6/22/16.
 */
public class MajorityElement {
    public static int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }
}
