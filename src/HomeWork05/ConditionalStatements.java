package HomeWork05;

import java.util.Scanner;

public class ConditionalStatements {
    public static void main(String[] args) {
//Task 1 - IF statement
        int a = 7;
        int b = --a;
        if (b == 7) {
            System.out.println("b = 7");
        } //Nothing because b=6 so the condition is false

//Task 2 - IF ELSE statement
        int c = 3, d = 2;

        //if (c = d++) { //condition = only boolean
        //Error:(15, 15) java: incompatible types: int cannot be converted to boolean

        if (c == d++) { //d changes to 3 at next mention
            System.out.println("It is 'if' statement!");
        } else {
            System.out.println("It is 'else' statement!"); //It will be displayed
        }
        System.out.println(d); //d = 3

//Task 3 - IF ELSE IF statement
        int num1 = 34, num2 = 2, num3 = 78;
        if (num1 > num2 && num1 > num3) {
            System.out.println(num1 + " is the largest number");
        }
        else if (num2 > num1 && num2 > num3) {
            System.out.println(num2 + " is the largest number");
        }
        else {
            System.out.println(num3 + " is the largest number");
        }
        if (num1 < num2 && num1 < num3) {
            System.out.println(num1 + " is the smallest number");
        }
        else if (num2 < num1 && num2 < num3) {
            System.out.println(num2 + " is the smallest number");
        }
        else {
            System.out.println(num3 + " is the smallest number");
        }

//Task 4 - Nested IF statement
        int a1 = 10;
        int c1 = a1;
        int b1 = ++a1;
        if (b1 >= a1){
            if (c1 == 10){
                if ((c1 <= b1) && (a1 == b1)){ //I changed '!' to '='
                    System.out.println("All statements are true.");
                    //After changing this is displayed
                } else {
                    System.out.println("One of the statements isn't true.");
                    //At first this was displayed
                }
            } else {
                System.out.println("One of statements is true.");
            }
        } else {
            System.out.println("All statements are false");
        }

//Task 5 - Ternary Operator
        int f = 8;
        String message = (f > 10) ? "Number is greater than 10" : "Number is less than or equal to 10";
        System.out.println(message);

        System.out.println("");

//Task 6 - SWITCH CASE statement
        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();

        switch (month) {
            case 1:
            case 2:
            case 12:
                System.out.println("It's WINTER");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("It's SPRING");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("It's SUMMER");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("It's AUTUMN");
                break;
            default:
                System.out.println("This month doesn't exist!");
        }
    }
}
