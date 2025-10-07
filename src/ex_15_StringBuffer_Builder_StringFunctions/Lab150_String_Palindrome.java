package ex_15_StringBuffer_Builder_StringFunctions;

import java.util.Scanner;
import java.util.SortedMap;

public class Lab150_String_Palindrome {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value and i will tell its palindrome or not");

        String in = sc.next();

        String out = "";

        for (int i = in.length() - 1; i>=0;i--){

            out = out + in.charAt(i);
        }
        System.out.println(out);

        if(out.equalsIgnoreCase(in)){
            System.out.println("its palindrome");
        }else{
            System.out.println("Not Palindrome");
        }

    }
}
