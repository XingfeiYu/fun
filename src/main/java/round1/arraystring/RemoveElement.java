package round1.arraystring;

import java.util.Arrays;

/**
 * Given an array and a value, remove all instances of that value in place and return the new length.

 Do not allocate extra space for another array, you must do this in place with constant memory.

 The order of elements can be changed. It doesn't matter what you leave beyond the new length.

 Example:
 Given input array nums = [3,2,2,3], val = 3

 Your function should return length = 2, with the first two elements of nums being 2.
 * Created by xingfeiy on 7/7/16.
 */
public class RemoveElement {

    /**
     * The key point of this question is, it doesn't matter what you leave beyond the new length.
     * @param nums
     * @param val
     * @return
     */
    public int removeElement(int[] nums, int val) {
        if (nums == null || nums.length < 1) {
            return 0;
        }

        int i=0;
        int j=0;

        while(j < nums.length){
            if(nums[j] != val){
                nums[i] = nums[j];
                i++;
            }

            j++;
        }

        return i;
    }

    /**
     * Start Time: 8:08
     * End Time, didn't get it done in 20 mins, failed.
     * @param nums
     * @param val
     * @return
     */
//    public int removeElement(int[] nums, int val) {
//        if(nums == null || nums.length < 1) {
//            return 0;
//        }
//
//        Arrays.sort(nums);
//        if(val < nums[0] || val > nums[nums.length - 1]) {
//            return nums.length;
//        }
//
//        int position = binarySearch(nums, 0, nums.length -1, val);
//        if(position < 0) {
//            return nums.length;
//        }
//        int first = position;
//        int end = position;
//        while (first >= 0 && nums[--first] != val) {}
//        while (end < nums.length && nums[++end] != val) {}
//        int length = end - first + 1;
//        for(int i = end; i < nums.length; i++) {
//            nums[i - length] = nums[i];
//        }
//        return nums.length - length;
//    }
//
//    public int binarySearch(int[] nums, int start, int end, int val) {
//        int mid = (start + end) / 2;
//        if(mid < 1) {
//            return -1;
//        }
//        if(nums[mid] == val) {
//            return mid;
//        } else if(nums[mid] < val) {
//            return binarySearch(nums, mid + 1, end, val);
//        } else {
//            return binarySearch(nums, start, mid, val);
//        }
//    }

}
