package week_04;

import java.util.Scanner;

public class LongestWord {
    public static void main(String[] args) {
        //DO NOT CHANGE
        Scanner scan = new Scanner(System.in);
        String word1 = scan.next();
        String word2 = scan.next();
        //WIRTE YOUR CODE HERE
        scan.close();
        if(word1.length()>word2.length()){
            System.out.println(word1);
        }else{
            System.out.println(word2);
        }






    }
}

/*
Write a program that will print out the longest word. Note: Assume the length of the two given Strings will be different

input:
bill
check
input:
bill
check
output: check

 */
