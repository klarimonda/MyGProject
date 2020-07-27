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

//Task 4
        int[] arr = {1, 2, 3};
        int l = arr[1];
        arr[1] = arr[2];
        arr[2] = l;
        System.out.println(Arrays.toString(arr)); //1, 3, 2
        //index 3 is incorrect
        //index -1 is incorrect

        int[] arr2 = new int[]{2, 4, 6, 8, 10};
        int m = arr2[2];
        arr2[2] = arr2[3];
        arr2[3] = m;
        System.out.println(Arrays.toString(arr2)); //2, 4, 8, 6, 10
        //index 5 is incorrect
        //index -2 is incorrect
    }
}