package scenes;

import config.Player;
import javafx.stage.Stage;

public class SceneMenager {

    SceneGame sceneGame;
    SceneMenu sceneMenu;

    public SceneMenager(){

    }

    public void createScenes(Stage mainStage, Player player, SceneMenager sceneMenager){
        sceneGame = new SceneGame(mainStage,player, sceneMenager);
        sceneMenu = new SceneMenu(mainStage, sceneMenager);
    }

    public void setSceneGame(Stage mainStage){
        mainStage.setScene(sceneGame.sceneMainGame);

    }

    public void setSceneMenu(Stage mainStage){
        mainStage.setScene(sceneMenu.sceneMenu);

    }

}
