package week_03;

import java.util.Scanner;

public class HappyValleySchoolSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter age:");
        int age = input.nextInt();

        String result=(age<2)?"ineligible":(age==2)?"toddler":(age<=5)?"early childhood":(age<=7)?"young reader":
                (age<=10)?"elementary":(age<=12)?"Middle":(age==13)?"impossible":(age<=16)?"high school":(age<=18)?
                        "scholar":"ineligible";
        System.out.println(result);



    }
}

/*
In the Happy Valley School System, children are classified by age as follows:

Assume only positive numbers are given

less than 2, ineligible
2, toddler
3-5, early childhood
6-7, young reader
8-10, elementary
11 and 12, middle
13, impossible
14-16, high school
17-18, scholar
greater than 18, ineligible
less than 2, ineligible
2, toddler
3-5, early childhood
6-7, young reader
8-10, elementary
11 and 12, middle
13, impossible
14-16, high school
17-18, scholar
greater than 18, ineligible
Given age print out the category the student would fall under

Example:

Enter age:
8

elementary
 */
