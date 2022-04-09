package week_04;

import java.util.Scanner;

public class PrintFirstAndLastLetters {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        //WRITE YOUR CODE HERE
        scan.close();

        System.out.println(word.substring(0,1)+""+word.charAt(word.length()-1));





    }
}
/*
Write a program that will print out first and last letters together.

Input: adobe
Input: adobe
Output: ae

 */
