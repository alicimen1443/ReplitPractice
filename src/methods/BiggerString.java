package methods;
import java.util.Scanner;
public class BiggerString {

        public static String bigger(String a ,String b){
            String bigger="";
            if(a.length()>b.length())
                bigger=a;
            else
                bigger=b;
            return bigger;

        }


        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.println(bigger(in.next(), in.next()));
        }
    }

/*
The method accepts two strings and return the longest one

Example":

bigger("apple","orange") ==> "orange"
 */