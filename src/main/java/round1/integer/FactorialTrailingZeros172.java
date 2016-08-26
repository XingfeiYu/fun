package round1.integer;

/**
 * Given an integer n, return the number of trailing zeroes in n!.

 Note: Your solution should be in logarithmic time complexity.

 * Created by xingfeiy on 7/27/16.
 */
public class FactorialTrailingZeros172 {
    public int trailingZeroes(int n) {
        if(n == 0) {
            return 0;
        }
//        int m = n / 5;
//        int count = m;
//        int index = 5;
//        while (m > 0) {
//            index = index * 5;
//            m = n / index;
//            count += m;
//        }
//        return count;
        int count = 0;

        // Keep dividing n by powers of 5 and update count
        for (int i=5; n/i>=1; i *= 5)
            count += n/i;

        return count;
    }

    public static void main(String[] args) {
        System.out.println(new FactorialTrailingZeros172().trailingZeroes(0));
        System.out.println(new FactorialTrailingZeros172().trailingZeroes(3));
        System.out.println(new FactorialTrailingZeros172().trailingZeroes(8));
        System.out.println(new FactorialTrailingZeros172().trailingZeroes(10));
        System.out.println(new FactorialTrailingZeros172().trailingZeroes(30));
    }
}
