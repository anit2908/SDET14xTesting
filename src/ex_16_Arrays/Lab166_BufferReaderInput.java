package ex_16_Arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lab166_BufferReaderInput {

    public static void main(String[] args) throws IOException {
        BufferedReader Bf = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input the value that needs to be printed: ");
        int n = Integer.parseInt(Bf.readLine().trim());

        System.out.println("Value of N is :"+n);
    }
}
