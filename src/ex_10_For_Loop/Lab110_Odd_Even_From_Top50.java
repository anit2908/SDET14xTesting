package ex_10_For_Loop;

public class Lab110_Odd_Even_From_Top50 {

    public static void main(String[] args) {

        for (int num = 0; num <= 50 ; num++)
        {
            if( num %2 ==0)
            {
                System.out.println("Its Even Number and number is :" + num);
            }
            //else{
              //  System.out.println("Its Odd Number and number is :" + num);
            //};

        };
    }
}
