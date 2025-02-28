package Array;

public class RemoveDuplicates {
    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        
        int i = 0; // Pointer for unique elements
        
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) { // If a new unique element is found
                i++; 
                nums[i] = nums[j]; // Move it to the next position
            }
        }
        
        return i + 1; // Length of unique elements
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 2, 3, 4, 4, 5};
        int length = removeDuplicates(nums);
        
        System.out.println("Unique elements count: " + length);
        System.out.print("Modified array: ");
        for (int i = 0; i < length; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
