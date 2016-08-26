package round1.dp;

/**
 * After robbing those houses on that street, the thief has found himself a new place for his thievery so that he will
 * not get too much attention. This time, all houses at this place are arranged in a circle. That means the first house
 * is the neighbor of the last one. Meanwhile, the security system for these houses remain the same as for those in the previous street.

 Given a list of non-negative integers representing the amount of money of each house, determine the maximum amount of
 money you can rob tonight without alerting the police.
 * Created by xingfeiy on 8/1/16.
 */
public class HouseRobber213 {
    public int rob(int[] nums) {
        if(nums == null || nums.length < 1) {
            return 0;
        }
        if(nums.length == 1) {
            return nums[0];
        } else if(nums.length == 2) {
            return Math.max(nums[0], nums[1]);
        }

        int[] max = new int[nums.length - 1];
        max[0] = nums[0];
        max[1] = Math.max(nums[0], nums[1]);
        for(int i = 2; i < nums.length - 1; i++) {
            max[i] = Math.max(max[i - 2] + nums[i], max[i - 1]);
        }

        int[] max2 = new int[nums.length - 1];
        max2[0] = nums[1];
        max2[1] = Math.max(nums[1], nums[2]);
        for(int i = 3; i < nums.length; i++) {
            max2[i - 1] = Math.max(max2[i - 3] + nums[i], max2[i - 2]);
        }
        return Math.max(max[nums.length - 2], max2[nums.length - 2]);

    }


    public static void main(String[] args) {
        int[] array = new int[4];
        array[0] =  1;
        array[1] =  1;
        array[2] =  1;
        array[3] =  1;
        System.out.println(new HouseRobber213().rob(array));
    }

}
