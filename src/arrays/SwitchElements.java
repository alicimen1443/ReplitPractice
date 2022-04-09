package arrays;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
public class SwitchElements {

    public static void main(String [] args) {

        Scanner in = new Scanner(System.in);
        int [] arr = {in.nextInt(),in.nextInt(),in.nextInt(),in.nextInt()};
        // Arrays.toString(do_switch(arr));
        System.out.println(Arrays.toString(do_switch(arr)).replaceAll(" ",""));
    }


    public static int[] do_switch(int[] i) {
        int [] array = new int[i.length];

        ArrayList<Integer> list = new ArrayList<>();

        for (int each : i) {
            list.add(each);
        }
        Collections.swap(list,0,list.size()-1);

        for (int j = 0; j < list.size(); j++) {
            array[j]= list.get(j);
        }

        return array;
    }

}
/*
Implement the do_switch method Switch the last element in an array with the first and return the array.

Examples:

do_switch([1,2,3,4])
returns:[4,2,3,1]

do_switch([7,2,3,5])
returns:[5,2,3,7]
 */