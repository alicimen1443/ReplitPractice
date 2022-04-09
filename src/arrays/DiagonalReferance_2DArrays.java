package arrays;
import java.util.*;
public class DiagonalReferance_2DArrays {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int[][] matrix = new int[][]{ {scan.nextInt(), scan.nextInt(), scan.nextInt()},{scan.nextInt(), scan.nextInt(), scan.nextInt()},
                {scan.nextInt(), scan.nextInt(), scan.nextInt()}};
        int result = 0;

        int rightToLeft=0;
        int leftToRight=0;

        for (int i = 0,j=0; i <=2 ; i++,j++) {

            rightToLeft+=matrix[j][i];
        }
        for (int i = 0,j=2; i <=2 ; i++,j--) {
            leftToRight+=matrix[i][j];
        }
        result=rightToLeft-leftToRight;



        // FINAL PRINT
        System.out.println(Math.abs(result));


    }
}

/*
Given a square matrix, calculate the absolute difference between the sums of its diagonals.

For example, the square matrix is shown below:

1 2 3
4 5 6
9 8 9

The left-to-right diagonal = 1+5+9 = 15. The right to left diagonal = 3+5+9 = 17. Their absolute difference is |15-17| = 2
 */
