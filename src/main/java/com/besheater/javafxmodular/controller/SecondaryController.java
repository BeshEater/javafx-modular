package com.besheater.javafxmodular.controller;

import com.besheater.javafxmodular.WindowManager;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class SecondaryController {

    @FXML
    private Button closeBtn;

    @FXML
    private void closeBtnPressed(ActionEvent event) {
        System.out.println("Secondary window closing");
        WindowManager windowManager = new WindowManager();
        windowManager.closeWindow(event);
    }
}
