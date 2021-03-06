package application;

import java.util.HashMap;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
	
	private static HashMap<String, String> userEmailPasswordMap = new HashMap<>();
	
	public static void putInMap(String email, String password) {
		userEmailPasswordMap.put(email, password);
	}
	
	public static HashMap<String, String> getMap() {
		return userEmailPasswordMap;
	}

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("login.fxml"));
        primaryStage.setTitle("LifeSmart");
        primaryStage.setScene(new Scene(root, 1920, 1080));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
