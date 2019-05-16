package scenes;

import config.Controls;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;


public class SceneMenu {

    SceneMenager sceneMenager;


    Scene sceneMenu;

    private Image backgroundImg = new Image("images/Background.png");
    private ImageView imageBackground;


    SceneMenu(Stage primaryStage, SceneMenager sceneMenager) {
        this.sceneMenager = sceneMenager;

        Pane root = new Pane();

        imageBackground = new ImageView(backgroundImg);


        sceneMenu = new Scene(root, Controls.WINDOW_SIZE_X, Controls.WINDOW_SIZE_Y);

        root.getChildren().add(imageBackground);

    }



}
