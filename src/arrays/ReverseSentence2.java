package arrays;
import java.util.*;
public class ReverseSentence2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();

        String reversed = "";
        //TODO: start your code here

        String [] str =sentence.split(" ");

        for (int i = str.length - 1; i >= 0; i--) {
            reversed+=str[i]+" ";
        }

        reversed=reversed.trim();






        //End your code here. do not modify below statement
        System.out.println(reversed);


    }
}
/*
Given a String variable sentence, write code to get each word and assign to String reversed in reverse order.

Example:

sentence -> Java is fun

reversed > fun is Java
 */
