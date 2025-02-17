package SortingSearching;

import java.util.Arrays;

public class BubbleSort {

    void bubble(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length; j++) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int[] arr = { 2, 56, 78, 5, 6, 8 };
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.bubble(arr);
    }

}
