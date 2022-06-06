module com.example.sudoku {
    requires javafx.controls;
    requires javafx.fxml;


    opens sudoku.problemdomain to javafx.fxml;
    exports sudoku.problemdomain;
}