package Array;

public class singleNumber {
    public int singleNumb(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result ^= num; 
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {4, 1, 2, 1, 2}; 
        singleNumber obj = new singleNumber();
        int unique = obj.singleNumb(nums); 
        System.out.println("Single number is: " + unique);
    }
}
