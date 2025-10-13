package ex_16_Arrays;

import java.util.Scanner;

public class Lab164_RightAlignedTriangle {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Give me the number");
        int n = sc.nextInt();

        for (int i = 0; i < n ;i++)
        {
            for (int j = i ; j< n-1 ;j++)
            {
                System.out.print(" ");
            }
            for(int k = 0;k <=i;k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
