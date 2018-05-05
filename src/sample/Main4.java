package sample;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import sun.net.www.ApplicationLaunchException;

/**
 * Created by Tyler on 5/3/2018.
 * Experimenting with grid panes
 */
public class Main4 extends Application {
    //easy globabl window manipulation
    Stage stage;

    public static void main(String args[]){
        launch(args);
    }

    @Override
    public void start(Stage primaryStage){
        stage = primaryStage;
        stage.setTitle("GribPanes");


        GridPane grid = new GridPane();
        //first thing to do is set padding around edges
        grid.setPadding(new Insets(20, 20, 20, 20));

        //now we need to set the padding between grid cells
        grid.setVgap(16);
        grid.setHgap(20);

        //add some items to the window
        Label userName = new Label("Username");
        GridPane.setConstraints(userName, 0, 0);

        TextField nameInput = new TextField("Username");
        GridPane.setConstraints(nameInput, 0, 1);


        //password
        Label password = new Label("Password");
        GridPane.setConstraints(password, 1, 0);

        TextField passInput = new TextField();
        passInput.setPromptText("Enter password");
        GridPane.setConstraints(passInput, 1, 1);

        Button loginButton = new Button("Log in");
        GridPane.setConstraints(loginButton, 0, 2);
        loginButton.setOnAction(e-> System.out.println("Tried to login"));

        grid.getChildren().addAll(userName, nameInput, password, passInput, loginButton);


        Scene mainScene = new Scene(grid, 800, 600);
        stage.setScene(mainScene);
        stage.show();

    }

}
