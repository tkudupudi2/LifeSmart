import javafx.application.*;
import javafx.geometry.Insets;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;

public class app extends Application {

    Stage window;
    Scene scene1, scene2, scene3, scene4, scene5, scene6, scene7, scene8, scene9, scene10;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        window = primaryStage;

        //Home Buttons
        Label label1 = new Label("Home");
        GridPane.setConstraints(label1, 0, 0);
        Button homeButton1 = new Button("About Us");
        GridPane.setConstraints(homeButton1, 1, 0);
        homeButton1.setOnAction(e -> window.setScene(scene2));
        Button homeButton2 = new Button("Login");
        GridPane.setConstraints(homeButton2, 2, 0);
        homeButton2.setOnAction(e -> window.setScene(scene3));
        Button homeButton3 = new Button("Register");
        GridPane.setConstraints(homeButton3, 3, 0);
        homeButton3.setOnAction(e -> window.setScene(scene4));

        //Home Layout
        GridPane gridPane = new GridPane();
        gridPane.setPadding(new Insets(10, 10, 10, 10));
		gridPane.setVgap(8);
		gridPane.setHgap(10);
		gridPane.getChildren().addAll(label1, homeButton1, homeButton2, homeButton3);
        scene1 = new Scene(gridPane, 1920, 1080);


        //About Buttons
        Label label2 = new Label ("About Us");
        GridPane.setConstraints(label2, 0, 0);
        Button aboutButton1 = new Button("Home");
        GridPane.setConstraints(aboutButton1, 1, 0);
        aboutButton1.setOnAction(e -> window.setScene(scene1));
        Button aboutButton2 = new Button("Login");
        GridPane.setConstraints(aboutButton2, 2, 0);
        aboutButton2.setOnAction(e -> window.setScene(scene3));
        Button aboutButton3 = new Button("Register");
        GridPane.setConstraints(aboutButton3, 3, 0);
        aboutButton3.setOnAction(e -> window.setScene(scene4));

        //About Layout
        GridPane gridPane2 = new GridPane();
        gridPane2.setPadding(new Insets(10, 10, 10, 10));
		gridPane2.setVgap(8);
		gridPane2.setHgap(10);
		gridPane2.getChildren().addAll(label2, aboutButton1, aboutButton2, aboutButton3);
        scene2 = new Scene(gridPane2, 1920, 1080);
        
      //Login Buttons
        Label label3 = new Label ("Login");
        GridPane.setConstraints(label3, 0, 0);
        Button loginButton1 = new Button("Home");
        GridPane.setConstraints(loginButton1, 1, 0);
        loginButton1.setOnAction(e -> window.setScene(scene1));
        Button loginButton2 = new Button("About Us");
        GridPane.setConstraints(loginButton2, 2, 0);
        loginButton2.setOnAction(e -> window.setScene(scene2));
        Button loginButton3 = new Button("Register");
        GridPane.setConstraints(loginButton3, 3, 0);
        loginButton3.setOnAction(e -> window.setScene(scene4));
        Label nameLabel = new Label ("Username:");
		GridPane.setConstraints(nameLabel, 4, 2);		
		TextField nameInput= new TextField();
		nameInput.setPromptText("Username");
		GridPane.setConstraints(nameInput, 5, 2);
		Label passLabel = new Label ("Password:");
		GridPane.setConstraints(passLabel, 4, 3);
		TextField passInput= new TextField();
		passInput.setPromptText("Password");
		GridPane.setConstraints(passInput, 5, 3);
		Button submitButton = new Button ("Submit");
		GridPane.setConstraints(submitButton, 5, 4);
		submitButton.setOnAction(e -> window.setScene(scene5));

        //Login Layout
        GridPane gridPane3 = new GridPane();
        gridPane3.setPadding(new Insets(10, 10, 10, 10));
		gridPane3.setVgap(8);
		gridPane3.setHgap(10);
		gridPane3.getChildren().addAll(label3, loginButton1, loginButton2, loginButton3, nameLabel, nameInput, passLabel, passInput, submitButton);
        scene3 = new Scene(gridPane3, 1920, 1080);
        
