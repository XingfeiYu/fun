package round1.arraystring;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Given two strings s and t, determine if they are isomorphic.

 Two strings are isomorphic if the characters in s can be replaced to get t.

 All occurrences of a character must be replaced with another character while preserving the order of characters.

 No two characters may map to the same character but a character may map to itself.

 For example,
 Given "egg", "add", return true.

 Given "foo", "bar", return false.

 Given "paper", "title", return true.

 Note:
 You may assume both s and t have the same length.

 * Created by xingfeiy on 7/8/16.
 */
public class IsomorphicString205 {
    public boolean isIsomorphic(String s, String t) {
        if(s == null || t == null) {
            return false;
        }

        Map<Character, Character> maps = new HashMap<>();
        Set<Character> set = new HashSet<>();
        for(int i = 0; i < s.length(); i++) {
            if(maps.containsKey(s.charAt(i)) && maps.get(s.charAt(i)) != t.charAt(i)) {
                return false;
            } else {
                if(set.contains(t.charAt(i))) {
                    return false;
                }
                maps.put(s.charAt(i), t.charAt(i));
                set.add(t.charAt(i));
            }
        }
        return true;
    }
}
