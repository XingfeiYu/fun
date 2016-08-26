package round1.integer;

/**
 * Given an integer, write a function to determine if it is a power of two.
 *
 * Created by xingfeiy on 6/26/16.
 */
public class PowerOfTwo {
    public boolean isPowerOfTwo(int n) {
        if(n < 1) {
            return false;
        }

        int count = 0;
        while (n >= 1) {
            count += n & 1;
            n >>= 1;
        }
        return count == 1;
    }

    public boolean isPowerOfTwoV2(int n) {
        if(n < 1) {
            return false;
        }

        return Integer.bitCount(n) == 1;
    }

    /**
     * 1010 (10) - 1 = 1001(9)
     * 1110 (14) - 1 = 1101(13)
     * @param n
     * @return
     */
    public boolean isPowerOfTwoV3(int n) {
        if(n < 1) {
            return false;
        }
        return (n & (n - 1)) == 0;
    }
}
