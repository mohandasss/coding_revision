package Happycode.Patterns;

public class Patterns {
    void print(int n)
    {
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        Patterns patterns = new Patterns();
        patterns.print(4);
    }
}

