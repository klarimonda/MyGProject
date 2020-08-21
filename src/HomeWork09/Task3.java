package HomeWork09;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        System.out.println(a.substring(0, a.length()/2) + b.substring(b.length()/2));
    }
}
