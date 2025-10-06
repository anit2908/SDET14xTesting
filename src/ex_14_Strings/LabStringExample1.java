package ex_14_Strings;

public class LabStringExample1 {
    static void main(String[] args) {
        String s= "Java";
        char c = s.charAt(2);
        System.out.println(c); //v

        int result = "abc".compareTo("ABC");
        System.out.println(result); //ASCII of abc -ASCII of ABC = 32
        // the first characters compared are 'a' (Unicode 97) and 'A' (Unicode 65).

        int idx = "Java".indexOf("a"); // 1
        System.out.println(idx);

        int idx2 = "Java".lastIndexOf("a"); // 3
        System.out.println(idx2);


        boolean b = "".isEmpty(); // true
        System.out.println(b);

        String s11 = String.join("*", "Java", "Python"); //Java*Python
        System.out.println(s11);

        String s12 = "Java".replace('a', 'o'); // "Jovo"
        System.out.println(s12);

        boolean b1 = "Java".startsWith("Ja"); // true
        System.out.println(b1);

        String b2 = "Java".concat("Mava"); // JavaMava
        System.out.println(b2);
    }
}
