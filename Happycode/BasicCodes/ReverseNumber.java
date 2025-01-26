package Happycode.BasicCodes;

public class ReverseNumber {
    int reverse = 0;
    int NumberReverse(int number) {
        while (number > 0) {
            int divided =number%10;
            reverse = reverse*10+divided;
            number/=10;
        }
        return reverse;
    }

    public static void main(String[] args) {
        ReverseNumber reverseNumber = new ReverseNumber();
        int NewOne = reverseNumber.NumberReverse(156);
        System.out.println(NewOne);
    }
}
