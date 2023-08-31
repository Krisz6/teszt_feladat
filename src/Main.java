import java.util.Random;

public class Main {
    public static void main(String[] args) {

        int[] array = new int[20];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100) + 1;
        }
        System.out.println("A tömb elemei:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println(findMaximum(array));
    }

    public static int findMaximum(int[] array) {
        int maximum = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] > maximum) {
                maximum = array[i];
            }
        }
        return maximum;
    }
}
