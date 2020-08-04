package HomeWork07;

public class Task4 {
    public static void main(String[] args) {

        int base = 13;
        for (int i = 0; i <= base/2; i++) {
            for (int k = 1; k <= base/2 - i; k++) {
                System.out.print(' ');
            }
            for (int j = 0; j < i*2; j++) {
                System.out.print('*');
            }
            System.out.println('*');
        }
    }
}
