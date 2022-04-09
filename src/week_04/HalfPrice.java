package week_04;

import java.util.Scanner;

public class HalfPrice {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        //WRITE YOUR CODE HERE
        scan.close();

        System.out.println(word.substring(0,word.length()/2).repeat(2));





    }
}

/*

Write a program that will print out first half of the word twice.

Example:

input: java
​
output: jaja
input: java

output: jaja
input: unity
​
output: unun
 */
