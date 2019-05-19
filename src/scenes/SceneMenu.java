package scenes;

import config.Controls;
import config.Player;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;



public class SceneMenu {

    SceneMenager sceneMenager;

    Player player;

    Pane root;

    boolean isSceneMenuOpened;

    Scene sceneMenu;

    private Image imgBackground = new Image("images/Background.png",Controls.WINDOW_SIZE_X, Controls.WINDOW_SIZE_Y, false, false);
    private ImageView imageVBackground;

    private Image imgStartGame = new Image("images/buttons/sceneMenuImg/buttonStartGame.png");
    private Image imgStartGameMouseOn = new Image("images/buttons/sceneMenuImg/buttonStartGameMouseOn.png");
    private ImageView imageVStartGame;

    private Image imgExit = new Image("images/buttons/sceneMenuImg/buttonExit.png");
    private Image imgExitMouseOn = new Image("images/buttons/sceneMenuImg/buttonExitMouseOn.png");
    private ImageView imageVExit;


    SceneMenu( SceneMenager sceneMenager) {
        this.sceneMenager = sceneMenager;

        root = new Pane();

        sceneMenu = new Scene(root, Controls.WINDOW_SIZE_X, Controls.WINDOW_SIZE_Y);

        System.out.println("Jestem!");

        loadImages();


    }



    void loadImages(){

        imageVBackground = new ImageView(imgBackground);

        imageVStartGame = new ImageView(imgStartGame);
        imageVStartGame.setX((Controls.WINDOW_SIZE_X/2) - imageVStartGame.getLayoutBounds().getCenterX());
        imageVStartGame.setY(280);

        imageVStartGame.setOnMouseClicked(e->{
            if (!sceneMenager.isMapCreated){
                sceneMenager.isMapCreated = true;
                sceneMenager.setSceneGame();
            }else{
                sceneMenager.setSceneGameNewMap();
            }
        });
        imageVStartGame.setOnMouseMoved(e->{
            imageVStartGame.setImage(imgStartGameMouseOn);
        });
        imageVStartGame.setOnMouseExited(e->{
            imageVStartGame.setImage(imgStartGame);
        });



        imageVExit = new ImageView(imgExit);
        imageVExit.setX((Controls.WINDOW_SIZE_X/2) - imageVExit.getLayoutBounds().getCenterX());
        imageVExit.setY(350);
        imageVExit.setOnMouseClicked(e->{
            sceneMenager.mainStage.close();
        });
        imageVExit.setOnMouseMoved(e->{
            imageVExit.setImage(imgExitMouseOn);
        });
        imageVExit.setOnMouseExited(e->{
            imageVExit.setImage(imgExit);
        });



        root.getChildren().addAll(imageVBackground,imageVStartGame, imageVExit);

    }


}
