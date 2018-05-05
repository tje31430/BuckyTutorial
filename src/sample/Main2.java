package sample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.awt.*;

/**
 * Created by Tyler on 5/1/2018.
 * This one starts at tutorial 4
 */
public class Main2 extends Application {
    //these variables make it easier to visualized whats going on
    Stage window;
    Scene scene1, scene2;

    public static void main(String[] args){
        launch(args);
    }

    /*
    @Override
    public void start(Stage primaryStage) throws Exception{
        window = primaryStage;

        Label label1 = new Label("My first chunk of text");

        //button that on action will go to scene 2
        Button button1 = new Button("Go to scene 2");
        button1.setOnAction(e->window.setScene(scene2));

        //multiple layoout
        //vbow is a speical layout that allows us to space out vertically
        VBox layout1 = new VBox(20);
        layout1.getChildren().addAll(label1, button1);

        scene1 = new Scene(layout1, 600, 800);

        //button that on action will go to scene 2
        Button button2 = new Button("Go to scene 1");
        button2.setOnAction(e->window.setScene(scene1));

        //stackpane does some stuff ////////////////////////////
        StackPane layout2 = new StackPane();
        layout2.getChildren().addAll(button2);
        scene2 = new Scene(layout2, 600, 800);

        window.setScene(scene2);
        window.setTitle("Temp switching");
        window.show();

    }
    */
    @Override
    public void start(Stage primaryStage) throws Exception {
        //now we are going to create some seperate windows inside the program, called alerts
        window = primaryStage;
        window.setTitle("Home Window.");

        Button alert = new Button("I create a new window");
        alert.setOnAction(e->{
            boolean result = ConfirmBox.display("Choose", "What do you choose Skinny Man.");
            System.out.println("The result was " + result);

        });
        StackPane layout = new StackPane();
        layout.getChildren().add(alert);

        scene1 = new Scene(layout, 600, 800);

        window.setScene(scene1);
        window.setTitle("Totaly original title");
        window.show();
    }

}
