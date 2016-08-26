package round1.integer;

/**
 * Write a function that takes an unsigned integer and returns the number of ’1' bits it has (also known as the Hamming weight).

 For example, the 32-bit integer ’11' has binary representation 00000000000000000000000000001011, so the function should return 3.

 * Created by xingfeiy on 6/24/16.
 */
public class NumberOf1 {
    public int hammingWeight(int n) {
        int count = 0;
        long un = Integer.toUnsignedLong(n);
        while (un > 0) {
            count += (un & 1);
            un = un >> 1;
        }
        return count;
    }
}
