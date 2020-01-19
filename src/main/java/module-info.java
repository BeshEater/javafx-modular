module com.besheater.filedownloader {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.besheater.javafxmodular to javafx.fxml;
    opens com.besheater.javafxmodular.controller to javafx.fxml;
    exports com.besheater.javafxmodular;
}