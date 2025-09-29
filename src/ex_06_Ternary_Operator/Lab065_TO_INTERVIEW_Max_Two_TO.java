package ex_06_Ternary_Operator;

import java.util.SortedMap;

public class Lab065_TO_INTERVIEW_Max_Two_TO {
    public static void main(String[] args) {

        int a = 10;
        int b = 20;

        String Greater = (a > b)? "A is greater" : "B is Greater"; //ternary operator
        System.out.println(Greater);
        System.out.println(Math.max(a,b)); //in built function
    }
}
