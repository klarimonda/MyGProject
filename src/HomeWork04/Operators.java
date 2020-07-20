package HomeWork04;

public class Operators {
    public static void main(String[] args) {
//Task 1 - Math Operators
        int a = 10 + 2;
        int b = a + 5;
        int c = ++b - a;
        int d = a * b * c;
        int e = d / 8;
        int f = e % 30;
        int g = -f;
        System.out.println(a); //12
        System.out.println(b); //18
        System.out.println(c); //6
        System.out.println(d); //1296
        System.out.println(e); //162
        System.out.println(f); //12
        System.out.println(g); //-12

//Task 2 - Assignment Operators
        a = 10;
        a += 3;
        System.out.println(a); //13
        a -= 7;
        System.out.println(a); //6
        a *= 4;
        System.out.println(a); //24
        a /= 8;
        System.out.println(a); //3
        a %= 2;
        System.out.println(a); //1

//Task 3 - Increment and Decrement Operators
        a = 0;
        b = 5;
        a++; //a = 0
        b--; //b = 5
        System.out.println(a); //a changes to 1
        System.out.println(b); //b changes to 4
        a = --b; //b changes to 3, a changes to b
        System.out.println(a);
        System.out.println(b);
        a = b--; //a changes to b = 3, b changes to 2
        System.out.println(a);
        System.out.println(b);

//Task 4 - Comparison Operators
        a = 3;
        b = 5;
        System.out.println(a > b); //false
        System.out.println(a < b); //true
        System.out.println(a >= b); //false
        System.out.println(a <= b); //true
        System.out.println(a == b); //false
        System.out.println(a != b); //true
        a = 5;
        System.out.println(a > b); //false
        System.out.println(a < b); //false
        System.out.println(a >= b); //true
        System.out.println(a <= b); //true
        System.out.println(a == b); //true
        System.out.println(a != b); //false
        //boolean data type

        System.out.println(" ");

//Task 5 - Logical Operators
        boolean bOne = true;
        boolean bTwo = true;
        System.out.println(bOne && bTwo); //false => true
        System.out.println(bOne || bTwo); //true
        System.out.println(bOne & bTwo); //false => true
        System.out.println(bOne | bTwo); //true
        System.out.println(bOne ^ bTwo); //true => false
        System.out.println(!bOne); //false
        System.out.println(!bTwo); //true => false
        // ! changes the value to opposite and works only with one of the variables
        //Shorthand boolean operators check as many conditions as they need to get 'false',
        //regular ones check all the conditions in any case.

        // true || false //true (it checks only first condition)
        // false && true //false (it checks only first condition)
        // !true || 1 >= 0 //true
        // false && 5 //not valid
        // true && !false //true
        // true ^ !true //true
        // 1 >= 1 || false //true (it checks only first condition)
        // true && 5 - 5 //not valid

//Task 6 - Bitwise Operators
        int aa = 4; //0000 0100
        int bb = 3; //0000 0011
        System.out.println(aa & bb); //0000 0000 = 0
        System.out.println(aa | bb); //0000 0111 = 7
        System.out.println(aa ^ bb); //0000 0111 = 7
        System.out.println(~aa); //1111 1011 = -5
        System.out.println(~bb); //1111 1100 = -4
        //Bitwise operators operate on ints and uints at the binary level,
        //they look directly at the binary digits or bits of an integer.

//Task 7 - Bit Shift Operators
        a = 10; //0000 1010
        System.out.println(a << 1); //0001 0100 = 20
        System.out.println(b = a << 1 >> 2); //0000 0101 = 5
        //1111 1111 1111 1111 1111 1111 1111 1011 = -5
        System.out.println(-b >>> 1); //0111 1111 1111 1111 1111 1111 1111 1101 = 2.147.483.645
        //Bitwise operators work with numbers of 32bit code in binary system.
        //The unsigned right bit-shift operator changes parity bit (MSB) to 0
        //for negative number.
        //That's also the difference between >> and >>> as for positive number they work same.
    }
}
