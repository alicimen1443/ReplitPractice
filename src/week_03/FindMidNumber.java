package week_03;

import java.util.Scanner;

public class FindMidNumber {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        int n1,n2,n3;
        System.out.println("Enter first number:");
        n1= scan.nextInt();
        System.out.println("Enter second number:");
        n2= scan.nextInt();
        System.out.println("Enter third number:");
        n3= scan.nextInt();

        if(n1>n2&&n1<n3){
            System.out.println("Medium value is: "+ n1);
        }
        else if(n2>n1&&n2<n3){
            System.out.println("Medium value is: " + n2);
        }else{
            System.out.println("Medium value is: " + n3);
        }






    }
}

/*
Write a program that will return mid number out of three numbers. No need to do any calculations.

Create an object of Scanner class.

Declare int 3 variables: num1, num2, num3.

Example:

Enter first number:
14
Enter second number:
52
Enter third number:
25
​
Medium value is: 25
Enter first number:
14
Enter second number:
52
Enter third number:
25

Medium value is: 25
Enter first number:
140
Enter second number:
34
Enter third number:
1
​
Medium value is: 34
 */
