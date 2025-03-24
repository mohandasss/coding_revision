package Array;

public class Missing {
    public static int findMissingNumber(int[] arr, int N) {
        int totalSum = N * (N + 1) / 2; // Sum of first N natural numbers
        int arraySum = 0;
        
        // Calculate sum of elements in the array
        for (int num : arr) {
            arraySum += num;
        }
        
        return totalSum - arraySum; // Missing number
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 6}; // Example array (N = 6)
        int N = 6;
        System.out.println("Missing Number: " + findMissingNumber(arr, N));
    }
}
