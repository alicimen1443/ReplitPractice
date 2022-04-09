package week_05;

import java.util.Scanner;

public class Party {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        String guestList="";

        System.out.println("Please enter guest name:");
        String name = scan.next();
        guestList+=name;

        for (int i = 0; i <100 ; i++) {
            System.out.println("Do you want to enter new guest name:");
            String answer = scan.next();
            if(answer.equalsIgnoreCase("yes")){
                System.out.println("Please enter guest name:");
                String guestNew = scan.next();
                guestList+=", "+guestNew;
            }else{
                i=101;
            }
        }
        System.out.println("Guest's list: "+guestList);
        scan.close();







    }
}

/*
Imagine you have a party and need to form the list of the guests. (Assume you have at least one guest)

Ask for the first guest name.

Then ask does user want to enter one more guests.

If yes - take the next guest input

If not - finish the program and print list of the guests.

Example:

Please enter guest name:
Nick
Do you want to enter new guest name:
yes
Please enter guest name:
Linda
Do you want to enter new guest name:
no
Guest's list: Nick, Linda
 */
