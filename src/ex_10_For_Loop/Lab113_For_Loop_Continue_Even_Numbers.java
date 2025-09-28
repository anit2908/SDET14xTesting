package ex_10_For_Loop;

public class Lab113_For_Loop_Continue_Even_Numbers {
    public static void main(String[] args) {
        //Even number using continue
        for (int i = 0; i < 50; i++)
        {
            if(i%2 != 0)
            {
                continue;
            };
            System.out.println("Even Number is : " + i);

        }
    }
}
