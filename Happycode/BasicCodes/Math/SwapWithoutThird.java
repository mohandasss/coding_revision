package Math;

public class SwapWithoutThird {
    int a = 10;
    int b =20;
    void swaping(){
        a =a+b;
        b=a-b;
        a=a-b;
        System.out.println("value of a = " + a + " value of b = " + b);
    }

    public static void main(String[] args) {
        SwapWithoutThird swapwithoutthrird =  new SwapWithoutThird();
        swapwithoutthrird.swaping();
    }
}
