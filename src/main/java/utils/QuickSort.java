package utils;

/**
 * Created by xingfeiy on 9/16/15.
 */
public class QuickSort {

    public static int[] swap(int[] array, int a, int b) {
        int tmp = array[a];
        array[a] = array[b];
        array[b] = tmp;
        return array;
    }

    public static int partition(int[] array, int start, int end) {
        int index = start + (end - start) / 2;
        int pivot = array[index];
        swap(array, index, end);

        for(int i = index = start; i < end; i++) {
            if(array[i] < pivot) {
                swap(array, index++, i);
            }
        }
        swap(array, index, end);
        return index;
    }

    public static int[] sort(int[] array, int start, int end) {
        if(end > start) {
            int index = partition(array, start, end);
            sort(array, start, index - 1);
            sort(array, index + 1, end);
        }
        return array;
    }

    public static int[] inPlaceSort(int[] array) {
        inPlaceSort(array, 0, array.length - 1);
        return array;
    }

    public static void inPlaceSort(int[] array, int i, int j) {
        if(i >= j || j <= 0) {
            return;
        }
        int pivot = indexOfPivot(array, i, j);
        inPlaceSort(array, i, pivot - 1);
        inPlaceSort(array, pivot + 1, j);
    }

    public static int indexOfPivot(int[] array, int i, int j) {
        int pivot = array[j];
        int pi = i - 1;
        int pj = i;
        while (pj < j) {
            if(array[pj] > pivot) {
                pj++;
            } else {
                int tmp = array[++pi];
                array[pi] = array[pj];
                array[pj++] = tmp;
            }
        }
        array[j] = array[pi + 1];
        array[pi + 1] = pivot;
        return pi + 1;
    }

    public static void main(String[] args) {
        int[] array = new int[]{5, 3, 7, 2, 9, 8, 1, 6};
        PrintUtils.print(array);
//        PrintUtils.print(sort(array, 0, array.length - 1));
        System.out.println();
        PrintUtils.print(inPlaceSort(array));
    }

}
