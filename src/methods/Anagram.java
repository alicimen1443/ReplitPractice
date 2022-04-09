package methods;
import java.util.Arrays;
import java.util.Scanner;
public class Anagram {
    public static boolean isAnagram(String word1, String word2) {

        word1=word1.toLowerCase();
        word2=word2.toLowerCase();
        char[] ch1 = word1.toCharArray();
        char[] ch2 =word2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        boolean isAnagram=Arrays.equals(ch1,ch2);
        return isAnagram;


    }

    // Do not touch below


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(isAnagram(in.nextLine(), in.nextLine()));
    }


}
/*
Anagram is a word, phrase, or name formed by rearranging the letters of another, such as cinema, formed from iceman.

The isAnagram method checks if word1 and word2 are anagram to each other then return a boolean.

each letter in word1 should appear in word2 exact number of times
ignore empty spaces
make your code case insensitive
Examples:

isAnagram("listen", "Silent") ==> true

isAnagram("earth", "heart") ==> true

isAnagram("star", "rats") ==> true

isAnagram("hi", "bye") ==> false

isAnagram("java", "cava") ==> false
 */