      //Register Buttons
        Label label4 = new Label ("Register");
        GridPane.setConstraints(label4, 0, 0);
        Button registerButton1 = new Button("Home");
        GridPane.setConstraints(registerButton1, 1, 0);
        registerButton1.setOnAction(e -> window.setScene(scene1));
        Button registerButton2 = new Button("About Us");
        GridPane.setConstraints(registerButton2, 2, 0);
        registerButton2.setOnAction(e -> window.setScene(scene2));
        Button registerButton3 = new Button("Login");
        GridPane.setConstraints(registerButton3, 3, 0);
        registerButton3.setOnAction(e -> window.setScene(scene3));
        Label firstName = new Label ("First Name");
        GridPane.setConstraints(firstName, 4, 2);
        TextField firstNameInput= new TextField();
        firstNameInput.setPromptText("First Name");
		GridPane.setConstraints(firstNameInput, 5, 2);
		Label lastName = new Label ("Last Name");
        GridPane.setConstraints(lastName, 4, 3);
        TextField lastNameInput= new TextField();
        lastNameInput.setPromptText("Last Name");
		GridPane.setConstraints(lastNameInput, 5, 3);
        Label nameLabel1 = new Label ("Username:");
		GridPane.setConstraints(nameLabel1, 4, 4);		
        TextField nameInput1= new TextField();
        nameInput1.setPromptText("Username");
		GridPane.setConstraints(nameInput1, 5, 4);
		Label passLabel1 = new Label ("Password:");
		GridPane.setConstraints(passLabel1, 4, 5);
		TextField passInput1= new TextField();
		passInput1.setPromptText("Password");
		GridPane.setConstraints(passInput1, 5, 5);
		Button submitButton1 = new Button ("Submit");
		GridPane.setConstraints(submitButton1, 5, 6);
		submitButton1.setOnAction(e -> window.setScene(scene3));

        //Register Layout
        GridPane gridPane4 = new GridPane();
        gridPane4.setPadding(new Insets(10, 10, 10, 10));
		gridPane4.setVgap(8);
		gridPane4.setHgap(10);
		gridPane4.getChildren().addAll(label4, registerButton1, registerButton2, registerButton3, nameLabel1, nameInput1, passLabel1, passInput1, submitButton1, firstName, firstNameInput, lastName, lastNameInput);
        scene4 = new Scene(gridPane4, 1920, 1080);
        
        //Logged In User Home Button
        Label logLabel1 = new Label("Home");
        GridPane.setConstraints(logLabel1, 0, 0);
        Label homeText = new Label ("Welcome!");
        GridPane.setConstraints(homeText, 0, 3);
        Button logHomeButton1 = new Button("Steps");
        GridPane.setConstraints(logHomeButton1, 1, 0);
        logHomeButton1.setOnAction(e -> window.setScene(scene6));
        Button logHomeButton2 = new Button("Fitness");
        GridPane.setConstraints(logHomeButton2, 2, 0);
        logHomeButton2.setOnAction(e -> window.setScene(scene7));
        Button logHomeButton3 = new Button("Calories");
        GridPane.setConstraints(logHomeButton3, 3, 0);
        logHomeButton3.setOnAction(e -> window.setScene(scene8));
        Button logHomeButton4 = new Button("Sleep");
        GridPane.setConstraints(logHomeButton4, 4, 0);
        logHomeButton4.setOnAction(e -> window.setScene(scene9));
        Button logHomeButton5 = new Button("Water");
        GridPane.setConstraints(logHomeButton5, 5, 0);
        logHomeButton5.setOnAction(e -> window.setScene(scene10));
        Button logHomeButton6 = new Button("Log Out");
        GridPane.setConstraints(logHomeButton6, 6, 0);
        logHomeButton6.setOnAction(e -> window.setScene(scene1));

        //Home Layout
        GridPane gridPane5 = new GridPane();
        gridPane5.setPadding(new Insets(10, 10, 10, 10));
		gridPane5.setVgap(8);
		gridPane5.setHgap(10);
		gridPane5.getChildren().addAll(logLabel1, homeText, logHomeButton1, logHomeButton2, logHomeButton3, logHomeButton4, logHomeButton5, logHomeButton6);
        scene5 = new Scene(gridPane5, 1920, 1080);
        
