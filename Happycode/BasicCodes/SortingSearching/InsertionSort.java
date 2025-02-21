package SortingSearching;
import java.util.Arrays;

public class InsertionSort {
    void insertion(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 5, 2, 9, 3};
        InsertionSort insertionSort = new InsertionSort();
        System.out.println("Before Sorting: " + Arrays.toString(arr));
        insertionSort.insertion(arr);
        System.out.println("After Sorting: " + Arrays.toString(arr));
    }
}
