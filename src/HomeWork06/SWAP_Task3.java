package HomeWork06;
import java.util.Arrays;

public class SWAP_Task3 {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        swap(array, 0, 1);

        int[] array2 = new int[]{2, 3, 4, 5, 6, 10};
        swap(array2, 2, 5);
    }

    private static void swap(int[] array, int indexA, int indexB) {
        System.out.println("Trying swap: " + Arrays.toString(array) + " indices " + indexA + " and " + indexB);

        int k = array[indexA];
        array[indexA] = array[indexB];
        array[indexB] = k;
        System.out.println("Result: " + Arrays.toString(array) + "\n");
    }
}
