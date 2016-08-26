package round1.arraystring;

/**
 * Created by xingfeiy on 6/22/16.
 */
public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) {
            return false;
        }
        int[] count = new int[256];
        for(char ch : s.toCharArray()) {
            count[ch]++;
        }

        for(char ch : t.toCharArray()) {
            if((--count[ch]) < 0) {
                return false;
            }
        }
        return true;
    }
}
