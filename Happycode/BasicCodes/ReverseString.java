package Happycode.BasicCodes;

public class ReverseString {
    void reverse(String name)
    {
        String newString = "";
        for (int i = name.length()-1; i >=0 ; i--) {
            newString += name.charAt(i);
        }
        System.out.println(newString);
    }

    public static void main(String[] args) {
        ReverseString reversestring = new ReverseString();
        reversestring.reverse("Mohan");
    }
}
