module maddox.assignment1.assignment1 {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens maddox.assignment1.assignment1 to javafx.fxml;
    exports maddox.assignment1.assignment1;
}