package HomeWork03;

public class NonPrimitiveDataType {
    public static void main(String[] args) {
//Task 9 - Non-Primitive Data Type
        Integer x1 = 1;
        System.out.println(x1.equals(2)); //false

        String s = "JAVA";
        System.out.println(s.toLowerCase()); //java

        String s1 = "PHP";
        System.out.println(s1.repeat(3)); //PHPPHPPHP

//STRINGs
        String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println("The length of the txt string is " + txt.length());

        String txt1 = "tgif!";
        System.out.println(txt1.toUpperCase() + " (Thank God it's Friday!)"); // TGIF!

        String txt2 = "Stop all the clocks, cut off the telephone,\n " +
        "Prevent the dog from barking with a juicy bone,\n " +
        "Silence the pianos and with muffled drum \n " +
        "Bring out the coffin, let the mourners come.";
        System.out.println(txt2.indexOf("coffin")); //151

        String name = "Bree ";
        String surname = "Van de Kamp";
        System.out.println(name.concat(surname)); //Bree Van de Kamp

        String txt3 = "I have seen \"Titanic\" a thousand\ttimes";
        System.out.println(txt3); //I have seen "Titanic" a thousand	times
    }
}
