package sample;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 * Created by Tyler on 5/1/2018.
    for reusability it's better to create classes of alerts
 */
public class Alertbox {

    public  static void display(String title, String message){
        Stage winodw = new Stage();

        //these sets how the model will behave
        //this current setting prevents you from interacting with other windows
        //unitl you finish with this one
        winodw.initModality(Modality.APPLICATION_MODAL);
        winodw.setTitle(title);
        winodw.setMinWidth(250);

        Label label = new Label(message);
        Button close = new Button("Close");
        close.setOnAction(e->winodw.close());

        //always need a  layout to add to a window
        VBox stage = new VBox(25);

        //add children to stage and center window
        stage.getChildren().addAll(label, close);
        stage.setAlignment(Pos.CENTER);

        Scene scene = new Scene(stage);

        //add scene to this window and add special functionality
        //prevents you from returning to other window without closing
        winodw.setScene(scene);
        winodw.showAndWait();


    }










}
