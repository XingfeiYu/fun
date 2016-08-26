package round1.arraystring;

import java.util.HashMap;
import java.util.Map;

/**
 * Given a pattern and a string str, find if str follows the same pattern.

 Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in str.

 Examples:
 pattern = "abba", str = "dog cat cat dog" should return true.
 pattern = "abba", str = "dog cat cat fish" should return false.
 pattern = "aaaa", str = "dog cat cat dog" should return false.
 pattern = "abba", str = "dog dog dog dog" should return false.
 Notes:
 You may assume pattern contains only lowercase letters, and str contains lowercase letters separated by a single space.

 * Created by xingfeiy on 7/18/16.
 */
public class WordPattern290 {
    /**
     * Start it from 2:35PM
     * End time: 2:47, failed
     * 1. comapre if one string equal with other, the difference between '=' and equals().
     * 2. 'abba' and "dog dog dog dog" failed.
     * @param pattern
     * @param str
     * @return
     */
    public boolean wordPattern(String pattern, String str) {
        if(pattern == null || str == null) {
            return false;
        }

        char[] chars = pattern.toCharArray();
        String[] words = str.split(" ");
        if(chars.length != words.length) {
            return false;
        }
        Map<Character, String> maps = new HashMap<>();
        for(int i = 0; i < chars.length; i++) {
            if(maps.containsKey(chars[i])) {
                if(!maps.get(chars[i]).equals(words[i])) {
                    return false;
                }
            } else if(maps.containsValue(words[i])) {
                return false;
            } else {
                maps.put(chars[i], words[i]);
            }
        }

        return true;
    }


    public static void main(String[] args) {
        new WordPattern290().wordPattern("abba", "dog cat cat fish");
    }
}
