package methods;
import java.util.*;
public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(uniqueChars(in.next()));
    }

    public static String uniqueChars(String str) {
        //TODO: write your code

        String result="";

        for (int i = 0; i < str.length(); i++) {

            if(!result.contains(str.charAt(i)+"")){
                result+=str.charAt(i);
            }
        }
        return result;





    }

}
/*
uniqueChars is a method that will accept any String and return the String with out any dupclicate characters

Examples:

uniqueChars("java") ==> "jav"
uniqueChars("mama") ==> "ma"
uniqueChars("spoon") ==> "spon"
 */