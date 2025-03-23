package Array;

public class Search {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int key = 30;
        boolean found = false;

        for (int num : arr) {
            if (num == key) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println(key + " is found in the array.");
        } else {
            System.out.println(key + " is not found in the array.");
        }
    }
}
