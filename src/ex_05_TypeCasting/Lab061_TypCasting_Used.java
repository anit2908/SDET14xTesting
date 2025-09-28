package ex_05_TypeCasting;

public class Lab061_TypCasting_Used {

    public static void main(String[] args) {
        int course = 100;
        float GST = 18.45f;

        //int total = course + GST;// Narrowing //not working
        int total = course +(int)GST;
        System.out.println(total); //narrowing and working

        float total1 = course + GST; //auto implicit
        System.out.println(total1); //widening and working
    }


}
