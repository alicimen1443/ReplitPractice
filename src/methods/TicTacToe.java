package methods;

import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char[] game = new char[9];
        for (int i = 0; i < game.length; i++) {
            game[i] = in.next().charAt(0);
        }

        System.out.println(won(game));
    }

    public static String won(char[] x) {
        char ch = ' ';

        for (int i = 0, j = 0; i < 3; i++,j+=3) {

            if(x[i]==x[i+3]&&x[i]==x[i+6]){
                ch=x[i];
            }else if(x[j]==x[j+1]&&x[j]==x[j+2]){
                ch=x[j];
            }else if(x[0]==x[4]&&x[0]==x[8]){
                ch=x[0];
            }else if(x[2]==x[4]&&x[2]==x[6]){
                ch=x[2];
            }
        }
        String result="Player "+ch+" won";
        return result;


    }
}
/*
Write the method won(char[]) that should determine who won in tic-tac-toe game.

If X player won, return string: "Player X won"
If O player won, return string: "Player O won"
Example:

char[] game1 = {
  'X', 'X', 'X',
  '-', 'O', '-',
  '-', 'O', '-'
};

Result: Player X won
 */