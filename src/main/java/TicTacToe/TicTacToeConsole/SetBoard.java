package TicTacToe.TicTacToeConsole;

public class SetBoard {
    private int N = 3;
    public String[][] board = new String[N][N];

    public boolean hasWon(String[][] board) {
        for (int i = 0; i < 3; i++) {
            if (board[i][0].equals(board[i][1]) && board[i][1].equals(board[i][2]) && (board[i][0].equals("x") || board[i][0].equals("o"))) {
                return true;
            }
        }
        for (int i = 0; i < 3; i++) {
            if (board[0][i].equals(board[1][i]) && board[1][i].equals(board[2][i]) && (board[0][i].equals("x") || board[0][i].equals("o"))) {
                return true;
            }
        }
        if (board[0][0].equals(board[1][1]) && board[1][1].equals(board[2][2]) && (board[0][0].equals("x")) || board[0][0].equals("o")
                || board[2][0].equals(board[1][1]) && board[1][1].equals(board[0][2]) && (board[2][0].equals("x") || board[2][0].equals("o"))) {
            return true;
        }
        return false;
    }

    public void createBoard() {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                board[i][j] = " ";
            }
        }
    }

    public void printBoard() {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print("[" + board[i][j] + "]" + " ");
            }
            System.out.println();
        }
    }

    public String[][] getBoard() {
        return board;
    }
}
