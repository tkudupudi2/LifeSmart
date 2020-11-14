package src.sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Window;

import java.io.IOException;


public class SignUpController {
	@FXML
	private TextField firstNameField;
	@FXML
    private TextField lastNameField;
    @FXML
    private TextField emailField;
    @FXML
    private TextField userNameField;
    @FXML
    private TextField heightField;
    @FXML
    private TextField weightField;
    @FXML
    private TextField passwordField;
    @FXML
    private TextField repeatPasswordField;
    @FXML
    private Label errorLabel;
	
	
    @FXML
    public void buttonClicked(ActionEvent event) throws IOException {
    	// Check if any empty fields
    	if(firstNameField.getText().isEmpty() || lastNameField.getText().isEmpty() || emailField.getText().isEmpty() || userNameField.getText().isEmpty() ||
    			heightField.getText().isEmpty() || weightField.getText().isEmpty() || passwordField.getText().isEmpty() || repeatPasswordField.getText().isEmpty()) {
    		errorLabel.setText("Please fill in all the fields before continuing.");
    		return;
    	}
    	
    	// Check if email exists already in directory
    	if(Main.getMap().containsKey(emailField.getText())) {
    		errorLabel.setText("Email already exists in directory.");
    		return;
    	} 
    	if(!passwordField.equals(repeatPasswordField)) {
    		return;
    	}
    	Parent loginViewParent = FXMLLoader.load(getClass().getResource("login.fxml"));
		Scene loginScene = new Scene(loginViewParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(loginScene);
        window.show();
    }
}