package ex_10_For_Loop;

public class Lab112_For_loop_Continue {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            //System.out.println(i);
            if ( i == 6)
            {
                continue; //it will basically skip the condition and not print the below code/line
            };
            System.out.println(i);
        }
    }
}
