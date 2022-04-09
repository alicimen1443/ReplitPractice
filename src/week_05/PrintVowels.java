package week_05;

import java.util.Scanner;

public class PrintVowels {

    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        String word = inp.nextLine();
        inp.close();

        for (int i = 0; i < word.length(); i++) {
            if((word.toLowerCase().charAt(i)=='a')|| (word.toLowerCase().charAt(i)=='e')|| ((word.toLowerCase().charAt(i))=='o')
                    || (word.toLowerCase().charAt(i)=='i')|| (word.toLowerCase().charAt(i)=='u')){

                System.out.print(word.charAt(i));

            }
        }

    }
}
/*
Create a program that will take the given String In and print out all the vowels from the String.

Example:

Input: howdyho
​
Output: oo
Input: howdyho

Output: oo
Input: huehuehuehue
​
Output: ueueueue
 */