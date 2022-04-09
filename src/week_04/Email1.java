package week_04;

import java.util.Scanner;

public class Email1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String email = scan.next();
        scan.close();
        String domain=email.substring(email.indexOf('@'));

        if(email.contains("_")){
            System.out.println(email.substring(email.indexOf('_')+1,email.indexOf('@'))+"_"+email.substring(0,email.indexOf('_'))+domain);
        }else{
            System.out.println(email);
        }






    }
}
/*
Swap first name with last name in the email (Seperated by an underscore).
 If the email doesn't contain an underscore print the given input email.

Examples:

input: mike_tyson@gmail.com
​
output: tyson_mike@gmail.com
input: mike_tyson@gmail.com

output: tyson_mike@gmail.com
input: barakobama@gmail.com
​
output: barakobama@gmail.com
 */