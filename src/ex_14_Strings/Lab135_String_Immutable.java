package ex_14_Strings;

public class Lab135_String_Immutable {
    public static void main(String[] args){

        String name ="Anit";
        name.toLowerCase();
        System.out.println(name);
        String name_low = name.toLowerCase();
        System.out.println(name_low);
        String name_high = name.toUpperCase();
        System.out.println(name_high);
    }
}
