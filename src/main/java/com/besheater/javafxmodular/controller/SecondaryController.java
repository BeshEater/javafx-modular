package com.besheater.javafxmodular.controller;

import com.besheater.javafxmodular.WindowManager;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import org.apache.commons.lang3.SystemUtils;

public class SecondaryController {

    @FXML
    private Label textLabel;

    @FXML
    private Button closeBtn;

    @FXML
    public void initialize() {
        String text = SystemUtils.OS_NAME + " | " + SystemUtils.OS_VERSION;
        textLabel.setText(text);
    }

    @FXML
    private void closeBtnPressed(ActionEvent event) {
        System.out.println("Secondary window closing");
        WindowManager windowManager = new WindowManager();
        windowManager.closeWindow(event);
    }
}
