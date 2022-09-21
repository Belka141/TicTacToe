package com.example.tictactoe.TicTacToeConsole;

import java.util.Scanner;

public class Human extends Player {

    public void takeTurn(String[][] board) {
        Scanner s = new Scanner(System.in);

        boolean turn = true;
        while (turn) {
            System.out.println("please enter row 1-3");
            int row = s.nextInt();
            if (!(row > 0 && row < 3)) {
                System.out.println("invalid row, try again 1-3");
                row = s.nextInt();
            }
            System.out.println("please enter col 1-3");
            int col = s.nextInt();
            if (!(col > 0 && col < 3)) {
                System.out.println("invalid column, try again ");
                col = s.nextInt();
            }
            System.out.print("you entered " + row + " " + col);
            System.out.println();
            if (board[row - 1][col - 1] != "x" && board[row - 1][col - 1] != "o") {
                board[row - 1][col - 1] = Marker;
                turn = false;
            } else {
                System.out.println("Already Marker here! please guess again!");
            }
        }
    }
}