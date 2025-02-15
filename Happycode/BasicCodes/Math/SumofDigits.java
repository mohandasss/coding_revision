package Math;
public class SumofDigits {
    int sum = 0;

    void sum(int numb){
        while(numb>0){
             int digit =numb%10;
            sum= sum+digit;
            numb =numb/10;
        }
        System.out.println(sum);
    }
    public static void main(String args[]){
            SumofDigits sumofDigits =  new SumofDigits();
            sumofDigits.sum(563);
    }
}
