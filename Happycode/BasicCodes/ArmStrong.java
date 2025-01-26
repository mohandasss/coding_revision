public class ArmStrong {

    void armStrong(int n) {
        int copied = n;
        int power = 0;
        int sum = 0;
        while (n > 0) {
             power = n % 10;
            sum = sum + power * power * power;
            n/=10;
        }
        if (copied==sum) {
            System.out.println("its a Armstrong");
        }else{
            System.out.println("not a amstrong");
        }
    }

    public static void main(String[] args) {
        ArmStrong armStrong = new ArmStrong();
        armStrong.armStrong(370 );

    }

}
