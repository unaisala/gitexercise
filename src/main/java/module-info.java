module com.example.gitexercise {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.example.gitexercise to javafx.fxml;
    exports com.example.gitexercise;
}