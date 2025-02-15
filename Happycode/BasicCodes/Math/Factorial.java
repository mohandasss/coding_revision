package Math;
public class Factorial {
    int multiply = 1;

    void facto(int numb) {
        for (int i = numb; i > 0; i--) {
            multiply = multiply * i;
        }
        System.out.println(multiply);
    }

    public static void main(String[] args) {
        Factorial factorial = new Factorial();
        factorial.facto(4);
    }
}
