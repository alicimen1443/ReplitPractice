package week_04;

import java.util.Scanner;

public class Alejandro2 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        String a = s.nextLine();
        //your code here
        s.close();

        if(a.contains("alejandro")){
            if(a.contains("project")){
                System.out.println("read");
            }else{
                System.out.println("don't read");
            }

        }else{
            System.out.println("don't read");
        }
    }
}

/*


 */
