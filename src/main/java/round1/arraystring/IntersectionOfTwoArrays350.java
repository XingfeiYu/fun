package round1.arraystring;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Given two arrays, write a function to compute their intersection.

 Example:
 Given nums1 = [1, 2, 2, 1], nums2 = [2, 2], return [2, 2].

 Note:
 Each element in the result should appear as many times as it shows in both arrays.
 The result can be in any order.

 Follow up:
 What if the given array is already sorted? How would you optimize your algorithm?
 What if nums1's size is small compared to nums2's size? Which algorithm is better?
 What if elements of nums2 are stored on disk, and the memory is
 limited such that you cannot load all elements into the memory at once?

 * Created by xingfeiy on 7/1/16.
 */
public class IntersectionOfTwoArrays350 {
    /**
     * Start it from 11:20AM
     * Finish it: 11:41AM
     * @param nums1
     * @param nums2
     * @return
     */
    public int[] intersect(int[] nums1, int[] nums2) {
        if(nums1 == null || nums2 == null) {
            return null;
        }
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int[] small = nums1.length < nums2.length ? nums1 : nums2;
        int[] large = nums1.length < nums2.length ? nums2 : nums1;
        List<Integer> list = new ArrayList<>();
        int j = 0;
        for(int i = 0; i < small.length; i++) {
            for(; j < large.length;) {
                if(small[i] == large[j]) {
                    list.add(small[i]);
                    j++;
                    break;
                } else if(small[i] < large[j]) {
                    break;
                } else {
                    j++;
                }
            }
        }
        int[] results = new int[list.size()];
        int i =0;
        for(int value : list) {
            results[i++] = value;
        }
        return results;
    }
}
