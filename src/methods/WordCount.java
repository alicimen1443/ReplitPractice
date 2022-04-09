package methods;
import java.util.Scanner;
public class WordCount {

    public static int wordCount(String words) {
        // your code
        int count=0;

        if(words.contains(" ")){
            String[] str=words.split(" ");
            count=str.length;
        }else{
            count=1;
        }
        return count;

    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(wordCount(in.nextLine()));
    }
}
/*
wordCount accepts String and returns how many words are in the given String

Example:

wordCount("foo bar")

returns 2

wordCount("one two three")

returns 3

wordCount("bla")

returns 1

Hint: look at spaces
 */