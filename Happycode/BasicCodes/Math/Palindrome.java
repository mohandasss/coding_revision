package Math;

public class Palindrome {
    void StringPalindrome(String s) {
        String CopyString = s;
        String Reversed = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            Reversed += s.charAt(i);

        }
        if (Reversed.equals(CopyString)) {
            System.out.println("its a palindrome");
        } else {
            System.out.println("its not a palindrome");
        }

    }

    void NumberPalindrome(int n) {
        int Copied = n;
        int Reversed = 0;
        while (n > 0) {
            int LastDigit = n % 10;
            Reversed = Reversed*10+LastDigit;
            n/=10;

        }
        if (Copied==Reversed){
            System.out.println("its a palindrome");
        }else {
            System.out.println("its not a palindrome");
        }
    }

    public static void main(String[] args) {
        Palindrome palindrome = new Palindrome();
        palindrome.StringPalindrome("oko");
        palindrome.NumberPalindrome(54);
    }
}
