package week_04;

import java.util.Scanner;

public class PrintLastCharacter {
    public static void main(String[] args) {
        //DO NOT CHANGE
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        //WRITE YOUR CODE HERE
        scan.close();

        System.out.println(word.charAt(word.length()-1));


    }
}
/*
Write a program that will print out last letter of the word (string).

Ex:

Input: java

Output: a
 */
