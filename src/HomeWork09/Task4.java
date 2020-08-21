package HomeWork09;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StringBuilder sB = new StringBuilder(sc.nextLine());
        System.out.println(sB.reverse());
    }
}
//StringBuilder as there is no other stream - there is only one.