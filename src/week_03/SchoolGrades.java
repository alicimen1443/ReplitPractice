package week_03;

import java.util.Scanner;

public class SchoolGrades {

    public static void main(String[] args) {
        String s1,s2,s3,s4,s5,summary;
        double d1,d2,d3,d4,d5,average;
        Scanner scan= new Scanner(System.in);
        System.out.println("Welcome to the Grader!\nPlease enter subject name number 1 and score for this subject");
        s1= scan.next();
        d1=scan.nextDouble();
        System.out.println("Please enter subject name number 2 and score for this subject");
        s2= scan.next();
        d2= scan.nextDouble();
        System.out.println("Please enter subject name number 3 and score for this subject");
        s3= scan.next();
        d3= scan.nextDouble();
        System.out.println("Please enter subject name number 4 and score for this subject");
        s4= scan.next();
        d4= scan.nextDouble();
        System.out.println("Please enter subject name number 5 and score for this subject");
        s5= scan.next();
        d5= scan.nextDouble();
        summary=s1+" - "+d1+", "+s2+" - "+d2+", "+s3+" - "+d3+", "+s4+" - "+d4+", "+s5+" - "+d5;
        average=(d1+d2+d3+d4+d5)/5;
        System.out.println("Summary: "+summary+"\nYour average score is: "+average+"\nThank you for using Grader!\nGoodbye!");




    }
}

/*
Write the program that will calculate the average grade. Use 5 String variables and 6 double variables to hold the subject and the grade value. Build a summary with all the information by concatenating the subjects and grades. Then calculate the average grade and print display the average score too.

Execution flow with example:

Welcome to the Grader!
Please enter subject name number 1 and score for this subject
Math
5.0
Please enter subject name number 2 and score for this subject
Biology
4.2
Please enter subject name number 3 and score for this subject
English
4.4
Please enter subject name number 4 and score for this subject
Chemistry
4.8
Please enter subject name number 5 and score for this subject
Music
3.4
​
Summary: Math - 5.0,  Biology - 4.2,  English - 4.4, Chemistry - 4.8, Music - 3.4
Your average score is: 4.36
Thank you for using Grader!
Goodbye!
 */
