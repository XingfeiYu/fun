package round1.integer;

/**
 * The count-and-say sequence is the sequence of integers beginning as follows:
 1, 11, 21, 1211, 111221, ...

 1 is read off as "one 1" or 11.
 11 is read off as "two 1s" or 21.
 21 is read off as "one 2, then one 1" or 1211.
 Given an integer n, generate the nth sequence.

 Note: The sequence of integers will be represented as a string.
 * Created by xingfeiy on 7/20/16.
 */
public class CountAndSay38 {
    public String countAndSay(int n) {
        int countSame = 1;
        int preValue = n % 10;
        n = n / 10;
        String result = "";
        while (n > 0) {
            int value = n % 10;
            if(value != preValue) {
                result = Integer.toString(countSame) + preValue + result;
                countSame = 1;
            } else {
                countSame++;
            }
            preValue = value;
            n = n / 10;
        }

        if(countSame > 0) {
            result = Integer.toString(countSame) + preValue + result;
        }

        return result;
    }
}
