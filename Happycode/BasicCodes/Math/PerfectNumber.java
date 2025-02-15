package Math;
public class PerfectNumber {
    void checkPerfect(int numb) {
        int copynumb = numb;
        int sum = 0;
        for (int i = 1; i < copynumb; i++) {
            if (copynumb % i == 0) {
                sum += i;
            }

        }

        if (sum == numb)

        {
            System.out.println("Perfect number");

        } else {
            System.out.println("not a perfect number");
        }

    }

    public static void main(String[] args) {
        PerfectNumber perfectNumber = new PerfectNumber();
        perfectNumber.checkPerfect(10);
    }
}
