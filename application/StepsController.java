package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class StepsController {
	@FXML
	private Label stepsLabel;
	@FXML
	private TextField stepField;
	@FXML
	private Label errorLabel;
	
	@FXML
    public void initialize(){
		this.stepsLabel.setText(UserInfo.getStepsCount().toString());
    }
	
	public void setStepsButtonClicked(ActionEvent event) throws IOException {
		try {
			UserInfo.setStepsCount(UserInfo.getStepsCount() + Integer.parseInt(stepField.getText()));
			stepsLabel.setText(UserInfo.getStepsCount().toString());
		} catch (Exception e) {
			errorLabel.setText("Enter please enter an integer value.");
			System.out.println(e.getMessage());
		}
	}
	
	// Navigation
    public void logoutButtonClicked(ActionEvent event) throws IOException {
        Parent logoutViewParent = FXMLLoader.load(getClass().getResource("./login.fxml"));
        Scene logoutScene = new Scene(logoutViewParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(logoutScene);
        window.show();
    }
    
    public void caloriesButtonClicked(ActionEvent event) throws IOException {
        Parent logoutViewParent = FXMLLoader.load(getClass().getResource("./calories.fxml"));
        Scene logoutScene = new Scene(logoutViewParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(logoutScene);
        window.show();
    }
    
    public void waterButtonClicked(ActionEvent event) throws IOException {
        Parent logoutViewParent = FXMLLoader.load(getClass().getResource("./water.fxml"));
        Scene logoutScene = new Scene(logoutViewParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(logoutScene);
        window.show();
    }
    
    public void sleepButtonClicked(ActionEvent event) throws IOException {
        Parent logoutViewParent = FXMLLoader.load(getClass().getResource("./sleep.fxml"));
        Scene logoutScene = new Scene(logoutViewParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(logoutScene);
        window.show();
    }
    
    public void homeButtonClicked(ActionEvent event) throws IOException {
        Parent logoutViewParent = FXMLLoader.load(getClass().getResource("./home.fxml"));
        Scene logoutScene = new Scene(logoutViewParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(logoutScene);
        window.show();
    }
}
