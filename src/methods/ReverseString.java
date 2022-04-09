package methods;
import java.util.Scanner;

public class ReverseString {
    public static String reverse(String input){

        String str="";

        for (int i = input.length()-1,j=0; i >=0 ; i--,j++) {
            str+=input.charAt(i);
        }
        return str;






    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(reverse(in.next()));
    }
}
/*
The reverse method will reverse the given String

Example:

reverse("foo") ==> "oof"
reverse("student") ==> "tneduts"
 */