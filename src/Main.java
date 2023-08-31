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
        System.out.println(countUnevenNumbers(array));
        System.out.println(sumEvenNumbers(array));
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
    public static int countUnevenNumbers(int[] array) {
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] % 2 != 0) {
                counter++;
            }
        }
        return counter;
    }
    public static int findMin(int[] array){
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i]<min){
                min=array[i];
            }
        }
        return min;
    }
    public static int countEvenNumber(int[] array){
        int count = 0;
        for (int actual : array){
            if (actual % 2 == 0){
                count++;
            }
        }
        return count;
    }
    public static int sumEvenNumbers(int[] array) {
        int sum = 0;
        for (int actual : array){
            if (actual % 2 == 0){
                sum += actual;
            }
        }
        return sum;
    }
}
