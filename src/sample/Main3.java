package sample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * Created by Tyler on 5/3/2018.
 * this program shows how to create a layout with layouts inside of it
 */

//note to self don't use basic ones for layouts. Try experimenting with specially designed layouts
//to try and find the one that suites your needs.
public class Main3 extends Application {
    Stage window;
    public static void main(String args[]){
        launch(args);
    }

    @Override
    public void start(Stage primaryStage){
        window = primaryStage;
        window.setTitle("Layouts");

        //top layout
        HBox topMenu = new HBox();
        topMenu.setSpacing(20);

        //array of buttons to make my life easier
        Button buttonArr[] = {new Button("Anaconda"),new Button("Bottoms"), new Button("Cruel")};
        for (Button btns : buttonArr) {
            topMenu.getChildren().add(btns);
        }

        //side Layout
        VBox leftMenu = new VBox();
        leftMenu.setSpacing(20);

        //array of buttons to make my life easier
        Button buttonArr2[] = {new Button("Flying"),new Button("Trash"), new Button("Panda")};
        for (Button btns : buttonArr2) {
            leftMenu.getChildren().add(btns);
        }

        //combine the created ones into another layout
        BorderPane pane = new BorderPane();
        pane.setTop(topMenu);
        pane.setLeft(leftMenu);



        //sett
        Scene primaryScene = new Scene(pane, 800, 600);


        //displaying first scene
        window.setScene(primaryScene);
        window.show();
    }
}
