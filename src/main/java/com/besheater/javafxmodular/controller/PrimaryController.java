package com.besheater.javafxmodular.controller;

import com.besheater.javafxmodular.WindowManager;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.stage.Modality;
import javafx.stage.StageStyle;

import java.io.IOException;

public class PrimaryController {

    @FXML
    private Button openNewWindowBtn;

    @FXML
    private ImageView imageView;

    @FXML
    private Label textLabel;

    @FXML
    public void initialize() {
    }

    @FXML
    private void openNewWindowBtnPressed(ActionEvent event) throws IOException {
        System.out.println("Opening secondary window");
        WindowManager windowManager = new WindowManager();
        windowManager.showNewWindow("secondaryWindow", Modality.APPLICATION_MODAL,
                StageStyle.UTILITY, "SECONDARY WINDOW");
    }

    public String sayHello() {
        return "Hello!";
    }
}
