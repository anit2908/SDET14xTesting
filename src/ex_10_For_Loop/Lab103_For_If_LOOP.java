package ex_10_For_Loop;

public class Lab103_For_If_LOOP {
//using if else inside for loop
    public static void main(String[] args) {

        for (int anit= 1 ; anit<= 20 ; anit++)
        {
        if(anit < 18)
        {
            System.out.println(" You are not eligible for gift as you age is :" +anit);
        } else {
            System.out.println(" You are now eligible for gift as you age is : " + anit);
        }
        };
    }

}
