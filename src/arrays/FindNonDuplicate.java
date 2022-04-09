package arrays;
import java.util.*;

public class FindNonDuplicate {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(), input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};

        //TODO: write your code below


        for (int each : nums) {
            int frequency=0;
            for (int i = 0; i < nums.length; i++) {
                if(each==nums[i]){
                    frequency++;
                }

                }
            if(frequency==1){
                System.out.println(each);
            }

        }





    }
}
/*
Given an array nums with 7 integers every element is repeated twice -
 except one. Find that element and print it to console.

Example:

nums -> [1, 1, 2, 3, 4, 3, 4] -> 2
 */
