package round1.arraystring;

import java.util.LinkedList;

/**
 * Write a function that takes a string as input and returns the string reversed.

 Example:
 Given s = "hello", return "olleh".

 * Created by xingfeiy on 6/15/16.
 */
public class ReverseString {
    public String reverseString(String s) {
        if(s == null || s.length() < 2) {
            return s;
        }

        int length = s.length();
        char[] chars = new char[length];
        for(int i = 0; i < s.length(); i++) {
            chars[length - i - 1] = s.charAt(i);
        }
        return new String(chars);
    }
}
