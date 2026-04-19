package org.example.morsecodegui;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

public class HelloControllerValidated {
    @FXML
    private TextField EntryTB;

    @FXML
    private TextField DisplayTB;

    @FXML
    private Button convertBtn;

    @FXML
    private ToggleGroup toggleGroup;

    @FXML
    private RadioButton morseString;

    @FXML
    private RadioButton stringMorse;

    public void buttonAction() {
        String fromEntryText = EntryTB.getText();
        try {
            String result;
            if (stringMorse.isSelected()) {
                result = ServicesValidated.makeMorseCodefromString(fromEntryText);
            } else {
                result = ServicesValidated.makeStringfromMorseCode(fromEntryText);
            }
            DisplayTB.setText(result);
        } catch (IllegalArgumentException e) {
            DisplayTB.setText("");
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Invalid input");
            alert.setHeaderText("Could not convert");
            alert.setContentText(e.getMessage());
            alert.showAndWait();
        }
    }
}

