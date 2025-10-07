package ex_16_Arrays;

public class Lab159_2D {
    public static void main(String[] args){

        int a[][]= {{10,20,30} ,{40,50,60} ,{10,20,30}};

        for (int i= 0 ; i < a.length; i++)
        {
            for (int j =0 ; j < a[i].length;j++)
            {
               // System.out.print(a[i][j] + "  ");
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}
