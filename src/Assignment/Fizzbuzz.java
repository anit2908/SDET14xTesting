package Assignment;

public class Fizzbuzz {
    //✅ FizzBuzz Test:
    //
    //Write a program that prints numbers from 1 to 100.
    // However, for multiples of 3, print "Fizz" instead of the number,
    // and for multiples of 5, print "Buzz."
    // For numbers that are multiples of both 3 and 5, print "FizzBuzz."

    static void main(String[] args) {

        for (int i=0 ; i<=100 ; i++){

            if ((i%3==0)&& (i%5==0)){
                System.out.println("the number is Fizzbuzz    " + i);
            } else if (i%3==0)
            {
                System.out.println("the number is Fizz   " + i) ;
            } else if (i%5==0)
            {
                System.out.println("the number is Buzz   " + i) ;
            } else {
                System.out.println("the number is " + i);
            }
        }
    }
}
