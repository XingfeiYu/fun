package round1.integer;

/**
 * Calculate the sum of two integers a and b, but you are not allowed to use the operator + and -.

 Example:
 Given a = 1 and b = 2, return 3.

 * Created by xingfeiy on 6/29/16.
 */
public class SumTowIntegers371 {
    /**
     * Start Time: 10:53PM
     * End Time: 10:54, have no idea in 10 mins.
     *
     * Start it again: 10:58AM
     *
     * @param a
     * @param b
     * @return
     */
    public int getSum(int a, int b) {
        int carry = 0;
        while (b != 0) {
            carry = a & b;
            a = a ^ b;
            b = carry << 1;
        }
        return a;
    }

    public static void main(String[] args) {
        System.out.println(Integer.toBinaryString(0)); //0
        System.out.println(Integer.toBinaryString(0<<1)); //0
        System.out.println(Integer.toBinaryString(0>>1)); //0
        System.out.println(Integer.toBinaryString(1<<1)); //0
        System.out.println(Integer.toBinaryString(-1)); //11111111111111111111111111111111
        System.out.println(Integer.toBinaryString(-1>>1)); //11111111111111111111111111111111
        System.out.println(Integer.toBinaryString(-1>>10)); //11111111111111111111111111111111
        System.out.println(Integer.toBinaryString(-1<<10)); //11111111111111111111111111111111
        System.out.println(Integer.toBinaryString(-2)); //11111111111111111111111111111110
        System.out.println(Integer.toBinaryString(1)); //1
        System.out.println(Integer.toBinaryString(Integer.MAX_VALUE)); //1111111111111111111111111111111
        System.out.println(Integer.toBinaryString(Integer.MIN_VALUE)); //10000000000000000000000000000000
    }
}
