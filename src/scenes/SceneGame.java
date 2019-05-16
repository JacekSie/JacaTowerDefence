package scenes;

import config.Controls;
import config.Player;
import game.MapControll;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;


class SceneGame {

    Scene sceneMainGame;
    SceneMenager sceneMenager;

    Player player;


    SceneGame(Stage primaryStage, Player player, SceneMenager sceneMenager) {
        this.sceneMenager = sceneMenager;
        this.player = player;
        Pane root = new Pane();

        sceneMainGame = new Scene(root, Controls.WINDOW_SIZE_X, Controls.WINDOW_SIZE_Y);


        player.gameDifficultyLevel = 2;
        MapControll mapControll = new MapControll();


        mapControll.createMap(root,player);


    }

    public void setSceneMainGame(Stage primaryStage){

        primaryStage.setScene(sceneMainGame);
    }

}
