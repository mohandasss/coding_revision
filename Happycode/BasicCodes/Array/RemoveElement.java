package Array;
import java.util.Arrays;

public class RemoveElement {
    public static int removeElement(int[] nums, int val) {
        int index = 0; 
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[index] = nums[i];
                index++;
            }
        }
        return index; 
    }

    public static void main(String[] args) {
        int[] nums = {3, 2, 2, 3, 4, 3, 5};  
        int val = 3; 

        System.out.println("Original Array: " + Arrays.toString(nums));
        int newLength = removeElement(nums, val);
        
        System.out.println("Modified Array: " + Arrays.toString(Arrays.copyOf(nums, newLength)));
        System.out.println("New Length: " + newLength);
    }
}
