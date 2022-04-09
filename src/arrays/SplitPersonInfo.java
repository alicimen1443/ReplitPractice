package arrays;
import java.util.Scanner;
public class SplitPersonInfo {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String s = inp.next();
        person(s) ;
    }

    public static void person(String info) {
        //your code here

        String[] str = info.split(",");
        String name = str[0];
        String lastName=str[1];
        String age= str[2];
        System.out.println("person name: "+name+"\nlast name: "+lastName+"\nage: "+age);

    }
}
/*
The method person has a string arguement with this format: "name,last name,age". Print out the person's information

Example:

person("jon,doe,30");

output:
person name: jon
last name: doe
age: 30
person("jon,doe,30");

output:
person name: jon
last name: doe
age: 30
hint: use the split method to split the string to a string array where there is a "," char
 */