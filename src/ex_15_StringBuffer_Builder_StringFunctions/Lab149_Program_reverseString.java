package ex_15_StringBuffer_Builder_StringFunctions;

import java.util.Scanner;

public class Lab149_Program_reverseString {
    static void main(String[] args) {
        // Write a program to reverse a string without using inbuilt functions.

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String Str = sc.next();

        String reverse = "";
        for (int i= Str.length()-1; i>=0;i--){
            reverse = reverse +Str.charAt(i);
        }
        System.out.println(reverse);
    }
}
