package sample;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * Created by Tyler on 5/3/2018.
 * testing how to extract and validate input
 */
public class Main5 extends Application{
    //globabl window for easy reference
    private Stage stage;

    public static void main(String args[]){
        launch(args);
    }

    @Override
    public void start(Stage primaryStage){
        stage = primaryStage;
        stage.setTitle("Input/Extract");

        //input
        TextField nameInput = new TextField();
        Button enter = new Button("Input");

        //extract from input via button
        enter.setOnAction(e->{
            //want to validate info
            validInt(nameInput, nameInput.getText());
            //this just grabs the text
            System.out.println(nameInput.getText());
        });

        //layout
        VBox layout = new VBox(10);
        layout.setPadding(new Insets(20, 20, 20, 20));
        layout.getChildren().addAll(nameInput, enter);


        //closing
        Scene mainScene = new Scene(layout, 800, 600);
        stage.setScene(mainScene);
        stage.show();
    }

    //methods to validate input
    private boolean validInt(TextField input, String message){
        try{
            int age = Integer.parseInt(message);
            input.setStyle("fx-control-inner-background: white");
            System.out.println("User is age");
            return true;

        }catch (NumberFormatException e){
            input.setStyle("-fx-control-inner-background: Red");
            System.out.print("Bad data" + message +"is not a number");
            return false;
        }

    }

}
