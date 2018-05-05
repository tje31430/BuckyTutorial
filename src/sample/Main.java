package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import javax.swing.*;

//inherit application for the javaFx functionality
//if we want the user to interact with elements on page, we need the event handler
public class Main extends Application {
    Button button;
    Stage window;


    public static void main(String[] args) {
        //goes into application and sets up all the busy work to make it a javaFX Application
        //then it calls a method called start
        launch(args);
    }

    //Bascially entry point for the program
    @Override
    public void start(Stage primarystage) throws Exception{
        //main JavaFx code

        //stage is basically the outer window
         window = primarystage;
         window.setTitle("My first Window");

         //whenever user tries to close the window via red X
        window.setOnCloseRequest(e-> {
            //consume event, means we take over the event
            e.consume();
            closeProgram();

        });

        //content inside the stage is called a scene

        //first button instantiated
        button = new Button("Can also set text during instantiation.");
        button.setText("Click me Bro.");

        //since java 8 new syntax was introduced to effect button creation
        //we use a generic identifier followed by a lambda of what we want to happen
        button.setOnAction(f-> closeProgram());



        //on click the code to handle is in this class

        /*
        button.setOnAction(new EventHandler<ActionEvent>() {
            //this is called an anonymous inner class
            //looks nicer where helps with organizations
            //also means we don't have to call get source
            @Override
            public void handle(ActionEvent event) {
                System.out.print("bob\n");
            }
        });
        */

        //layout is how we want things to be arranged on the scene.
        StackPane layout = new StackPane();

        //we are getting all the children references and adding button to that list.
        layout.getChildren().add(button);

        //now we are creating a scene with the layout as the constructor parameter
        //along with setting the width and height of the window
        Scene scene = new Scene(layout, 600, 800);

        //which scene we want to display
        primarystage.setScene(scene);

        //enabling visibility
        primarystage.show();
    }

    //you should have a closing function like this to save the closing arguments
    private void closeProgram(){
        Boolean wantToClose = ConfirmBox.display("Warning", "Do you want to close");
        if(wantToClose){
            System.out.println("Save all the stuff");
            window.close();
        }
    }

    //how we can handle user events
    //by implement and interface then writing out what we want said interface to do
    /*
    @Override
    public void handle(ActionEvent event){
        //getSource identifies which button was pressed
        if(event.getSource() == button){
            System.out.println("bob");
        }
    }
    */

}
