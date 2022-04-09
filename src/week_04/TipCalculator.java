package week_04;

import java.util.Scanner;

public class TipCalculator {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double tipRate,amount,totalToPay,totalTip,totalPerPerson,tipPerPerson;
        String quality,split;
        int person;


        System.out.println("Split:");
        split=scan.next();
        System.out.println("Number of people:");
        person=scan.nextInt();

        System.out.println("Check amount:");
        amount=scan.nextDouble();
        System.out.println("Service Quality:");
        quality=scan.next();
        tipRate= (quality.equals("excellent"))?0.25:(quality.equals("great"))?0.2:(quality.equals("good"))?
                0.15:(quality.equals("fair"))?0.1:0.05;

        if(split.equals("yes")){
            totalToPay=amount+tipRate*amount;
            totalTip=tipRate*amount;
            totalPerPerson=totalToPay/person;
            tipPerPerson=totalTip/person;
            System.out.println("Number of people entered: "+person+"\nTotal to pay: "+totalToPay
            +"\nTotal Tip: "+totalTip+"\nTotal per person: "+totalPerPerson+"\nTip per person: "+tipPerPerson);
        }else{
            totalToPay=amount+tipRate*amount;
            totalTip=tipRate*amount;

            System.out.println("Number of people entered: "+person+"\nTotal to pay: "+totalToPay+
                    "\nTotal Tip: "+totalTip);
        }













    }
}

/*
Write a program for a tip calculator. There will be different service quality benchmarks that will determine the tip given. There will also the ability to calculate based on the number of people in the party and if there is a split of the bill or not.

Poor = 5% Fair = 10% Good = 15% Great = 20% Excellent = 25%

The program should display the following information based on the user input:

Split or No split (Yes or No) Number of people entered: (number) (each person = & in output) Check amount: (number) Service Quality: (String) Total to pay: Total tip: Total per person: Tip per person:

Example
​
Input:
Yes
4
476.0
Excellent
​
Output:
Number of people entered: &&&&
Total to pay: 595.0
Total tip: 119.0
Total per person: 148.75
Tip per person: 29.75

 */
