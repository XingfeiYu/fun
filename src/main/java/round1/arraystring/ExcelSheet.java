package round1.arraystring;

/**
 * Related to question Excel Sheet Column Title

 Given a column title as appear in an Excel sheet, return its corresponding column number.

 For example:

 A -> 1
 B -> 2
 C -> 3
 ...
 Z -> 26
 AA -> 27
 AB -> 28 = 26 + 2

 BA->53 = 26 * 2 + 1

 AAA->703 = 26 * 26 + 26 + 1
 * Created by xingfeiy on 6/22/16.
 */
public class ExcelSheet {
    public static int titleToNumber(String s) {
        char[] chars = s.toCharArray();
        int number = 0;
        for(int i = 0; i < chars.length; i++) {
            number += (chars[i] - 'A' + 1) * Math.pow(26, chars.length - i - 1);
        }
        return number;
    }
}
