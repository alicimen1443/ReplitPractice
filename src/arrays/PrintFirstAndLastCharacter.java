package arrays;
import java.util.*;

public class PrintFirstAndLastCharacter {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};


        //TODO: Write your code below

        String[] newWords = new String[words.length];
        int k=0;

        for (String each : words) {
            newWords[k++]=""+each.charAt(0)+each.charAt(each.length()-1);
        }

        System.out.println(Arrays.toString(newWords));





    }
}
/*
Given a String array words, iterate through each word and print first and last letter of each element in the format below.

Example:

words → ["hello", "why", "by", "apple" , "note"]

print → [ho, wy, by, ae, ne]
 */
