package methods;
import java.util.*;
public class PrintUniqueWords {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        String[] words = new String[size];
        for(int i=0; i < size; i++){
            words[i] = scan.next();
        }
        printUniqueWords(words);
    }

    public static void printUniqueWords(String[] words){
        //WRITE YOUR CODE HERE

        for (String eachWord : words) {
            int count=0;
            for (String wordEach : words) {
                if(eachWord.equals(wordEach)){
                    count++;
                }
            }
            if(count==1){
                System.out.println(eachWord);
            }
        }


    }
}
/*
Complete the void method printUniqueWords() that will print only unique words from an array of strings. Every single unique word should be printed from the new line.

Example:

input:[java, code, python, code, rust, code, rust]

output:
java
python
 */