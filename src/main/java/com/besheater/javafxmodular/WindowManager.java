package com.besheater.javafxmodular;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;
import java.net.URL;
import java.util.Locale;
import java.util.ResourceBundle;

public class WindowManager {

    public WindowManager() {}

    /**
     * Loads FXML file based on its name
     * @param fxmlFileName fxml file name without .fxml extension
     * @return Root node from newly loaded fxml file
     * @throws IOException
     */
    private Parent loadFXML(String fxmlFileName) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(App.class.getResource("/fxml/" + fxmlFileName + ".fxml"));
        loader.setResources(ResourceBundle.getBundle("properties.guitext", Locale.getDefault()));
        return loader.load();
    }

    /**
     * Shows new window with defined properties
     * @param fxmlFileName fxml file name without .fxml extension
     * @param modality new window modality
     * @param style new window style
     * @param title new window title
     * @throws IOException
     */
    public Stage showNewWindow(String fxmlFileName, Modality modality,
                               StageStyle style, String title) throws IOException {
        Stage stage = new Stage();
        Scene scene = new Scene(loadFXML(fxmlFileName));
        stage.setScene(scene);
        stage.initModality(modality);
        stage.initStyle(style);
        stage.setTitle(title);
        stage.show();
        // Set stage width and height from fxml root node which values can be set from CSS
        // must be placed after stage.show() because CSS only loads when stage shown
        stage.setMinWidth(scene.getRoot().minWidth(-1));
        stage.setMinHeight(scene.getRoot().minHeight(-1));
        stage.setWidth(scene.getRoot().prefWidth(-1));
        stage.setHeight(scene.getRoot().prefHeight(-1));
        return stage;
    }

    /**
     *  Closes window based on Action event that originates from it
     * @param event event which source window will be closed
     */
    public void closeWindow(ActionEvent event) {
        Node source = (Node) event.getSource();
        Stage stage = (Stage) source.getScene().getWindow();
        stage.close();
    }
}
