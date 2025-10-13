package Assignment;

import java.util.Scanner;
import java.util.SortedMap;

public class ReverseString {
    public  static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String input = sc.next();
        String reverse = "";
        int i = input.length()-1;
        while(i >=0)
        {
             reverse = reverse + input.charAt(i);
             i--;
        }
        System.out.println(reverse);
    }
}
