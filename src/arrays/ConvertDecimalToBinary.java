package arrays;
import java.util.*;

public class ConvertDecimalToBinary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int decimal = input.nextInt();
        int[] binary = new int[8];

        //TODO: Write your code below.

        for (int i = binary.length-1,j=0; i >=0; i--,j+=2) {

            binary[i]=decimal%2;
            decimal/=2;
        }
        System.out.println(Arrays.toString(binary));



    }
}
