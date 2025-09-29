package ex_06_Ternary_Operator;

public class Lab068_Real_Age_Classification {
    public static void main(String[] args) {
    //using Edit configuration
        String sc = args[0];
        System.out.println(sc);
        System.out.println(sc instanceof String);

        int age = Integer.parseInt(sc);

        String result = age > 18? (age >60)? "Senior Citizen":"Adult": "Minor";
        System.out.println(result);
    }
}
