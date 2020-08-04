package HomeWork07;
import java.util.Arrays;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter int:");
        int num = scanner.nextInt();
        int[] array = new int[10]; //As from 0 to 9 we have 10 numbers

        for (; num >= 1; num /= 10) { //For numbers from 1 to 9
            array[num % 10] += 1; //Thus we get last number of our integer
            //and assign it the value 1
        }

        int counter = 0; //We add a counter to check only first condition for all the elements
        for (int value : array) {
            if (value > 1) { //So if it's false the counter will have 0
                System.out.println("Yes");
                counter++;
                break;
            }
        }
        if (counter == 0) { //and this condition will be realised
            System.out.println("No");
            }
        System.out.println(Arrays.toString(array)); //Thus we can see all the elements checked:
        //0 - no mentioned, 1 - mentioned 1 time, 2 - repeated again etc.
    }
}
