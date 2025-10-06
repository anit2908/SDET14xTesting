package ex_13_Functions;

import java.util.Scanner;

import static java.lang.Integer.sum;

public class Lab134_Function_Arth {

    public static void main(String[] args) {
// Create a Function of Sub, Sum, Mul and Div
        // with parameter, a, b (take the parameter from the User)

        Scanner sc = new Scanner(System.in);
        int a = readInt(sc, "Enter the num1: ");
        int b = readInt(sc, "Enter the num2: ");

        int result_sum = sum(a, b);
        int result_sub = sub(a, b);
        int result_mul = mul(a, b);
        int result_div = div(a, b);
        int result_mod = mod(a, b);

        System.out.println(result_sum);
        System.out.println(result_sub);
        System.out.println(result_mul);
        System.out.println(result_div);
        System.out.println(result_mod);


    }
    static int readInt(Scanner sc, String prompt) {
        System.out.println(prompt);
        if (sc.hasNextInt()) {
            return sc.nextInt();
        } else {
            System.out.println("Enter the int only.");
            System.exit(0);
            return 0;
        }
    }
    static int sum(int a ,int b){
        return a+b;
        }
    static int sub(int a ,int b){
        return a-b;
    }
    static int mul(int a ,int b){
        return a*b;
    }
    static int div(int a ,int b) throws  ArithmeticException{
        if (b==0){
           throw new ArithmeticException("Division by zero is not allowed.");
        }
        return a/b;

    }
    static   int mod (int a , int b){
        return a%b;
    }




}

