package sample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Created by Tyler on 5/3/2018.
 */
public class StageTemplate extends Application{
    Stage stage;

    public static void main(String argc[]){
        launch(argc);
    }

    @Override
    public void start(Stage primaryStage){
        stage = primaryStage;
        stage.setTitle("Whatever");

        //closing arguments
        //Scene mainScene = new Scene(xxxxxxxxxxxxxxx, 800, 600);
        //stage.setScene(mainScene);
        stage.show();
    }
}
