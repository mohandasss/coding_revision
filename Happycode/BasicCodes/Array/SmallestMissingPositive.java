package Array;
import java.util.*;

public class SmallestMissingPositive {
    public static int findSmallestMissingPositive(int[] nums) {
        int n = nums.length;

        // Step 1: Place each number in its correct position if possible
        for (int i = 0; i < n; i++) {
            while (nums[i] > 0 && nums[i] <= n && nums[nums[i] - 1] != nums[i]) {
                // Swap nums[i] with nums[nums[i] - 1]
                int temp = nums[i];
                nums[i] = nums[temp - 1];
                nums[temp - 1] = temp;
            }
        }

        // Step 2: Find the first missing positive number
        for (int i = 0; i < n; i++) {
            if (nums[i] != i + 1) {
                return i + 1;
            }
        }

        // If all numbers are in place, return n+1
        return n + 1;
    }

    public static void main(String[] args) {
        int[] nums1 = {3, 4, -1, 1};
        int[] nums2 = {7, 8, 9, 11, 12};
        int[] nums3 = {1, 2, 0};

        System.out.println(findSmallestMissingPositive(nums1)); // Output: 2
        System.out.println(findSmallestMissingPositive(nums2)); // Output: 1
        System.out.println(findSmallestMissingPositive(nums3)); // Output: 3
    }
}
