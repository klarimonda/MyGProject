package HomeWork07;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        int[] array = {10, 20, 15, 17, 24, 35};
        int mul = 1;
        for (int i : array) {
            mul = mul * i;
        }
        System.out.println(mul);
    }
}
