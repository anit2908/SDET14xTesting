package ex_11_While_Loop;

import java.util.Scanner;

public class Lab121_While_IQ {

    //factorial program
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number");

        int num = sc.nextInt();

        if (!sc.hasNextInt())
         {
             System.out.println("Enter the valid integer number");
        } else if (num < 0 || num > Integer.MAX_VALUE)
        {
            System.out.println("Cannot provide the factorial of this number");
        } else if( num ==0){
            System.out.println("Factorial of number is 1");
        }else {
            int fact = 1;
            int i = 1;
            while (i <= num) {
                fact = fact * i;
                i++;
            }
            System.out.println("factorial of the number is : " + fact);
        }

        /*public static void main(String[] args) {
            // Factorial Program

            // The logic building formula we are discussing.
            // Step number one, you have to figure out what is the data type for input and output.
            // Step number two, write a rough logic around this.
            // Step number three, write a proper logic around this.
            // Step number four, optimize.
            // Step number five, which is edge cases.

            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the Number for Factorial Program!");
            if(!scanner.hasNextInt()){
                System.out.println("You Fool, int only!");
            }else{
                int number = scanner.nextInt();
                int fact = 1;
                if(number ==0 ){
                    fact = 1;
                    System.out.println("fact = 1");
                }
                if(number < 0 || number > Integer.MAX_VALUE){
                    System.out.println("Can't get the factorial as out of bound!(int)");
                }

                int i = 1;
                while (i<=number){
                    fact = fact*i;
                    i++;
                }

                System.out.println(fact);


            }
    }
*/
}
}
