package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.stage.Window;

import java.io.IOException;

public class LoginController {
    @FXML
    public void buttonClicked(ActionEvent event) throws IOException {
        Parent stepsViewParent = FXMLLoader.load(getClass().getResource("steps.fxml"));
        Scene stepsScene = new Scene(stepsViewParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(stepsScene);
        window.show();
    }

    public void registerButtonClicked(ActionEvent event) throws IOException {
        Parent registerViewParent = FXMLLoader.load(getClass().getResource("sample.fxml"));
        Scene registerScene = new Scene(registerViewParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(registerScene);
        window.show();
    }
}
