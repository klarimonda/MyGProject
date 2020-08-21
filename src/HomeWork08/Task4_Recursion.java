package HomeWork08;

public class Task4_Recursion {

    public static void MyRecursion(int a) {
        if (a > 0) {
            MyRecursion(a - 1);
        }
        System.out.print(a + " ");
    }

    public static void main(String[] args) {
        MyRecursion(7); //0 1 2 3 4 5 6 7
    }
}

// Recursion reminds loop FOR.
// For some cases it could be infinite without the halting condition.