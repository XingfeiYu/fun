package round1.integer;


/**
 * Given an integer, write a function to determine if it is a power of three.

 Follow up:
 Could you do it without using any loop / recursion?

 * Created by xingfeiy on 6/26/16.
 */
public class PowerOfThree {
    /**
     * 3  = 00000011
     * 9  = 00001001
     * 27 = 00011011
     * 81
     * 243 / 9 = 67
     * @param n
     * @return
     */
    public static boolean isPowerOfThree(int n) {
        if(n < 1) {
            return false;
        }
        double value = Math.log(n) / Math.log(3);
        long l = Math.round(value);
        //unaccepted.
        return Double.compare(Math.round(value), value) == 0;
    }

    public static boolean isPowerOfThreeV2(int n) {
        if(n < 1) {
            return false;
        }

        int max3Power = (int)(Math.log(Integer.MAX_VALUE) / Math.log(3));
        int max3PowerValue = (int)Math.pow(3, max3Power);
        return max3PowerValue % n == 0;
    }
}
