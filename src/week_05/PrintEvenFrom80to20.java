package week_05;

public class PrintEvenFrom80to20 {

    public static void main(String[] args) {

        String result="";
        for (int i = 80; i >=20 ; i-=2) {

            result+=" "+i;
        }
        System.out.println(result.substring(1));
        
    }
}
/*
Write a for loop that prints all even integers from 80 through and including 20.
 Seperate each number with a space
 */