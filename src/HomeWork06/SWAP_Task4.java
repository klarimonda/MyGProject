package HomeWork06;
import java.util.Arrays;

public class SWAP_Task4 {
    public static void main(String[] args) {

        int[] array = {1, 2, 3};
        swap(array, 1, 2);
        swap(array, 1, 3);
        swap(array, -1, 0);

        int[] array2 = new int[]{2, 4, 6, 8, 10};
        swap(array2, 2, 3);
        swap(array2, 4, 5);
        swap(array2, -2, 0);
    }

    private static void swap(int[] array, int indexA, int indexB) {
        System.out.println("Trying swap: " + Arrays.toString(array) + " indices " + indexA + " and " + indexB);

        if (indexA < array.length && indexA >= 0) {
            if (indexB < array.length) {
                int k = array[indexA];
                array[indexA] = array[indexB];
                array[indexB] = k;
                System.out.println("Result: " + Arrays.toString(array) + "\n");
            }
            else {
                System.out.println("indexB " + "(" + indexB + ")" + " incorrect!\n");
            }
        }
        else {
            System.out.println("indexA " + "(" + indexA + ")" + " incorrect!\n");
        }
    }
}