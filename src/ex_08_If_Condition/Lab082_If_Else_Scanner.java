package ex_08_If_Condition;

import java.util.Scanner;

public class Lab082_If_Else_Scanner {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Age");
        int Age = sc.nextInt();
        System.out.println(Age);

        if (Age > 18){
            System.out.println("Allowed to travel");
        }else{
            System.out.println("Not Allowed to Travel");
        }
    }
}
