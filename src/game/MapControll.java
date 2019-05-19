package game;

import config.Controls;
import config.Player;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import scenes.SceneMenager;

import java.util.LinkedList;
import java.util.Random;

public class MapControll {

    //hard
    private static int TILE_START_POINT_Y_MIN_HARD = 2;
    private static int TILE_START_POINT_Y_MAX_HARD = 14;
    private int tileStartPointHard = randomBetween(TILE_START_POINT_Y_MIN_HARD, TILE_START_POINT_Y_MAX_HARD);

    private Image imgBuyTower = new Image("images/buttons/sceneGameImg/buttonBuyTower.png");
    private Image imgBuyTowerMouseOn = new Image("images/buttons/sceneGameImg/buttonBuyTowerMouseOn.png");
    private ImageView imageVBuyTower;

    private Image imgNextWave = new Image("images/buttons/sceneGameImg/buttonNextWave.png");
    private Image imgNextWaveMouseOn = new Image("images/buttons/sceneGameImg/buttonNextWaveMouseOn.png");
    private ImageView imageVNextWave;

    private Image imgMenu = new Image("images/buttons/sceneGameImg/buttonMenu.png");
    private Image imgMenuMouseOn = new Image("images/buttons/sceneGameImg/buttonMenuMouseOn.png");
    private ImageView imageVMenu;

    Pane root;
    Player player;
    SceneMenager sceneMenager;


    LinkedList<Tile> tileList;
    LinkedList<Tower> towerList;
    LinkedList<Enemy> enemyList;

    int idtemp = 0;


    private boolean mapEmpty = true;


    public MapControll() {
        tileList = new LinkedList<>();
        towerList = new LinkedList<>();
        enemyList = new LinkedList<>();
    }

    public void createMap(Pane root, Player player, SceneMenager sceneMenager) {
        this.root = root;
        this.player = player;
        this.sceneMenager = sceneMenager;

        drawStats();
        drawControls(root, sceneMenager);
        drawMap(root);
        drawRoad(player);

    }


    public void resetMap(Pane root, Player player) {
        tileStartPointHard = randomBetween(TILE_START_POINT_Y_MIN_HARD, TILE_START_POINT_Y_MAX_HARD);
        this.root = root;
        root.getChildren().removeAll();
        for (Tile tile : tileList) {
            this.root.getChildren().remove(tile);
        }
        tileList.clear();
        idtemp = 0;
        mapEmpty = true;
        drawMap(root);
        drawRoad(player);


    }


    private void drawMap(Pane root) {
        idtemp = 0;
        if (mapEmpty) {
            for (int j = 0; j < Controls.TILE_AMOUNT_Y; j++) { //dodawanie kafelka
                for (int i = 0; i < Controls.TILE_AMOUNT_X; i++) {
                    tileList.add(new Tile((i * Controls.TILE_SIZE_X) + Controls.MENU_SIZE_X, j * Controls.TILE_SIZE_Y, Controls.TILE_SIZE_X, Controls.TILE_SIZE_Y, i, j, idtemp));
                    root.getChildren().add(tileList.get(idtemp).tileRec);
                    idtemp++;
                }
            }
            mapEmpty = false;
        }
    }

    private void drawRoad(Player player) {
        if (player.gameDifficultyLevel == 0) {
            //do zrobienia pozniej
        }

        if (player.gameDifficultyLevel == 1) {
            //do zrobienia pozniej
        }

        if (player.gameDifficultyLevel == 2) {

            for (Tile tile : tileList) {
                if (tile.idY == tileStartPointHard) {
                    tile.tileChangeType("ROAD");
                }
            }

        }

    }

    private void drawStats() {


    }

    private void drawControls(Pane root, SceneMenager sceneMenager) {

        imageVBuyTower = new ImageView(imgBuyTower);
        imageVBuyTower.setX((Controls.MENU_SIZE_X / 2) - imageVBuyTower.getLayoutBounds().getCenterX());
        imageVBuyTower.setY(320);
        root.getChildren().addAll(imageVBuyTower);

        imageVBuyTower.setOnMouseClicked(e -> {
            BuyTowerWindow buyTowerWindow = new BuyTowerWindow();
            buyTowerWindow.display(sceneMenager);
        });
        imageVBuyTower.setOnMouseMoved(e -> {
            imageVBuyTower.setImage(imgBuyTowerMouseOn);
        });
        imageVBuyTower.setOnMouseExited(e -> {
            imageVBuyTower.setImage(imgBuyTower);
        });


        imageVNextWave = new ImageView(imgNextWave);
        imageVNextWave.setX((Controls.MENU_SIZE_X / 2) - imageVNextWave.getLayoutBounds().getCenterX());
        imageVNextWave.setY(400);
        root.getChildren().addAll(imageVNextWave);
        imageVNextWave.setOnMouseClicked(e -> {

        });
        imageVNextWave.setOnMouseMoved(e -> {
            imageVNextWave.setImage(imgNextWaveMouseOn);
        });
        imageVNextWave.setOnMouseExited(e -> {
            imageVNextWave.setImage(imgNextWave);
        });


        imageVMenu = new ImageView(imgMenu);
        imageVMenu.setX((Controls.MENU_SIZE_X / 2) - imageVMenu.getLayoutBounds().getCenterX() + 20);
        imageVMenu.setY(480);
        root.getChildren().addAll(imageVMenu);
        imageVMenu.setOnMouseClicked(e -> {
            sceneMenager.setSceneMenu();
        });
        imageVMenu.setOnMouseMoved(e -> {
            imageVMenu.setImage(imgMenuMouseOn);
        });
        imageVMenu.setOnMouseExited(e -> {
            imageVMenu.setImage(imgMenu);
        });

    }


    private static int randomBetween(int start, int end) {
        Random random = new Random();
        int a1 = random.nextInt(end - start + 1);
        int a2 = a1 + start;
        return a2;
    }

}

