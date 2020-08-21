package HomeWork08;

public class Task1_Parameters {

    public static void EvenOdd() {
        for (int i = 0; i <= 20; i++) {
            //    System.out.print(i + 1 + " ");
            if (i % 2 > 0) {
                System.out.print(i + 1);
            } else {
                System.out.print(" ");
            }
        }
        System.out.print("\n");
        for (int i = 20; i > 0; i--) {
            if (i % 2 > 0) {
                System.out.print(" ");
            } else {
                System.out.print(i - 1);
            }
        }
    }

    public static void EvenOdd2() {
        for (int i = 0; i <= 20; i++) {
            //    System.out.print(i + 1 + " ");
            if (i % 2 == 0) {
                System.out.println(i);
                if (i == 0) {
                    System.out.print("\n");
                }
                if (i < 10) {
                    System.out.print(" ");
                }
            } else {
                System.out.print(i + " ");
            }
        }
    }

    public static int sum(int s) {
        if (s > 0) {
            return s + sum(s-1);
        } else {
            return 0;
        }
    }

    public static void DivisibleBy3(int start, int end) {
        for (int i = start; i <= end; i++) {
            if (i % 3 == 0) {
                System.out.print(i + " ");
            }
        }
    }

    public static void Triangle(int a, int b, int c) {
        if ((a + b > c) && (b + c > a) && (c + a > b)) {
            System.out.println("It's possible");
        } else System.out.println("It's impossible");
    }

    public static void main(String[] args) {
        EvenOdd();
        // 2 4 6 8 10 12 14 16 18 20
        //19 17 15 13 11 9 7 5 3 1 0

        EvenOdd2();
        //
        // 1 2
        // 3 4
        // 5 6
        // 7 8
        // 9 10
        //11 12
        //13 14
        //15 16
        //17 18
        //19 20

        System.out.print("\n");

        //int result = sum(10);
        //System.out.println(result);
        System.out.println(sum(10)); //55

        System.out.print("\n");

        DivisibleBy3(33, 66); //33 36 39 42 45 48 51 54 57 60 63 66
        System.out.print("\n");
        DivisibleBy3(11, 45); //12 15 18 21 24 27 30 33 36 39 42 45

        System.out.println("\n");

        Triangle(4, 1, 1); //It's impossible
        Triangle(3, 4, 5); //It's possible
        Triangle(1, 1, 100); //It's impossible
        Triangle(100, 1, 100); //It's possible
    }
}
