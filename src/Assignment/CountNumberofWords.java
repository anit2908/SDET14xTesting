package Assignment;

import java.util.Scanner;
import java.util.SortedMap;

public class CountNumberofWords {
    public  static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Words and i will count it");
        String i = sc.nextLine();
        int count = 1;

        for (int a =0 ;a < i.length()-1; a++)
        {
            if ((i.charAt(a) == ' ') && (i.charAt(a+1) != ' '))
            {
                System.out.println("the first letter of each words are : "+ i.charAt(a+1));
                count++;
            }

        }
        System.out.println(" The total number of words are " + count);
    }
}
