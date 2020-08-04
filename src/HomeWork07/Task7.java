package HomeWork07;

import java.util.Arrays;

public class Task7 {
    public static void main(String[] args) {
// Country XYZ has a population of 10 million.
// The birth rate is 14 people per 1000 people, the death rate is 8 people.
// Calculate what the population will be in 10 years,
// taking into account that the birth and death rates are constant.

        int pop = 10000000;
        int birth = 14;
        int death = 8;
        int diff = birth - death;

        for (int year = 1; year < 11; year++) { //We create a loop for 10 years
            pop += pop * diff / 1000; //As the condition x per 1000 is important
            //it must be in the loop body.
            //In contrast 'pop' is changeable every year! That's why it's our focus for body's formula
        } System.out.println(pop);
    }
}
