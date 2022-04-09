package methods;
import java.util.Arrays;
import java.util.Scanner;

public class MergeTwoArrays {
    public static int[] merge(int[] a,int[] b) {

       int[] result =new int[a.length+b.length];

        int j = 0;

        for (int each : a) {
            result[j++]=each;
        }
        for (int each : b) {
            result[j++]=each;
        }

        return result;




    }//end merge

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int [] nums = new int[in.nextInt()];
        int [] nums2 = new int[in.nextInt()];
        for(int i=0; i < nums.length; i++) {
            nums[i] = in.nextInt();
        }
        for(int i=0; i < nums2.length; i++) {
            nums2[i] = in.nextInt();
        }

        System.out.println(Arrays.toString(merge(nums, nums2)));
    }
}
