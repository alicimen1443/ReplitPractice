package methods;
import java.util.*;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        isPalindrome(num);
    }

    public static void isPalindrome(int num){
        //WRITE YOUR CODE HERE
        
        String str1=""+num, str2="";

        for (int i = str1.length()-1; i >=0 ; i--) {
            str2+=str1.charAt(i);
        }
        System.out.println(str1.equals(str2));

       
        


    }
}
/*
Complete the method isPalindrome() that will check if number is a palindrome.
 Print your result as a boolean (true or false).

Challenge: Do not convert int into a string!

Examples:

input: 1001

output: true

input: 1234

output: false
 */