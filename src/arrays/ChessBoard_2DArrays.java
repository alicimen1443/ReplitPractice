package arrays;
import java.util.*;

public class ChessBoard_2DArrays {
    public static void main(String[] args) {

        //WRITE YOUR CODE HERE

        String[][] chessBoard= new String[8][8]; //{1a,2a,3a,4a,5a,6a,7a,8a}

        char ch='a';

        for (int i = 0; i <8 ; i++) {
            for (int j = 0; j <8 ; j++) {

                chessBoard[i][j]=""+(i+1)+ch++;// or we can type here (char)(97+j)
            }
            ch='a';
        }






        //DO NOT CHANGE
        System.out.println(Arrays.deepToString(chessBoard));


    }
}

/*
Given a 8x8 two-dimensional array of strings named chessboard. Initialize values
inside an array accordingly to the chess board. So first element in the array, chessboard[0]
 should have a value "1a", and last element in the array, chessboard[7] should have a value "8h".
 */
