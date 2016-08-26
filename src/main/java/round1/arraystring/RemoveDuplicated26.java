package round1.arraystring;

/**
 * Given a sorted array, remove the duplicates in place such that each element appear only once and return the new length.

 Do not allocate extra space for another array, you must do this in place with constant memory.

 For example,
 Given input array nums = [1,1,2],

 Your function should return length = 2, with the first two elements of nums being 1 and 2 respectively.
 It doesn't matter what you leave beyond the new length.
 * Created by xingfeiy on 7/7/16.
 */
public class RemoveDuplicated26 {
    /**
     * Start Time: 7:34PM
     * End Time: 7:40PM, failed due to don't understand the question, just returned the new length,
     * but didn't modify the array.
     * @param nums
     * @return
     */
    public int removeDuplicates(int[] nums) {
        if(nums == null || nums.length < 1) {
            return 0;
        }
        int p0 = 0;
        int p1 = 1;
        int count = nums.length;
        while (p1 < nums.length) {
            if(nums[p0] == nums[p1]) {
                count--;
            }
            p0 = p1++;
        }
        return count;
    }

    /**
     * Get one more try after understood the question.
     * Start Time: 7:45PM
     * End Time: 8:00PM
     * @param nums
     * @return
     */
    public int removeDuplicatesV2(int[] nums) {
        if(nums == null || nums.length < 1) {
            return 0;
        }
        int count = nums.length;
        int p0 = 0;
        int p1 = 1;
        while (p1 < nums.length) {
            if(nums[p0] == nums[p1]) {
                p1++;
                count--;
            } else {
                nums[++p0] = nums[p1++];
            }
        }
        return count;
    }
}
