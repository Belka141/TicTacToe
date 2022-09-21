package com.example.tictactoe.TicTacToeConsole;

import java.util.Scanner;

public class TicTacToeConsole {
    public static void main(String[] args) {

        System.out.println("Welcome to Tickle Tackle Toe!!!");
        System.out.println();

        String marker1 = "x";
        String marker2 = "o";
        boolean playAgain = true;

        Scanner s = new Scanner(System.in);
        Human human = new Human();
        Computer computer = new Computer();

        while (playAgain) {
            SetBoard setBoard = new SetBoard();
            setBoard.createBoard();
            setBoard.printBoard();
            System.out.println("please choose your marker");
            System.out.println("type 1 for 'x' or 2 for 'o'");

            int a = s.nextInt();
            if (a == 1) {
                human.setMarker("x");
                computer.setMarker("o");
            } else if (a == 2) {
                human.setMarker("o");
                computer.setMarker("x");
            } else {
                System.out.println("invalid command");
            }

            int first = (int) (Math.random() * 2);
            boolean won = false;
            int turns = 0;
            if (first == 0) {
                System.out.println("Let's play");
                System.out.println();
                while (!won) {
                    human.takeTurn(setBoard.getBoard());
                    turns++;
                    setBoard.printBoard();
                    if (setBoard.hasWon(setBoard.getBoard())) {
                        won = true;
                        System.out.println("Congrats you won!");
                        break;
                    }
                    if (turns == 9) {
                        won = true;
                        System.out.println("It's a bore draw!");
                        break;
                    }
                    if (!won) {
                        computer.takeTurn(setBoard.getBoard(), human);
                        turns++;
                        System.out.println();
                        setBoard.printBoard();
                        System.out.println();
                        if (setBoard.hasWon(setBoard.getBoard())) {
                            won = true;
                            System.out.println("Computer win!");
                            break;
                        }
                    }
                }
            } else if (first == 1) {
                while (!won) {
                    computer.takeTurn(setBoard.getBoard(), human);
                    turns++;
                    System.out.println();
                    setBoard.printBoard();
                    System.out.println();
                    if (setBoard.hasWon(setBoard.getBoard())) {
                        won = true;
                        System.out.println("Computer win!");
                        break;
                    }
                    if (turns == 9) {
                        won = true;
                        System.out.println("Its a bore draw!");
                        break;
                    }
                    human.takeTurn(setBoard.getBoard());
                    turns++;
                    setBoard.printBoard();
                    if (setBoard.hasWon(setBoard.getBoard())) {
                        won = true;
                        System.out.println("Congrats you won!");
                        break;
                    }
                }
            }
        }
    }
}