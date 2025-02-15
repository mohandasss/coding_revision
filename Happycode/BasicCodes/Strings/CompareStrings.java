package Strings;

public class CompareStrings {
    void Strings(String str, String str2) {
        if (str.equals(str2)) {
            System.out.println("Same Strings");
        }
        else{
            System.out.println("Different Strings");
        }
    }

    public static void main(String[] args) {
        CompareStrings compareStrings = new CompareStrings();
        compareStrings.Strings("Mohan", "Mohan");
    }

}
