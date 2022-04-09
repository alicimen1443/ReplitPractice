package week_04;

import java.util.Scanner;

public class TernaryOperator2 {

    public static void main(String[] args) {

        //DO NOT TOUCH THESE LINES. TEACHER NEEDS THEM TO TEST YOUR CODE:
        // Variables are already declared and given
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number1:");
        int num1 = scan.nextInt();
        System.out.println("Enter number2:");
        int num2 = scan.nextInt();
        scan.close();

        //WRITE YOUR CODE HERE:

        int result = (num1>num2)? num1 :(num1<num2)? num2: 0;

        System.out.println(result);



    }
}
/*
Write an expression using the conditional operator (? :)
that compares the values of the variables num1 and num2.
The result (that is the value) of this expression should be the value of the larger of the two variables.
The larger value should be printed out.
 */
