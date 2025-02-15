package Math;
public class Fibonacci {
    void sequence(int numb) {
        int first = 0;
        int second = 1;
        System.out.println(first);
        for (int i = 2; i < numb; i++) {
            int third = first + second;
            System.out.println(third);
            first = second;
            second = third;
        }
    }

    public static void main(String[] args) {
        Fibonacci fibonacci = new Fibonacci();
        fibonacci.sequence(10);
    }
}
