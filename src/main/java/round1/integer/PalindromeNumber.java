package round1.integer;

/**
 * Determine whether an integer is a palindrome. Do this without extra space.
 * Created by xingfeiy on 7/8/16.
 */
public class PalindromeNumber {
    /**
     * palindrome means, a word or a number that reads the same backwards or forwards.
     * Start Time: 1:57PM
     * @param x
     * @return
     */
    public boolean isPalindrome(int x) {
        if(x < 0) {
            return false;
        }

        int num = x;
        int dig = 0;
        int sum = 0;
        while (num > 0) {
            dig = num % 10;
            sum = sum * 10 + dig;
            num = num / 10;
        }
        return sum == x;
    }
}
