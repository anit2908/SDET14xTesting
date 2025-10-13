package Assignment;

import java.util.Scanner;

public class SecondHighestNumber {
    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please give me the size of the array");
        int size = sc.nextInt();
        int values[] = new int[size];

        for (int i = 0; i < values.length; i++) {
            System.out.println(" Please Enter the " + i + "element : ");
            values[i] = sc.nextInt();
        }

        System.out.println("Printing the values for the confirmation");
        for(int a : values){
            System.out.print( a + " ");
        }


        int max = 0;
        int second_max = 0;

        for (int a : values)
        {
            if(a > max){
                second_max = max;
                max = a;

        }
        }
        System.out.println("Second max number is : " + second_max);
        //for (int a = 0; a < values.length);

    }
}
