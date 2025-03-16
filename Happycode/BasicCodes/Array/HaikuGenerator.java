package Array;
import java.util.Random;
public class HaikuGenerator {
    private static final String[] LINE_1 = {
        "Silent night whispers", "Autumn leaves falling", "Moonlight on the waves"
    };
    private static final String[] LINE_2 = {
        "Echoes in the empty woods", "Soft breeze calls my name", "Golden sun warms the cold earth"
    };
    private static final String[] LINE_3 = {
        "Dreams drift with the clouds", "A sparrow sings alone", "Time flows like the stream"
    };

    public static void main(String[] args) {
        Random rand = new Random();
        System.out.println(LINE_1[rand.nextInt(LINE_1.length)]);
        System.out.println(LINE_2[rand.nextInt(LINE_2.length)]);
        System.out.println(LINE_3[rand.nextInt(LINE_3.length)]);
    }
}
