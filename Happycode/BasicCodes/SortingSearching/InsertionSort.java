package SortingSearching;
import java.lang.reflect.Array;

import java.util.Arrays;

public class InsertionSort {
        void insertion(int [] arr){
                System.out.println(Arrays.toString(arr));
        }
    public static void main(String[] args) {
        int [] arr = {1,4,5,2,9,3};
        InsertionSort insertionSort = new InsertionSort();
        insertionSort.insertion(arr);
    }
}
