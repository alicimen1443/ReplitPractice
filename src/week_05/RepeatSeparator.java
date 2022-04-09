package week_05;

import java.util.Scanner;

public class RepeatSeparator {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        String separator = scan.next();
        int count = scan.nextInt();
        scan.close();
        String result="";

        for (int i = count; i >0 ; i--) {
            result+=word+separator;
        }
        System.out.println(result.substring(0,result.length()-separator.length()));











    }
}

/*
Given two strings, word and a separator sep, return a big string made of count occurrences of the word, separated by the separator string.

Example:

input:
Word
X
3
​
output: WordXWordXWord
input:
Word
X
3

output: WordXWordXWord
Example:

input:
This
And
2
​
output: ThisAndThis
input:
This
And
2

output: ThisAndThis
Example:

input:
This
And
1
​
output: This
 */
