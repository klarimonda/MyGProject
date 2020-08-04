package HomeWork07;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        while (scanner.hasNext()) {
            int i = scanner.nextInt();

            if (i == 0) {
                break;
            }
            else {
                sum = sum + i;
            }
        }
        System.out.println(sum);
    }
}
