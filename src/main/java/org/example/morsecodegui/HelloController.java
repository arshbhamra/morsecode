package org.example.morsecodegui;

import javafx.fxml.FXML;
import javafx.scene.control.*;

import javax.swing.*;

public class HelloController {
    @FXML
    private TextField EntryTB;

    @FXML
    private TextField DisplayTB;

    @FXML
    private Button convertBtn;

    @FXML
    private ToggleGroup toggleGroup;

    @FXML
    private RadioButton stringMorse;

    private Services serviceOBJ = new Services();

    public void buttonAction() {
        try {
            String fromEntryText = EntryTB.getText();
            String text2;
            if (stringMorse.isSelected()) {
                text2 = serviceOBJ.makeMorseCodefromString(fromEntryText);
                DisplayTB.setText(text2);
            } else {
                text2 = serviceOBJ.makeStringfromMorseCode(fromEntryText);
                DisplayTB.setText(text2);
            }
        } catch (IllegalArgumentException e) {
            DisplayTB.setText("************");
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Invalid Input Error");
            alert.setHeaderText("Could not convert");
            alert.setContentText(e.getMessage());
            alert.showAndWait();
        }

    }

}