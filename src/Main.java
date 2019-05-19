import config.Controls;
import config.Player;
import javafx.application.Application;
import javafx.stage.Stage;
import scenes.SceneMenager;

public class Main extends Application {


    @Override
    public void start(Stage primaryStage) throws Exception{
        primaryStage.setTitle("Jaca Tower Defence");
        primaryStage.setResizable(false);
        primaryStage.show();

        //
        //To wszystko dla ulatwienia zmian i dodania pozniejszych menu.
        //
        Player player = new Player();
        player.gameDifficultyLevel = 2;
        player.name = "Test";
        player.healthMax=50;
        player.healthCurrent = player.healthMax;
        player.money = 1000;

        SceneMenager sceneMenager = new SceneMenager();

        sceneMenager.createScenes(primaryStage, player, sceneMenager);

        sceneMenager.setSceneMenu();
        //
        //
        //


    }

    public static void main(String[] args) {
        launch(args);
    }
}
