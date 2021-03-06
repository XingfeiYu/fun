package round1.integer;

/**
 * Write a program to check whether a given number is an ugly number.

 Ugly numbers are positive numbers whose prime factors only include 2, 3, 5. For example, 6, 8 are ugly
 while 14 is not ugly since it includes another prime factor 7.

 Note that 1 is typically treated as an ugly number.

 * Created by xingfeiy on 6/27/16.
 */
public class UglyNumber {
    public boolean isUgly(int num) {
        if(num < 1) {
            return false;
        }

        while (num != 1) {
            if(num % 2 == 0) {
                num /= 2;
            } else if(num % 3 == 0) {
                num /= 3;
            } else if(num % 5 == 0) {
                num /= 5;
            } else {
                return false;
            }
        }
        return true;
    }

}
