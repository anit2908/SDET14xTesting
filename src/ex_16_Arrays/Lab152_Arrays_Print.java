package ex_16_Arrays;

public class Lab152_Arrays_Print {
    static void main(String[] args) {
        String a[] = {"a1" ,"a2","a3","a4"};
        String b[] = {"b1","b2","b3","b4"};

        for(int i =0 ;i <= a.length -1 ; i++){
            System.out.println(a[i]);
        }

        for (String j : b){
            System.out.println(j);
        }
    }
}
