package sample;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * Created by Tyler on 5/3/2018.
 * Demo of how check boxes work
 */
public class Main6 extends Application {
    //globabl window for easy reference
    private Stage stage;

    public static void main(String args[]){
        launch(args);
    }

    @Override
    public void start(Stage primaryStage){
        stage = primaryStage;
        stage.setTitle("Checkbox");

        //items in view
        Button order = new Button("Order now");
        CheckBox boxes[] = {
                new CheckBox("Bacon"),
                new CheckBox("Peppers"),
                new CheckBox("Turkey"),
                new CheckBox("Cheese")
        };

        //grabbing info when we click
        order.setOnAction(e-> handleOption(boxes));


        //setting properties of boxes
        boxes[1].setSelected(true);


        //layout and adding
        VBox list = new VBox(10);
        list.setPadding(new Insets(20,20,20,20));

        //adding to list
        for(CheckBox bx : boxes){
            list.getChildren().add(bx);
        }
        list.getChildren().addAll(order);



        //closing
        Scene mainScene = new Scene(list, 800, 600);
        stage.setScene(mainScene);
        stage.show();
    }

    private void handleOption(CheckBox optionsp[]){
        for(CheckBox bx : optionsp){
            if (bx.isSelected())
                System.out.println(bx.getText());
        }
        System.out.print("\n");
    }



}
