package ex_16_Arrays;

import java.util.Scanner;

public class Lab163_2D_Reverse_Left_Triangle
{
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("give me the number of line for the left angle triangle");
        int a = sc.nextInt();

        for (int i = a ;i >= 1 ;i--) {
            for (int j=1; j<=i;j++){
                System.out.print( "*");
            }
            System.out.println();
        }
    }
}
