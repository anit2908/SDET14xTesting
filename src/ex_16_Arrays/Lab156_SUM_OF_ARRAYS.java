package ex_16_Arrays;

public class Lab156_SUM_OF_ARRAYS {

    public static void main (String[] args){

        int b[]= {10,20,30,};
        int sum = 0;
        for (int i=0; i<b.length;i++){
            sum = sum + b[i];
        }
        System.out.println(sum);
    }
}
