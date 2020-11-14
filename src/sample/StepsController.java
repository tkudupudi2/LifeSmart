package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class StepsController {
    public void logoutButtonClicked(ActionEvent event) throws IOException {
        Parent logoutViewParent = FXMLLoader.load(getClass().getResource("login.fxml"));
        Scene logoutScene = new Scene(logoutViewParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(logoutScene);
        window.show();
    }
}
