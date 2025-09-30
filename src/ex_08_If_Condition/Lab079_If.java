package ex_08_If_Condition;

public class Lab079_If {
public static void main(String[] args) {

    String user = args[0];
    System.out.println(user);
    int Age = Integer.parseInt(user);
    System.out.println(Age);
    if(Age > 18)
    {
        System.out.println("You are eligible to vote");
    }
    else
    {
        System.out.println("You are not Eligible to vote");
    }

    }
}
