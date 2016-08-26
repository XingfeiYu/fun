package round1.arraystring;

/**
 * Write a function that takes a string as input and reverse only the vowels of a string.

 Example 1:
 Given s = "hello", return "holle".

 Example 2:
 Given s = "leetcode", return "leotcede".
 * Created by xingfeiy on 7/7/16.
 */
public class ReverseVowels345 {
    /**
     * Start Time 4:01PM
     * End Time: 4:11PM
     * @param s
     * @return
     */
    public String reverseVowels(String s) {
        if(s == null || s.length() < 2) {
            return s;
        }
        char[] chars = s.toCharArray();
        int front = 0;
        int back = chars.length - 1;
        while (front < back) {
            if(isVowel(chars[front]) && isVowel(chars[back])) {
                char tmp = chars[front];
                chars[front] = chars[back];
                chars[back] = tmp;
                front++;
                back--;
            } else if(isVowel(chars[front])) {
                back--;
            } else if(isVowel(chars[back])) {
                front++;
            } else {
                front++;
                back--;
            }
        }
        return new String(chars);
    }

    private boolean isVowel(char ch) {
        switch (ch) {
            case 'e':
            case 'E':
            case 'a':
            case 'A':
            case 'u':
            case 'U':
            case 'o':
            case 'O':
            case 'i':
            case 'I':
                return true;
            default:
                return false;
        }
    }
}
