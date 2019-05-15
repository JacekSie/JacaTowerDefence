package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Main extends Application {

    int gameDifficultyLevel;

    MapControll mapControll;


    @Override
    public void start(Stage primaryStage) throws Exception{

        gameDifficultyLevel =2;

        mapControll = new MapControll();
        Pane root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        mapControll.drawMap(root);
        mapControll.drawRoad(gameDifficultyLevel);

        primaryStage.setTitle("Hello World");
        primaryStage.setResizable(false);
        primaryStage.setScene(new Scene(root));

        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
