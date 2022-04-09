package methods;

import java.util.Scanner;

public class TimeConversion {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        timeConversion(scan.nextLine());

    }
    public static void timeConversion(String s) {
        /*
         * Write your code here.
         */
        s =s.trim();
        String result = s.substring(0, s.length() - 2);

        String s1 = s.substring(2, s.length() - 2);
        if (s.endsWith("AM") && s.startsWith("12")) {
            result = "00" + s1;
        }

        if (s.endsWith("PM") && !s.startsWith("12")) {
            result = Integer.valueOf(s.substring(0,2))+12 + s1;
        }

        System.out.println(result);


    }
}
