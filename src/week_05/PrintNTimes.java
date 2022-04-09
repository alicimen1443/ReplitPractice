package week_05;

import java.util.Scanner;

public class PrintNTimes {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        //WRITE YOUR CODE HERE
        scan.close();
        String output="";

        for (int i = 0; i <n ; i++) {
            output+="*";
        }
        System.out.println(output);





    }
}

/*
Given an int variable n print out n asterisks. So if n=5, five asterisks will be printed.

Example:

input: 1
​
output: *
input: 1

output: *
Example:

input: 3
​
output: ***
 */
