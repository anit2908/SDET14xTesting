package ex_16_Arrays;

public class Lab149_Arrays {
    public static void main (String[] args) {

        int a = 10; //integer variable
        int a1[] = {10,20,30,40,50,60}; //integer array

        boolean b[] = {true,false,false};
        System.out.println(a1.length);
        System.out.println(a1[3]);
        //System.out.println(a1[8]); //ArrayIndexOutOfBoundsException

        String name = "Anit";
         String name1 [] = name.split("");
        for( String s : name1){
            System.out.print(s);
        }




    }
}
