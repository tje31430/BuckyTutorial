package sample;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * Created by Tyler on 5/3/2018.
 * exploring the wonderful world of drop down menus
 */
public class Main7 extends Application {
    Stage stage;

    public static void main(String argc[]){
        launch(argc);
    }

    @Override
    public void start(Stage primaryStage){
        stage = primaryStage;
        stage.setTitle("DropDown Menus");
        Button enter = new Button("Enter");

        //drop down menu, don't want to mix datatypes
        ChoiceBox<String> fruitList = new ChoiceBox<>();

        //getItems returns the observable list
        fruitList.getItems().addAll("Apples", "Bananas", "Cherries", "Dates");
        fruitList.setValue("Apples");

        //add listener
        //listerner has three parameters
        fruitList.getSelectionModel().selectedItemProperty().addListener( (v, oldValue, newValue)-> System.out.println(newValue));

        //enter.setOnAction(e->handleList(fruitList));

        //layout
        VBox layout = new VBox(10);
        layout.setPadding(new Insets(20, 20, 20, 20));
        layout.getChildren().addAll(fruitList, enter);

        //closing arguments
        Scene mainScene = new Scene(layout, 400, 300);
        stage.setScene(mainScene);
        stage.show();
    }

    //handler
    /*
    private void handleList(ChoiceBox<String> list){
        String food = list.getValue();
        System.out.println(food);
    }
    */
}
