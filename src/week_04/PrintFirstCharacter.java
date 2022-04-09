package week_04;

import java.util.Scanner;

public class PrintFirstCharacter {

    public static void main(String[] args) {
        //DO NOT CHANGE
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        scan.close();
        //WRITE YOUR CODE HERE:
        System.out.println(word.charAt(0));


    }
}
/*
Write a program that will print out the first character of the word.

Ex:

Input: jump
Output: j
 */