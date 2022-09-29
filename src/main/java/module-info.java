module com.example.tictactoe {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.example.tictactoe to javafx.fxml;
    exports TicTacToe.TicTacToeConsole;
    opens TicTacToe.TicTacToeConsole to javafx.fxml;
}