package ex_06_Ternary_Operator;

public class Lab064_Interview_Ready_Question {
    public static void main(String[] args) {

        int age = 15;
        //nested ternary

        String Criteria = age >18 ? ((age > 21)? "Yes you can travel and drink":"Yes you can travel but cannot Drink" ):( "No Cannot Travel");
        System.out.println(Criteria);
    }
}
