package methods;
import java.util.Scanner;
public class ReturnMax {
    public static int max(int x, int max){
        // Code here
        int maximum=0;

        if(x>max){
            maximum=x;
        }else if(max>x){
            maximum=max;
        }else{
            maximum=x;
        }
        return maximum;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(max(in.nextInt(), in.nextInt()));
    }




}
/*
Finish the method max which has two parameters, x and max.

if x is bigger than max return x
if max is bigger than x return max
all other cases return x
Example:

max(1,10) -> 10
max(1,10) -> 10
max(11,5) -> 11
 */