        //Logged In Steps Button
        Label stepsLabel1 = new Label("Steps");
        GridPane.setConstraints(stepsLabel1, 0, 0);
        Button stepsButton1 = new Button("Home");
        GridPane.setConstraints(stepsButton1, 1, 0);
        stepsButton1.setOnAction(e -> window.setScene(scene5));
        Button stepsButton2 = new Button("Fitness");
        GridPane.setConstraints(stepsButton2, 2, 0);
        stepsButton2.setOnAction(e -> window.setScene(scene7));
        Button stepsButton3 = new Button("Calories");
        GridPane.setConstraints(stepsButton3, 3, 0);
        stepsButton3.setOnAction(e -> window.setScene(scene8));
        Button stepsButton4 = new Button("Sleep");
        GridPane.setConstraints(stepsButton4, 4, 0);
        stepsButton4.setOnAction(e -> window.setScene(scene9));
        Button stepsButton5 = new Button("Water");
        GridPane.setConstraints(stepsButton5, 5, 0);
        stepsButton5.setOnAction(e -> window.setScene(scene10));
        Button stepsButton6 = new Button("Log Out");
        GridPane.setConstraints(stepsButton6, 6, 0);
        stepsButton6.setOnAction(e -> window.setScene(scene1));

        //Steps Layout
        GridPane gridPane6 = new GridPane();
        gridPane6.setPadding(new Insets(10, 10, 10, 10));
		gridPane6.setVgap(8);
		gridPane6.setHgap(10);
		gridPane6.getChildren().addAll(stepsLabel1, stepsButton1, stepsButton2, stepsButton3, stepsButton4, stepsButton5, stepsButton6);
        scene6 = new Scene(gridPane6, 1920, 1080);
        
      //Logged In Fitness Button
        Label fitLabel1 = new Label("Fitness");
        GridPane.setConstraints(fitLabel1, 0, 0);
        Button fitButton1 = new Button("Home");
        GridPane.setConstraints(fitButton1, 1, 0);
        fitButton1.setOnAction(e -> window.setScene(scene5));
        Button fitButton2 = new Button("Steps");
        GridPane.setConstraints(fitButton2, 2, 0);
        fitButton2.setOnAction(e -> window.setScene(scene6));
        Button fitButton3 = new Button("Calories");
        GridPane.setConstraints(fitButton3, 3, 0);
        fitButton3.setOnAction(e -> window.setScene(scene8));
        Button fitButton4 = new Button("Sleep");
        GridPane.setConstraints(fitButton4, 4, 0);
        fitButton4.setOnAction(e -> window.setScene(scene9));
        Button fitButton5 = new Button("Water");
        GridPane.setConstraints(fitButton5, 5, 0);
        fitButton5.setOnAction(e -> window.setScene(scene10));
        Button fitButton6 = new Button("Log Out");
        GridPane.setConstraints(fitButton6, 6, 0);
        fitButton6.setOnAction(e -> window.setScene(scene1));

        //Fitness Layout
        GridPane gridPane7 = new GridPane();
        gridPane7.setPadding(new Insets(10, 10, 10, 10));
		gridPane7.setVgap(8);
		gridPane7.setHgap(10);
		gridPane7.getChildren().addAll(fitLabel1, fitButton1, fitButton2, fitButton3, fitButton4, fitButton5, fitButton6);
        scene7 = new Scene(gridPane7, 1920, 1080);
        
      //Logged In Calories Button
        Label calsLabel1 = new Label("Calories");
        GridPane.setConstraints(calsLabel1, 0, 0);
        Button calsButton1 = new Button("Home");
        GridPane.setConstraints(calsButton1, 1, 0);
        calsButton1.setOnAction(e -> window.setScene(scene5));
        Button calsButton2 = new Button("Steps");
        GridPane.setConstraints(calsButton2, 2, 0);
        calsButton2.setOnAction(e -> window.setScene(scene6));
        Button calsButton3 = new Button("Fitness");
        GridPane.setConstraints(calsButton3, 3, 0);
        calsButton3.setOnAction(e -> window.setScene(scene7));
        Button calsButton4 = new Button("Sleep");
        GridPane.setConstraints(calsButton4, 4, 0);
        calsButton4.setOnAction(e -> window.setScene(scene9));
        Button calsButton5 = new Button("Water");
        GridPane.setConstraints(calsButton5, 5, 0);
        calsButton5.setOnAction(e -> window.setScene(scene10));
        Button calsButton6 = new Button("Log Out");
        GridPane.setConstraints(calsButton6, 6, 0);
        calsButton6.setOnAction(e -> window.setScene(scene1));

