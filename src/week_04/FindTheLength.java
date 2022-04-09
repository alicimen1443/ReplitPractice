package week_04;

import java.util.Scanner;

public class FindTheLength {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String text;
        scan.close();
        System.out.println("Please enter the text:");
        text= scan.nextLine();

        System.out.println("Length is: "+text.length());




    }
}

/*
Write a program that will output length of the text (string).

Example:

Display message: "Please enter the text:"
Display message: "Please enter the text:"
input: java
input: java
Display message: "Length is: 4"
 */