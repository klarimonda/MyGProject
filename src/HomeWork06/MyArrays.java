package HomeWork06;
import java.util.Arrays;

public class MyArrays {
    public static void main(String[] args) {

//Task 1
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(Arrays.toString(array));

//Task 2
        int[] array1 = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] reverse = new int[array1.length];

        for (int i = 0; i < reverse.length; i++) {
            reverse[i] = array1[reverse.length - i - 1]; //we equate index 0
            // of the new array to the last one of the first array
        }
        System.out.println(Arrays.toString(reverse));
    }
}
