package ex_13_Functions;

public class Lab132_UD_Part1 {

    public static void main (String[] args){

       a();
       int c = b();
       System.out.println(c);
       int e = d(10,20,30);
        System.out.println(e);

       c( "Anit", 80);

       d(10,20,30);

       // User Defined Functions.

        // 1.Without Parameters and Without Return Type
        // 2.Without Parameters but With Return Type
        // 3.With Parameters and Without Return Type
        // 4.With Parameters and With Return Type


        }
    static void a(){
        System.out.println("Hello this is A method");
    }

    static int b(){
        return 10;
    }
    static void c( String x , int y){
        System.out.println("Hello this is C method");
    }
    static int d (int k , int l ,int m){
        return k+l+m;
    }
}
