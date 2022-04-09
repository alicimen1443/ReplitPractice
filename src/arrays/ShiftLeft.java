package arrays;
import java.util.*;
public class ShiftLeft {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] nums = new int[size];
        for(int i = 0; i < size; i++){
            nums[i] = scan.nextInt();
        }
        //WRITE YOUR CODE HERE
        /*
        input: 6, 2, 5, 3

        output: [2, 5, 3, 6]
         */
        int[] result = new int[nums.length];

        for (int i = 1,j=0; i < nums.length; i++,j++) {

            result[j]=nums[i];
        }
        result[result.length-1]=nums[0];
        System.out.println(Arrays.toString(result));




    }
}
/*
import java.util.*;

public class Main {
  public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] nums = new int[size];
        for (int i = 0; i < size; i++) {
            nums[i] = scan.nextInt();
        }
        //WRITE YOUR CODE HERE

        for (int i = size - 1; i >= 0; i--) {
            int term = nums[i];
            nums[i] = nums[size - 1];
            nums[size - 1] = term;
        }

        System.out.println(Arrays.toString(nums));

    }
}
 */
/*
Modify an array that is "left shifted" by one -- so {6, 2, 5, 3} becomes {2, 5, 3, 6}. You may modify and print the given array, or print a new array.`

Example:

input: 6, 2, 5, 3

output: [2, 5, 3, 6]
 */