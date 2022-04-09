package arrays;
import java.util.*;
public class LargestNumber2 {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        int rows = inp.nextInt(), cols = inp.nextInt();
        int[][] arr = new int[rows][cols];
        for(int i=0 ;i<=rows-1;i++){
            for(int j=0 ;j<=cols-1;j++){
                arr[i][j]=inp.nextInt();
            }//end for cols
        }//end for rows

        //TODO write your code below

        int max=arr[0][0];

        for (int[] eachCol : arr) {
            for (int eachRow : eachCol) {
                if(eachRow>max){
                    max=eachRow;
                }
            }
        }

        for (int[] eachRow : arr) {
            for (int i = 0; i < eachRow.length; i++) {

                eachRow[i]=max;
            }

        }





        //FINAL PRINT
        System.out.println(Arrays.deepToString(arr));


    }
}

/*
Given a 2d array of ints, find the biggest number(integer) and replace all array values on
 biggest number in the array then print an array.

Example:

Given values: [[1, 2, 3], [5, 33, 9]]

output: [[33, 33, 33], [33, 33, 33]]
 */
