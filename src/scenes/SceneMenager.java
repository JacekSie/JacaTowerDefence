package scenes;

import config.Player;
import game.MapControll;
import javafx.stage.Stage;

public class SceneMenager {

    public Stage mainStage;

    SceneGame sceneGame;
    SceneMenu sceneMenu;

    Player player;

    MapControll mapControll;
    boolean isMapCreated = false;

    public SceneMenager(){

    }

    public void createScenes(Stage mainStage, Player player, SceneMenager sceneMenager){
        this.player = player;
        this.mainStage = mainStage;
        this.mapControll = new MapControll();
        sceneGame = new SceneGame(player, sceneMenager);
        sceneMenu = new SceneMenu( sceneMenager);

        sceneMenu.loadImages();

    }

    public void setSceneGame(){
        mainStage.setScene(sceneGame.sceneMainGame);

    }

    public void setSceneGameNewMap(){
        mapControll.resetMap(sceneGame.root, player);
        mainStage.setScene(sceneGame.sceneMainGame);

    }

    public void setSceneMenu(){
        mainStage.setScene(sceneMenu.sceneMenu);

    }

}
