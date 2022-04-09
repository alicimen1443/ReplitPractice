package methods;
import java.util.Scanner;
public class Signum {
    public static void sign(int n){
        //your code here

        String sign = (n>0)?"positive":(n<0)?"negative":"zero";
        System.out.println(sign);


    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();

        sign(n);

    }

}
/*
Given a method sign write the code so that its takes a number arguement and tells you if its positive, negative or zero.

for example :

sign(5)  => positive

sign(-30) => negative

sign(0)  => zero
 */