package arrays;
import java.util.*;

public class FindingMaxLengthInStringArray {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String[] words = new String[5];
        for (int i = 0; i < 5; i++) {
            words[i] = input.nextLine();
        }
        int maxLength=words[0].length();
        String str="";

        for (int i = 0; i < words.length; i++) {
            if(words[i].length()>maxLength){
                maxLength=words[i].length();
                str=words[i];
            }
        }
        System.out.println(str);
    }
}

/*
Given the array words find and print the word with the largest length. Assume that there are no 2 words with longest length

Example:

words -> ["aaa", "bbbbb", "whasstupppp", "longg" , "jaaaaavvaaaaaaaaaa"]

Outputs: jaaaaavvaaaaaaaaaa
 */
