package ex_06_Ternary_Operator;

public class Lab067_To_Three_Max {
    public static void main(String[] args) {

        int a = 10;
        int b = 2;
        int c = 3;

        int Greatest = (a > b) ? ((a > c)? a :c) : ((b>c)? b: c);
        System.out.printf( "Max  is %d" ,Greatest);
    }

}
