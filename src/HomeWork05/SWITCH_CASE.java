package HomeWork05;

import java.util.Scanner;

public class SWITCH_CASE {
    public static void main(String[] args) {
//Task 7 - SWITCH CASE statement
        System.out.println("Enter the day of the week.");
        Scanner scanner = new Scanner(System.in);
        String day = scanner.nextLine();

        switch (day) {
            case "Monday", "MON", "mon":
                System.out.println("This is the 1st day of the week");
                break;
            case "Tuesday", "TUE", "tue":
                System.out.println("This is the 2nd day of the week");
                break;
            case "Wednesday", "WED", "wed":
                System.out.println("This is the 3rd day of the week");
                break;
            case "Thursday", "THU", "thu":
                System.out.println("This is the 4th day of the week");
                break;
            case "Friday", "FRI", "fri":
                System.out.println("This is the 5th day of the week");
                break;
            case "Saturday", "SAT", "sat":
                System.out.println("This is the 6th day of the week");
                break;
            case "Sunday", "SUN", "sun":
                System.out.println("This is the 7th day of the week");
                break;
            default:
                System.out.println("There is no such day of the week!");
        }
    }
}
