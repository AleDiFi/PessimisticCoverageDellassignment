module com.example.pessimisticcoveragedellassignment {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.pessimisticcoveragedellassignment to javafx.fxml;
    exports com.example.pessimisticcoveragedellassignment;
}