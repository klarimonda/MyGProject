package HomeWork09;

public class Task1 {
    public static void main(String[] args) {

        String st = "Java"; //This object "Java" - 1
        String st2 = new String("Java");
        String st3 = st2.intern();
        String st4 = "java"; //This object "java" - 2
        String st5 = null;
        String st6 = new String("JAVA"); //This object "JAVA" - 3
        //As the lines 7 and 11 create objects in Heap and in String Pool as well
        }
}
