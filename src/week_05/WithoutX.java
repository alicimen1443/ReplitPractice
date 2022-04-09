package week_05;

import java.util.Scanner;

public class WithoutX {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();
        scan.close();

        if(word.toLowerCase().startsWith("x")&&word.toLowerCase().endsWith("x")){
            System.out.println(word.substring(1,word.length()-1));
        }
        else if((word.toLowerCase().startsWith("x"))){
            System.out.println(word.substring(1));
        }
        else if(word.toLowerCase().endsWith("x")){
            System.out.println(word.substring(0,word.length()-1));
        }else{
            System.out.println(word);
        }



        /*String word1=word.toLowerCase();

        if(word1.charAt(0)=='x'&& word.charAt(word.length()-1)=='x'){
            word= word.substring(1,word.length()-1);
            System.out.println(word);
        }
        else if(word1.charAt(0)=='x'){
            word=word.substring(1);
            System.out.println(word);
        }
        else if( word1.charAt(word.length()-1)=='x'){
            word=word.substring(0,word.length()-1);
            System.out.println(word);
        }else{
            System.out.println(word);
        }


       */



    }
}

/*
Given a string word, if the first or last chars are 'x' or 'X', print the string without those
 'x' or 'X' chars, otherwise print the string unchanged.

Example:

input: xHiX
​
output: Hi
input: xHiX

output: Hi
input: apple
​
output: apple
input: apple

output: apple
input: xUxL
​
output: UxL
input: xUxL

output: UxL
input: JavaX
​
output: Java
 */
