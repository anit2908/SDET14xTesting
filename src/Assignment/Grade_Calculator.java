package Assignment;

import java.util.Scanner;
import java.util.SortedMap;

public class Grade_Calculator {
    static void main(String[] args) {
        //✅ Grade Calculator:
        /*Write a program that calculates and displays the letter grade for a given numerical score (e.g., A, B, C, D, or F) based on the following grading scale:
        A: 90-100
        B: 80-89
        C: 70-79
        D: 60-69
        F: 0-59*/

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number and I will return you the Grade : ");
        int Grade = sc.nextInt();

        if( Grade >=90 && Grade <= 100 ){
            System.out.println(" You have received A Grade");
        } else if (Grade >=80 && Grade <= 89) {
            System.out.println(" You have received B Grade");
        }else if (Grade >=70 && Grade <= 79) {
            System.out.println(" You have received C Grade");
        }else if (Grade >=60 && Grade <= 69) {
            System.out.println(" You have received D Grade");
        } else if(Grade >=0 && Grade <=59){
            System.out.println("You have received F Grade");
        } else {
            System.out.println("Please enter valid number you Fool!!!!");
        }
    }
}
