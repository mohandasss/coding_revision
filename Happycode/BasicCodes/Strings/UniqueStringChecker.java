package Strings;
import java.util.HashSet;

public class UniqueStringChecker {
    public static boolean isUnique(String str) {
        HashSet<Character> charSet = new HashSet<>();
        for (char c : str.toCharArray()) {
            if (!charSet.add(c)) {
                return false;
            }
        }
        return true; 
    }

    public static void main(String[] args) {
        String input = "hello";
        System.out.println("Is unique? " + isUnique(input)); 
    }
}
