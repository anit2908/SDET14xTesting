package ex_10_For_Loop;

import java.util.Scanner;

public class Task_Factorial_HR {
    public static void main(String[] args) {
        //factorial of the number program
        // example :5! = 5*4*3*2*1 =120
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int num = Sc.nextInt();

        int fact = 1;
        for ( int i = num ; i > 0; i--)
        {
            fact = fact * i;
        }
        System.out.println(fact);
    }
}
