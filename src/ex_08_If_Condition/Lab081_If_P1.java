package ex_08_If_Condition;

public class Lab081_If_P1 {
    public static void main(String[] args) {

        int age = Integer.parseInt(args[0]);
        System.out.println(age);

        if (age >= 25){
            System.out.println(" You can go to GOA");
        }else {
            System.out.println("YOu cannot go as you are not 25");
        }
    }
}
