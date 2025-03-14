package Array;
import java.util.Arrays;

public class FirstMissingPositive {
    public static int firstMissingPositive(int[] nums) {
        int n = nums.length;

        // Step 1: Place each number in its correct index if possible
        for (int i = 0; i < n; i++) {
            while (nums[i] > 0 && nums[i] <= n && nums[nums[i] - 1] != nums[i]) {
                swap(nums, i, nums[i] - 1);
            }
        }

        // Step 2: Find the first missing positive
        for (int i = 0; i < n; i++) {
            if (nums[i] != i + 1) {
                return i + 1;
            }
        }

        return n + 1;
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr1 = {3, 4, -1, 1};
        System.out.println(firstMissingPositive(arr1)); // Output: 2

        int[] arr2 = {1, 2, 0};
        System.out.println(firstMissingPositive(arr2)); // Output: 3
    }
}
