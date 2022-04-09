package arrays;
import java.util.*;

public class PrintShortestWord2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        String str1[] =str.split(", ");

        String shortest = str1[0];
        for (String each : str1) {
            if(each.length()<shortest.length()){
                shortest=each;
            }
        }

        String result = "";

        for (String each : str1) {
            if(each.length()==shortest.length()){
                result+=each+", ";
            }
        }
        String[] result1 = result.split(", ");
        Arrays.sort(result1);
        System.out.println(Arrays.toString(result1));


    }
}
/*
Write a program that will find out shortest words in the given string str.
If there are few words that are evenly short, print them all. Use split method in order to split
str string variable and create an array of strings. Print array with Arrays.toString() method. Sort array before printing.

Hint: Split values by comma: split(", ");

input: olive, fish, pursuit, old, warning, python, java, coffee, cat, ray

output: [cat, old, ray]
 */
