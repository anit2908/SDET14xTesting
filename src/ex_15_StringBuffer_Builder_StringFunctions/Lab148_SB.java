package ex_15_StringBuffer_Builder_StringFunctions;

public class Lab148_SB {
    static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Java");
        sb.append(" Programming");
        System.out.println(sb); //Java Programming

        sb.replace(0, 4, "C++");
        System.out.println(sb); //C++ Programming
    }
}