        //Cals Layout
        GridPane gridPane8 = new GridPane();
        gridPane8.setPadding(new Insets(10, 10, 10, 10));
		gridPane8.setVgap(8);
		gridPane8.setHgap(10);
		gridPane8.getChildren().addAll(calsLabel1, calsButton1, calsButton2, calsButton3, calsButton4, calsButton5, calsButton6);
        scene8 = new Scene(gridPane8, 1920, 1080);
        
      //Logged In Sleep Button
        Label sleepLabel1 = new Label("Sleep");
        GridPane.setConstraints(sleepLabel1, 0, 0);
        Button sleepButton1 = new Button("Home");
        GridPane.setConstraints(sleepButton1, 1, 0);
        sleepButton1.setOnAction(e -> window.setScene(scene5));
        Button sleepButton2 = new Button("Steps");
        GridPane.setConstraints(sleepButton2, 2, 0);
        sleepButton2.setOnAction(e -> window.setScene(scene6));
        Button sleepButton3 = new Button("Fitness");
        GridPane.setConstraints(sleepButton3, 3, 0);
        sleepButton3.setOnAction(e -> window.setScene(scene7));
        Button sleepButton4 = new Button("Calories");
        GridPane.setConstraints(sleepButton4, 4, 0);
        sleepButton4.setOnAction(e -> window.setScene(scene8));
        Button sleepButton5 = new Button("Water");
        GridPane.setConstraints(sleepButton5, 5, 0);
        sleepButton5.setOnAction(e -> window.setScene(scene10));
        Button sleepButton6 = new Button("Log Out");
        GridPane.setConstraints(sleepButton6, 6, 0);
        sleepButton6.setOnAction(e -> window.setScene(scene1));

        //Sleep Layout
        GridPane gridPane9 = new GridPane();
        gridPane9.setPadding(new Insets(10, 10, 10, 10));
		gridPane9.setVgap(8);
		gridPane9.setHgap(10);
		gridPane9.getChildren().addAll(sleepLabel1, sleepButton1, sleepButton2, sleepButton3, sleepButton4, sleepButton5, sleepButton6);
        scene9 = new Scene(gridPane9, 1920, 1080);
        
      //Logged In Water Button
        Label waterLabel1 = new Label("Water");
        GridPane.setConstraints(waterLabel1, 0, 0);
        Button waterButton1 = new Button("Home");
        GridPane.setConstraints(waterButton1, 1, 0);
        waterButton1.setOnAction(e -> window.setScene(scene5));
        Button waterButton2 = new Button("Steps");
        GridPane.setConstraints(waterButton2, 2, 0);
        waterButton2.setOnAction(e -> window.setScene(scene6));
        Button waterButton3 = new Button("Fitness");
        GridPane.setConstraints(waterButton3, 3, 0);
        waterButton3.setOnAction(e -> window.setScene(scene7));
        Button waterButton4 = new Button("Calories");
        GridPane.setConstraints(waterButton4, 4, 0);
        waterButton4.setOnAction(e -> window.setScene(scene8));
        Button waterButton5 = new Button("Sleep");
        GridPane.setConstraints(waterButton5, 5, 0);
        waterButton5.setOnAction(e -> window.setScene(scene9));
        Button waterButton6 = new Button("Log Out");
        GridPane.setConstraints(waterButton6, 6, 0);
        waterButton6.setOnAction(e -> window.setScene(scene1));

        //Water Layout
        GridPane gridPane10 = new GridPane();
        gridPane10.setPadding(new Insets(10, 10, 10, 10));
		gridPane10.setVgap(8);
		gridPane10.setHgap(10);
		gridPane10.getChildren().addAll(waterLabel1, waterButton1, waterButton2, waterButton3, waterButton4, waterButton5, waterButton6);
        scene10 = new Scene(gridPane10, 1920, 1080);

        //Display scene 1 when launched
        window.setScene(scene1);
        window.setTitle("LifeSmart");
        window.show();
    }

}