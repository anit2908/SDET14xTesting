package ex_15_StringBuffer_Builder_StringFunctions;

import java.util.Scanner;

public class Lab149_Program_CharArray {
    static void main(String[] args) {
        // Write a program to reverse a string without using inbuilt functions.

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String Str = sc.next();
        char Str1[] = Str.toCharArray();

        String reverse = "";
        for (int i= Str.length()-1; i>=0;i--){
            reverse = reverse + Str1[i];
        }
        System.out.println(reverse);
    }
}
