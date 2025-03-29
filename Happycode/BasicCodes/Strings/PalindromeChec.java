package Strings;

public class PalindromeChec {
    public static boolean isPalindrome(String str) {
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equals(reversed);
    }

    public static void main(String[] args) {
        String input = "ma";
        System.out.println("Is Palindrome? " + isPalindrome(input));
    }
}
