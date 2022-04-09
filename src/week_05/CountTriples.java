package week_05;

import java.util.Scanner;

public class CountTriples {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int count = 0 ;
        //WRITE YOUR CODE HERE
        scan.close();

        for (int i = 0; i <=str.length()-3 ; i++) {

            if(str.charAt(i)==str.charAt(i+1) && str.charAt(i)==str.charAt(i+2)){
                count+=1;
            }
        }
        System.out.println(count);


    }
}

/*
We'll say that a "triple" in a string is a char appearing three times in a row. Print out the number of triples in the given string. The triples may overlap.

Example:

input: abcXXXabc
​
output: 1
input: abcXXXabc

output: 1
Example:

input: xxxabyyyycd
​
output: 3
input: xxxabyyyycd

output: 3
Example:

input: java
​
output: 0
 */
