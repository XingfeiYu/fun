package basic;

/**
 * Created by xingfeiy on 5/24/16.
 */
public class InsertionSort {
    /**
     * @param array
     * @return
     */
    public static int[] simpleInsertionSort(int[] array) {
        if(array == null || array.length < 2) {
            return array;
        }

        for(int i = 1; i < array.length; i++) {
            int currentIndex = i;
            while (currentIndex > 0) {
                if(array[currentIndex] > array[currentIndex - 1]) {
                    break;
                } else {
                    int tempValue = array[currentIndex - 1];
                    array[currentIndex - 1] = array[currentIndex];
                    array[currentIndex] = tempValue;
                    currentIndex--;
                }
            }
        }
        return array;
    }

    public static int[] betterSimpleInsertionSort(int[] array) {
        if(array == null || array.length < 2) {
            return array;
        }

        for(int i = 1; i < array.length; i++) {
            int currentVaue = array[i];
            int pointer = i - 1;
            while (pointer >= 0 && currentVaue < array[pointer]) {
                array[pointer + 1] = array[pointer];
                pointer--;
            }
            array[pointer + 1] = currentVaue;
        }
        return array;
    }

    public static int[] recursiveSort(int[] array) {
        if(array == null) {
            return null;
        }
        return recursiveSort(array, 0, array.length - 1);
    }

    public static int[] recursiveSort(int[] array, int startIndex, int endIndex) {
        if(endIndex <= startIndex) {
            return array;
        }
        int midIndex = (endIndex + startIndex) / 2;
        recursiveSort(array, startIndex, midIndex);
        recursiveSort(array, midIndex + 1, endIndex);
        merge(array, startIndex, midIndex, endIndex);
        return array;
    }

    private static void merge(int[] array, int sp, int mp, int ep) {
        int[] left = new int[mp - sp + 1 + 1];
        int[] right = new int[ep - mp + 1];
        int i = 0;
        int j = 0;
        for(; i < mp - sp + 1; i++) {
            left[i] = array[sp + i];
        }

        for(; j < ep - mp; j++) {
            right[j] = array[mp + 1 + j];
        }

        left[i] = Integer.MAX_VALUE;
        right[j] = Integer.MAX_VALUE;

        i = j = 0;
        for(int k = sp; k < ep - sp + 1; k++) {
            if(left[i] < right[j]) {
                array[k] = left[i];
                i++;
            } else {
                array[k] = right[j];
                j++;
            }
        }
     }


}
