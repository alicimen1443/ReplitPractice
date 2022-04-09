package week_04;

import java.util.Scanner;

public class MiddleOne {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        //YOUR CODE HERE
        scan.close();
        if(word.length()%2==1){

            if(word.length()==1){
                System.out.println(word.repeat(3));
            }
            else{
                System.out.println(word.charAt(word.length()/2));
            }
        }
        else{
            if(word.length()==2){
                System.out.println(word.repeat(2));
            }
            else{
                System.out.println(word.charAt(word.length()/2-1)+""+word.charAt(word.length()/2));
            }
        }
    }
}
/*
You have a word, do the following:

When word has odd number of characters and:
3 or more characters, print middle letter
      oak ==> a
      javav ==> v
Single character, print that character 3 times
      # ==> ###
      q ==> qqq
When word has even number of characters and:
4 or more characters, print the middle 2 characters
     java ==> av
     apples ==> pl
     #$%^&* ==> %^
2 characters, print those 2 characters twice
      @@ ==>@@@@
      $$ ==>$$$$
      hi ==> hihi
 */
