package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 * Created by Tyler on 5/3/2018.
 */
public class ConfirmBox {

    static boolean answer;


    public static boolean display(String title, String message) {
        //window set up
        Stage winodw = new Stage();
        winodw.initModality(Modality.APPLICATION_MODAL);
        winodw.setTitle(title);
        winodw.setMinWidth(250);

        Label label = new Label(message);

        //boolean buttons
        Button yesButton = new Button("Yes");
        Button noButton = new Button("No");

        //what happens when pressed
        yesButton.setOnAction(e-> {
            answer = true;
            winodw.close();
        });
        noButton.setOnAction(e-> {
            answer = false;
            winodw.close();
        });


        VBox stage = new VBox(25);

        //add children to stage and center window
        stage.getChildren().addAll(label, yesButton, noButton);
        stage.setAlignment(Pos.CENTER);

        Scene scene = new Scene(stage);

        //add scene to this window and add special functionality
        //prevents you from returning to other window without closing
        winodw.setScene(scene);
        winodw.showAndWait();

        return answer;
    }
}

