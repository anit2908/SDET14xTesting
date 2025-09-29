package ex_06_Ternary_Operator;



public class Lab066_TO_Even_Odd {
    public static void main(String[] args) {

        int a = 21;
        String Number = (a%2 ==0)? "A is even number" + a : "A is odd number" +a ;
        System.out.println(Number);
    }
}
