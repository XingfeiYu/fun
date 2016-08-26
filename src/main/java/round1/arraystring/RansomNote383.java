package round1.arraystring;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by xingfeiy on 8/25/16.
 */
public class RansomNote383 {
    public boolean canConstruct(String ransomNote, String magazine) {
        if(ransomNote == null || ransomNote.length() < 1) {
            return true;
        }
        if(magazine == null || magazine.length() < 1) {
            return false;
        }
        Set<Integer> visited = new HashSet<>();
        for(char ch : ransomNote.toCharArray()) {
            int index = magazine.indexOf(ch);
            while (index > -1) {
                if(visited.contains(index)) {
                    index = magazine.indexOf(ch, index + 1);
                } else {
                    visited.add(index);
                    break;
                }
            }
            if(index < 0) {
                return false;
            }
        }
        return true;
    }
}
