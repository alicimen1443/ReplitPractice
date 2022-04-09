package week_04;

import java.util.Scanner;

public class VerifyContains {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();
        String sentence = scan.nextLine();
        //WRITE YOUR CODE HERE

        boolean verify = sentence.contains(word);

        System.out.println(verify);




    }
}
