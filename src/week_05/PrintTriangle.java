package week_05;

import java.util.Scanner;

public class PrintTriangle {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String result ="";

        for (int k = 0; k <n ; k++) {
            result=result.concat("*");
            System.out.println(result);
            
        }
        
        



    }
}
/*
Write a program that will create a triangle of asterisks based on size n.

Example:

input: 5
​
output: 
*
**
***
****
*****
input: 5

output: 
*
**
***
****
*****
Example:

input: 3
​
output: 
*
**
***
 */
