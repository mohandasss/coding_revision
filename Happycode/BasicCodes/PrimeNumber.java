public class PrimeNumber {

    boolean PrimeOrNot(int n ){
        boolean flag = true;
            for (int i = 2; i < n-1; i++) {
                if (n%i==0){
                    flag=false;
                }
            }
            return flag;
    }
    public static void main(String[] args) {
        PrimeNumber primeNumber = new PrimeNumber();
        boolean isprime = primeNumber.PrimeOrNot(89);
        System.out.println(isprime);
    }
}
