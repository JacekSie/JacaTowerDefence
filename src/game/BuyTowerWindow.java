package game;

import config.Controls;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import scenes.SceneMenager;

public class BuyTowerWindow {


    Stage buyTowerStage;
    Pane root;
    Scene scene;

    private Image imgBuyWindowScene = new Image("images/BuyWindowScene.png", Controls.BUY_TOWER_WINDOW_SIZE_X, Controls.BUY_TOWER_WINDOW_SIZE_Y, false, false);
    private ImageView imageVBuyWindowScene;

    private Image imgBuy = new Image("images/buttons/buyTowerWindowImg/buttonBuy.png");
    private Image imgBuyMouseOn = new Image("images/buttons/buyTowerWindowImg/buttonBuyMouseOn.png");
    private ImageView imageVBuy;

    private Image imgClose = new Image("images/buttons/buyTowerWindowImg/buttonClose.png");
    private Image imgCloseMouseOn = new Image("images/buttons/buyTowerWindowImg/buttonCloseMouseOn.png");
    private ImageView imageVClose;




    public void display(SceneMenager sceneMenager) {
        buyTowerStage = new Stage(StageStyle.TRANSPARENT);
        //buyTowerStage = new Stage();
        buyTowerStage.setTitle("Buy Tower");
        buyTowerStage.setResizable(false);
        buyTowerStage.initModality(Modality.APPLICATION_MODAL);

        root = new Pane();

        scene = new Scene(root);

        imageVBuyWindowScene = new ImageView(imgBuyWindowScene);

        root.getChildren().addAll(imageVBuyWindowScene);

        buyTowerStage.setScene(scene);


        addButtons();


        buyTowerStage.setX(sceneMenager.mainStage.getX() + (Controls.WINDOW_SIZE_X / 2) - (Controls.BUY_TOWER_WINDOW_SIZE_X / 2));
        buyTowerStage.setY(sceneMenager.mainStage.getY() + (Controls.WINDOW_SIZE_Y / 2) - (Controls.BUY_TOWER_WINDOW_SIZE_Y / 2));
        buyTowerStage.showAndWait();

    }

    private void addButtons(){

        imageVBuy = new ImageView(imgBuy);
        imageVBuy.setX((Controls.BUY_TOWER_WINDOW_SIZE_X/2) - imageVBuy.getLayoutBounds().getCenterX());
        imageVBuy.setY(Controls.BUY_TOWER_WINDOW_SIZE_Y - 110);
        root.getChildren().addAll(imageVBuy);

        imageVBuy.setOnMouseClicked(e->{

        });
        imageVBuy.setOnMouseMoved(e->{
            imageVBuy.setImage(imgBuyMouseOn);
        });
        imageVBuy.setOnMouseExited(e->{
            imageVBuy.setImage(imgBuy);
        });



        imageVClose = new ImageView(imgClose);
        imageVClose.setX((Controls.BUY_TOWER_WINDOW_SIZE_X/2) - imageVClose.getLayoutBounds().getCenterX());
        imageVClose.setY(Controls.BUY_TOWER_WINDOW_SIZE_Y - 55);
        root.getChildren().addAll(imageVClose);

        imageVClose.setOnMouseClicked(e->{
            buyTowerStage.close();
        });
        imageVClose.setOnMouseMoved(e->{
            imageVClose.setImage(imgCloseMouseOn);
        });
        imageVClose.setOnMouseExited(e->{
            imageVClose.setImage(imgClose);
        });

    }

}
