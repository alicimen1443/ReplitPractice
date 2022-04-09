package week_04;

import java.util.Scanner;

public class FindAUser {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //WRITE YOUR CODE HERE
        String name;
        System.out.println("Enter full name:");
        name=scan.nextLine();

        if(name.equalsIgnoreCase("Max Payne")||name.equalsIgnoreCase("Alan Wake")){
            System.out.println("User found!");
        }else{
            System.out.println("User not found!");
        }

    }
}
/*
Write a program that will look up a user.

Assume that you have only 2 users: Max Payne and Alan Wake. First, ask user to enter full name. Display message:
 "Enter full name:". Then take input from user. If name is equals to either "Max Payne" or "Alan Wake",
  display message: "User found!". Otherwise, display message: "User not found!". Please make your search case insensitive!

Example:

Display message: Enter full name:
Display message: Enter full name:
input: Max Payne
input: Max Payne
Display message: User found!
 */