package round1.arraystring;

/**
 * Given a non-negative number represented as an array of digits, plus one to the number.

 The digits are stored such that the most significant digit is at the head of the list.
 * Created by xingfeiy on 6/30/16.
 */
public class PlusOne66 {
    /**
     * Start it from 1:47PM
     * Done it. 1:59PM
     * @param digits
     * @return
     */
    public int[] plusOne(int[] digits) {
        int carry = 1;
        for(int i = digits.length -1; i >=0; i--) {
            if(digits[i] + carry > 9) {
                carry = 1;
                digits[i] = digits[i] + carry - 10;
            } else {
                digits[i] = digits[i] + carry;
                carry = 0;
            }
        }
        if(carry > 0) {
            int[] result = new int[digits.length + 1];
            result[0] = carry;
            for(int i = 0; i < digits.length; i++) {
                result[i + 1] = digits[i];
            }
            return result;
        }
        return digits;
    }
}
