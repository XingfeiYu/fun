package crack;

/**
 * Created by xingfeiy on 6/15/16.
 */
public class Chapter1Task {
    //Implement an algorithm to determine if a string has all unique characters. What if you cannot use additional data structures?
    public static boolean isUniqueString(String str) {
        if(str == null || str.length() > 256) {
            return false;
        }

        int counter = 0;
        for(char ch : str.toCharArray()) {
            int value = ch - 'a';
            if((counter & (1 << value)) > 0) {
                return false;
            }
            counter |= 1 << value;
        }
        return true;
    }

    //Given two strings, write a method to decide if one is a permutation of the other.
    public static boolean isPermutation(String a, String b) {
        if(a == null || b == null || a.length() != b.length()) {
            return false;
        }

        int[] letters = new int[256]; //why 256? if the character set is ASCII.
        for(char ch : a.toCharArray()) {
            letters[ch]++;
        }

        for(char ch : b.toCharArray()) {
            if((--letters[ch]) < 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * Write a method to replace all spaces in a string with '%20'. Youmay assume that the string has sufficient space
     * at the end of the string to hold the additional characters, and that you are given the "true" length of the string.
     * (Note: if implementing in Java, please use a character array so that you can perform this operation in place.)
     * @param chars
     * @param length
     * @return
     */
    public static String replaceSpace(char[] chars, int length) {
        int countOfSpace = 0;
        for(int i = 0; i < length; i++) {
            if(chars[i] == ' ') {
                countOfSpace++;
            }
        }

        int newLength = length + countOfSpace * 2;
        chars[newLength] =  '\0';
        for(int i = length - 1; i >= 0; i--) {
            if(chars[i] == ' ') {
                chars[newLength - 1] = '0';
                chars[newLength - 2] = '2';
                chars[newLength - 3] = '%';
                newLength = newLength - 3;
            } else {
                chars[newLength - 1] = chars[i];
                newLength--;
            }
        }
        System.out.println(new String(chars));
        return new String(chars).trim();
    }
}
