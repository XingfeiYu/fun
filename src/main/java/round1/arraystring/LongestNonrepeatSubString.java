package round1.arraystring;

import java.util.List;

/**
 * Given a string, find the length of the longest substring without repeating characters.
 *
 * Examples:
 *
 * Given "abcabcbb", the answer is "abc", which the length is 3.
 *
 * Given "bbbbb", the answer is "b", with the length of 1.
 *
 * Given "pwwkew", the answer is "wke", with the length of 3. Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
 *
 * Subscribe to see which companies asked this question
 *
 * Created by xingfeiy on 4/18/16.
 */
public class LongestNonrepeatSubString {
    public int lengthOfLongestSubstring(String s) {
        if(s == null || s.length() < 1) {
            return 0;
        }

        int maxLength = 0;
        for(int i = 0; i < s.length(); i++) {}

        return maxLength;
    }

    private int addSubRange(int start, int end, List<SubRange> subRanges) {
        SubRange curSubRange = new SubRange(start, end);
        for(SubRange subRange : subRanges) {
            if(isInnerRange(subRange, curSubRange)) {
                subRange = maxInterpolate(subRange, curSubRange);
                return subRange.length();
            }
        }
        subRanges.add(curSubRange);
        return curSubRange.length();
    }

    private boolean isInnerRange(SubRange first, SubRange second) {
        if(first == null || second == null) {
            return false;
        }
        return (first.start < second.start && second.end < first.end);
    }

    private SubRange maxInterpolate(SubRange first, SubRange second) {
        int thisStartToThatEndLength = second.end - first.start;
        int thatStartToThisEndLength = first.end - second.start;
        if(second.length() > Math.max(thisStartToThatEndLength, thatStartToThisEndLength)) {
            first.start = second.start;
            first.end = second.end;
        } else {
            if(thisStartToThatEndLength > thatStartToThisEndLength) {
                first.end = second.start;
            } else {
                first.start = second.end;
            }
        }
        return first;
    }


    public static class SubRange {
        public int start = 0;

        public int end = 0;

        public SubRange(int start, int end) {
            this.start = start;
            this.end = end;
        }

        public int length() {
            return this.end - this.start;
        }
    }
}
