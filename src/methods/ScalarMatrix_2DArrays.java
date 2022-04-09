package methods;
import java.util.Arrays;
public class ScalarMatrix_2DArrays {
    public static int[][] scalar(int[][] matrix ,int n) {

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j]*=n;
            }
        }
        return matrix;


    }

    public static void main(String[] args)
    {

        int [][] i= new int[][]
                {
                        {1,1,1},
                        {1,1,1}
                };
        i = scalar(i,2);
        System.out.println(Arrays.deepToString( i ));

    }//end main


}
/*
Scalar multiplication of matrix is the simplest and easiest way to multiply matrix. You get an int 2d array and need to multiply each of its elements by value of parameter n int. Returned the modifed array.

Example:

matrix =

[ [1,1,1]
  [1,1,2] ]

scalar(matrix,5)
returns(after multiplying each value by 5):

[ [5,5,5]
  [5,5,10] ]
matrix =


[ [2,3,5]
  [1,1,2] ]

scalar(matrix,2)
returns:

[ [4,6,10]
  [2,2,4] ]

hint: nested for loops
 */