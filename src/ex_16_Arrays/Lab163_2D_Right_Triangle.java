package ex_16_Arrays;

import java.util.Scanner;

public class Lab163_2D_Right_Triangle {

    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Give me the right angle triangle number ");
        int a = sc.nextInt();

        for(int i = 0; i < a ; i++)
        {
            for (int j = 0; j<=i ;j++)
            {
                System.out.print("\uD83D\uDE00");
            }
            System.out.println();
        }
    }

}
