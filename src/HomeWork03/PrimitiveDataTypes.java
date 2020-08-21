package HomeWork03;

public class PrimitiveDataTypes {
    public static void main(String[] args) {
//Task 1
    byte a = 127;
    int b = 255;
    byte c = (byte) (a-b);
    System.out.println(c);
    //-128...127 //1 byte

//Task 2
    short d = -32768;
    int e = 32768;
    short f = (short) (d+e);
    System.out.println(f);
    //-32768...32767 //2 bytes

//Task 3
    int x = 1200;
    System.out.println(x);
    System.out.println(x*x);
    System.out.println(x*x*x);
    //-2147483648...2147483647 //4 bytes

//Task 4
    long g = 9223372036854775807L;
    System.out.println(g);
    long g1 = Long.MAX_VALUE;
    System.out.println(g1); //9223372036854775807
    //-9,223,372,036,854,775,808 to +9,223,372,036,854,775,807 //8 bytes //bank system

//Task 5
    float A = 1245.554F; //3,4e-38 < |x| < 3,4e38 //7-8 numbers //4 bytes
    double B = 256.3785; //1,7e-308 < |x| < 1,7e308 //17 numbers //8 bytes
    float AB = (float) (A*B);
    System.out.println(AB);

//Task 6
    char a1 = '+'; char a2 = 43; char a3 = '\u002B';
    char b1 = '!'; char b2 = 33; char b3 = '\u0021';
    char c1 = '?'; char c2 = 63; char c3 = '\u003F';
    System.out.println(a1 + " " + a2 + " " + a3);
    System.out.println(b1 + " " + b2 + " " + b3);
    System.out.println(c1 + " " + c2 + " " + c3);
    //0...65536 //2 bytes

//Task 7
    int h = 'r';
    System.out.println(h);
    char i = 123;
    System.out.println(i);
    //float j = 7.2;
    //short k = 3L;
    double l = 0x123D;
    System.out.println(l);
    int m = 0x123F;
    System.out.println(m);
    //int n = 078;
    short o = 7;
    System.out.println(o);
    //byte p = 255;
    double q = 9;
    System.out.println(q);
    //int r = 5.5;
    int t = 5;
    System.out.println(t);

//Task 8
    int num2 = 0b1111011;
    //123/2 = 61 (1)
    //61/2 = 30 (1)
    //30/2 = 15 (0)
    //15/2 = 7 (1)
    //7/2 = 3 (1)
    //3/2 = 1 (1)
    //1/2 = 0 (1)
    System.out.println(num2);
    int num8 = 0173;
    //123/8 = 15 (3)
    //15/8 = 1 (7)
    //1/8 = 0 (1)
    System.out.println(num8);
    int num16 = 0x7B;
    //123/16 = 7 (B)
    //7/16 = 0 (7)
    System.out.println(num16);
    }
}
