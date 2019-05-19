package scenes;

import config.Controls;
import config.Player;
import game.MapControll;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;


class SceneGame {

    Scene sceneMainGame;
    SceneMenager sceneMenager;

    Player player;

    Pane root;

    private Image imgLeftMenu = new Image("images/leftMenu.png",Controls.MENU_SIZE_X, Controls.WINDOW_SIZE_Y, false, false);
    private ImageView imageVLeftMenu;


    SceneGame(Player player, SceneMenager sceneMenager) {
        this.sceneMenager = sceneMenager;
        this.player = player;
        root = new Pane();

        imageVLeftMenu = new ImageView(imgLeftMenu);

        sceneMainGame = new Scene(root, Controls.WINDOW_SIZE_X, Controls.WINDOW_SIZE_Y);


        player.gameDifficultyLevel = 2;
        MapControll mapControll = new MapControll();



        root.getChildren().addAll(imageVLeftMenu);

        mapControll.createMap(root,player,sceneMenager);


    }


}
