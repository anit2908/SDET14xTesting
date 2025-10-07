package ex_16_Arrays;

import java.util.Arrays;

public class Lab153_Arrays_Max_Min {
    public static void main(String[] args) {

        int a[] ={10,5,70,88,13,20,40,99,};
      //  Arrays.sort(a);
        //System.out.println(a[a.length -1]);

        int max = a[0];
        for (int i =0; i <a.length ; i++){
            if(a[i] > max){
                max = a[i];
            }
        }

        System.out.println(max);

        int min = a[0];
        for (int i = 0; i<a.length;i++){
            if (a[i] < min){
                min = a[i];
            }
        }
        System.out.println(min);
    }
}
