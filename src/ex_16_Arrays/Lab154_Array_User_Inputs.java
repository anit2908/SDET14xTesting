package ex_16_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Lab154_Array_User_Inputs {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the size of the array");
         int size = sc.nextInt();

         String marks[] = new String[size];

         for (int i = 0 ; i < marks.length ; i++) {

             System.out.println("Enter the value for the " + i +" element");
             marks[i] = sc.next();
         }
        System.out.println(" Printing all the values");

        Arrays.sort(marks);
        for (String m : marks){
            System.out.print(m + "  ");
        }
    }
}
