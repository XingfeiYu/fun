package round1.dp;

/**
 * You are a professional robber planning to rob houses along a street. Each house has a certain amount of money stashed,
 * the only constraint stopping you from robbing each of them is that adjacent houses have security system connected and
 * it will automatically contact the police if two adjacent houses were broken into on the same night.

 Given a list of non-negative integers representing the amount of money of each house, determine the maximum amount of
 money you can rob tonight without alerting the police.

 * Created by xingfeiy on 7/26/16.
 */
public class HouseRobber198 {
    public int rob(int[] nums) {
        if(nums == null || nums.length < 1) {
            return 0;
        } else if(nums.length == 1) {
            return nums[0];
        }

        int[] max = new int[nums.length];
        max[0] = nums[0];
        max[1] = Math.max(nums[0], nums[1]);
        for(int i = 2; i < nums.length; i++) {
            max[i] = nums[i];
            max[i] = Math.max(max[i] + max[i - 2], max[i - 1]);
        }
        return max[max.length - 1];
    }
}
