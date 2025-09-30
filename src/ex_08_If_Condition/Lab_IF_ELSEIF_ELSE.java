package ex_08_If_Condition;

public class Lab_IF_ELSEIF_ELSE {

    public static void main(String[] args) {
        int age = 36;

        if(age > 30)
        {
            System.out.println(" Your age is more than 30"+ age);
        }
        else if( age < 30){
            System.out.println("Your age is less than 30 "+ age);
        }
        else{
            System.out.println("Your age is " + age);
        }
    }
}
