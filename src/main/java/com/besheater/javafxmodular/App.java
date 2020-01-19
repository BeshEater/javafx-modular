package com.besheater.javafxmodular;

import javafx.application.Application;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

/**
 * Main class from which all application starts
 */
public class App extends Application {

    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) throws IOException {
        showMainWindow(stage);
    }

    private void showMainWindow(Stage stage) throws IOException {
        WindowManager windowManager = new WindowManager();
        windowManager.showNewWindow("primaryWindow", Modality.NONE,
                StageStyle.UNIFIED, "JAVAFX-MODULAR");
    }
}