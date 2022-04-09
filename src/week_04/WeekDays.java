package week_04;

import java.util.Scanner;

public class WeekDays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number:");
        int day = scan.nextInt();
        String str = "";
        //WRITE YOUR CODE HERE
        switch (day){
            case 1 :
                str="Monday";break;
            case 2:
                str="Tuesday";break;
            case 3:
                str="Wednesday";break;
            case 4:
                str="Thursday";break;
            case 5:
                str="Friday";break;
            case 6:
                str="Saturday";break;
            case 7:
                str="Sunday";break;
            default:
                str="Not a valid day";
        }
        System.out.println(str);



    }
}
/*
Write a program that will print a week days according to the day number. Use Switch statement.
 If an invalid day is entered print: "Not a valid day"

Example

Enter number:
1
​
Output: Monday
Enter number:
1

Output: Monday
Enter number:
7
​
Output: Sunday
 */
