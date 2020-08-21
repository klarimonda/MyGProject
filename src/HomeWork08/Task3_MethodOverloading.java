package HomeWork08;

public class Task3_MethodOverloading {

    public static int sum(int a) { return a + 5; }

    public static int sum(int b, int c) { return b + c + 5; }

    public static double sum(double a, int d) { return a + d + 5; }

    public static double sum(double b, double c) { return b + c + 5; }

    public static int sum(int[] array) { return array.length + 5; }

    public static void main(String[] args) {
        System.out.println(sum(3)); //8
        System.out.println(sum(2, -3)); //4
        System.out.println(sum(4.2, 7)); //16.2
        System.out.println(sum(3.2, 6.6)); //14.8
        System.out.println(sum(new int[3])); //8
    }
}
// Method overloading is the use of one method for many different data types or/and for many
//different parameters. Like you write a method once but you can call it many times.

// To overload a method you need to name it the same way for all the data types you are going to use it
//and call it after in the Main method.

// With void it's not a method overloading coz it returns nothing.
//The second one it is coz the names are the same but the parameters are different, and it returns something.