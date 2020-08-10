package HomeWork07;
import java.util.Arrays;
import java.util.Scanner;

public class Task6_2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter int:");
        int num = scanner.nextInt();
        int[] array = new int[10]; //As from 0 to 9 we have 10 numbers

        for (; num >= 1; num /= 10) { //For numbers from 1 to 9
            array[num % 10] += 1; //Thus we get last number of our integer
            //and assign it the value 1
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] > 1) {
                System.out.println("Yes");
                break;
            }
            else if (i == array.length - 1 && array[i] <= 1) { //We check only last element for this case
                System.out.println("No");
            }
        }
        System.out.println(Arrays.toString(array)); //Thus we can see all the elements checked:
        //0 - no mentioned, 1 - mentioned 1 time, 2 - repeated again etc.
    }
}
