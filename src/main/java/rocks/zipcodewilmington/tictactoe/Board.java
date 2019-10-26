package rocks.zipcodewilmington.tictactoe;

/**
 * @author leon on 6/22/18.
 */
public class Board {
    public Character[][] tTacBoard;

    public Board(Character[][] matrix) {
        this.tTacBoard = matrix;

    }

    public Boolean isInFavorOfX() {


        for (int i = 0; i < tTacBoard.length; i++) {

            if (tTacBoard[i][0] == 'X' && tTacBoard[i][1] == 'X' && tTacBoard[i][2] == 'X') {

                return true;
            }
            if (tTacBoard[0][i] == 'X' && tTacBoard[1][i] == 'X' && tTacBoard[2][i] == 'X') {
                return true;
            }
        }
        if (tTacBoard[0][0] == 'X' && tTacBoard[1][1] == 'X' && tTacBoard[2][2] == 'X') {

            return true;
        }
        if (tTacBoard[0][2] == 'X' && tTacBoard[1][1] == 'X' && tTacBoard[2][0] == 'X') {
            return true;
        }
        return false;
    }

    public Boolean isInFavorOfO() {
        for (int i = 0; i < tTacBoard.length; i++) {

            if (tTacBoard[i][0] == 'O' && tTacBoard[i][1] == 'O' && tTacBoard[i][2] == 'O') {
                return true;
            }
            if (tTacBoard[0][i] == 'O' && tTacBoard[1][i] == 'O' && tTacBoard[2][i] == 'O') {
                return true;
            }
        }
            if (tTacBoard[0][0] == 'O' && tTacBoard[1][1] == 'O' && tTacBoard[2][2] == 'O') {
                return true;
            }
            if (tTacBoard[0][2] == 'O' && tTacBoard[1][1] == 'O' && tTacBoard[2][0] == 'O') {
                return true;

        }
        return false;
    }

    public Boolean isTie() {


        for (int i = 0; i < tTacBoard.length; i++) {


            for (int j = 0; j < tTacBoard.length; j++) {


                if (tTacBoard[i][j] == ' ') {
                    return false;
                }

            }

        }
        return true;
    }

    public String getWinner () {

            if (isInFavorOfX() == true) {

                return "X";
            }

            if (isInFavorOfO()== true) {

                return "O";

            }

        return "";

    }

}


