package ex_09_Switch;

public class Lab089_Interview {
    public static void main(String[] args) {
        char ch = 'A';
        switch (ch){
            case 65:
                System.out.println("Match ASCII");
                break;
            default:
                System.out.println("No Match");
        }
    }
}
//output " as ascii value of A is 65 it will execute match ascii case