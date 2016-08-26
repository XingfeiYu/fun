package round1.integer;

/**
 * Given an integer (signed 32 bits), write a function to check whether it is a power of 4.

 Example:
 Given num = 16, return true. Given num = 5, return false.

 Follow up: Could you solve it without loops/recursion?
 * Created by xingfeiy on 6/30/16.
 */
public class PowerOfFour342 {
    /**
     * It's similar issue with power of three.
     * Start it from 7:34PM
     * Finish it at 7:39PM, but failed, two errors:
     * 1. num = 0, failed
     * 2. num =2
     * 1  --> 00000001
     * 4  --> 00000100
     * 16 --> 00010000
     * @param num
     * @return
     */
    public boolean isPowerOfFour(int num) {
        if(num < 1) {
            return false;
        }
        return ((num & (num - 1)) == 0) && ((num & 0x55555555) == num);
    }
}
