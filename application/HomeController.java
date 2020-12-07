package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class HomeController {
	@FXML
	private Label stepsLabel;
	@FXML
	private Label caloriesLabel;
	@FXML
	private Label waterLabel;
	@FXML
	private Label sleepLabel;
	
	@FXML
    public void initialize(){
		this.caloriesLabel.setText(UserInfo.getCaloriesCount().toString());
		this.sleepLabel.setText(UserInfo.getHoursOfSleepCount().toString());
		this.stepsLabel.setText(UserInfo.getStepsCount().toString());
		this.waterLabel.setText(UserInfo.getCupsOfWaterCount().toString());
    }
	
	
	// Navigation
    public void logoutButtonClicked(ActionEvent event) throws IOException {
        Parent logoutViewParent = FXMLLoader.load(getClass().getResource("./login.fxml"));
        Scene logoutScene = new Scene(logoutViewParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(logoutScene);
        window.show();
    }
    
    public void stepsButtonClicked(ActionEvent event) throws IOException {
        Parent logoutViewParent = FXMLLoader.load(getClass().getResource("./steps.fxml"));
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
    
    
    
}
