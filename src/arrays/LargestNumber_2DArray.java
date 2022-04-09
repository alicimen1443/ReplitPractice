package arrays;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class LargestNumber_2DArray {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        int rows = inp.nextInt(), cols = inp.nextInt();
        int[][] arr = new int[rows][cols];
        for(int i=0 ;i<=rows-1;i++) {
            for(int j=0 ;j<=cols-1;j++) {

                arr[i][j]=inp.nextInt();

            }//end for cols
        }//end for rows

        //TODO write your code below

        int max = arr[0][0];

        for (int[] eachRow : arr) {

            for (int eachCol : eachRow) {
                if(eachCol>max){
                    max=eachCol;
                }
            }
        }
        System.out.println(max);



    }
}

/*
Given a 2d array of ints, find the biggest number(int) in the array and print it.
 */
