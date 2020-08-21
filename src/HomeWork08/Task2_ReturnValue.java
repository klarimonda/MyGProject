package HomeWork08;

public class Task2_ReturnValue {

    public static boolean GreaterThan0(int a) {
        //if (a > 0) {
        //return true;
        //} else {
        //return false }
        return a > 0;
    }

    public static String GreaterThanZero(int b) {
        if (GreaterThan0(b)) {
            return "Number is greater than zero";
        } else {
            return "Number is zero or less";
        }
    }

    public static String LessThan100(int c) {
        if (GreaterThan0(c)) {
            if (c < 100) {
                return "Number " + c + " is greater than 0 and less than 100";
            } else return "Number " + c + " is equal to or greater than 100";
        } else return "Number " + c + " is zero or less";
    }

    public static void main(String[] args) {
        System.out.println(GreaterThan0(-50)); //false
        System.out.println(GreaterThan0(7)); //true

        System.out.println(GreaterThanZero(6)); //Number is greater than zero
        System.out.println(GreaterThanZero(0)); //Number is zero or less

        System.out.println(LessThan100(88)); //Number 88 is greater than 0 and less than 100
        System.out.println(LessThan100(-8)); //Number -8 is zero or less
        System.out.println(LessThan100(300)); //Number 300 is equal to or greater than 100
    }
}
