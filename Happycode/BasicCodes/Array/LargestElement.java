//Find the largest element in the array
package Array;

public class LargestElement {

    void largest(int[] arr) {
        int largest = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>largest) {
                largest = arr[i];
                
            }
        }
        System.out.println(largest);
    }

    void smallest(int[] arr) {
        int smallest = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<smallest) {
                smallest = arr[i];
                
            }
        }
        System.out.println(smallest);
    }

    public static void main(String[] args) {
        int[] arr = { 12, 45, 7, 89, 23, 56, 99, 34 };
        LargestElement largestElement = new LargestElement();
        largestElement.largest(arr);
        largestElement.smallest(arr);
        

    }

}
