package week_05;

import java.util.Scanner;

public class EqualsJavaPhyton {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String sentence = scan.nextLine();
        scan.close();
        int countJava = 0;
        int countPython = 0;

       /* for (int i = 0; i <= sentence.length() - 4; i++) {
            if (sentence.substring(i, i + 4).equals("java")) {
                countJava+=1;
            }
        }
        for (int j = 0; j <= sentence.length() - 6; j++) {
            if (sentence.substring(j, j + 6).equals("python")) {
                countPython+=1;
            }
        }
        System.out.println(countJava==countPython);

        */

        for (int i = 0; i < sentence.length(); i++) {
            if(sentence.substring(i).startsWith("java")){
                countJava++;
            }else if(sentence.substring(i).startsWith("python")){
                countPython++;
            }
        }
        System.out.println(countJava==countPython);


    }

}

/*
Given a string, print out true if the number of appearances of "java" anywhere in the string is equal to the number of appearances of "python" anywhere in the string (case sensitive).

Example:

input: We study java not python
​
output: true
input: We study java not python

output: true
Example:

input: What's the difference between java, javascript and python?
​
output: false
 */
