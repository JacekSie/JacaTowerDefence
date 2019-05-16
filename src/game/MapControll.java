package game;

import config.Controls;
import config.Player;
import javafx.scene.layout.Pane;

import java.util.LinkedList;
import java.util.Random;

public class MapControll {

    //hard
    private static int TILE_START_POINT_Y_MIN_HARD = 8;
    private static int TILE_START_POINT_Y_MAX_HARD = 11;
    private int tileStartPointHard = randomBetween(TILE_START_POINT_Y_MIN_HARD, TILE_START_POINT_Y_MAX_HARD);


    LinkedList<Tile> tileList;

    private boolean mapEmpty = true;


    public MapControll() {
        tileList = new LinkedList<>();
    }

    public void createMap(Pane root, Player player){
        drawMap(root);
        drawRoad(player);

    }


    void drawMap(Pane root) {



        int idtemp = 0;
        if (mapEmpty) {
            for (int j = 0; j < 30; j++) { //dodawanie kafelka
                for (int i = 0; i < 40; i++) {
                    tileList.add(new Tile((i * Controls.TILE_SIZE_X), j * Controls.TILE_SIZE_Y, Controls.TILE_SIZE_X, Controls.TILE_SIZE_Y, i, j, idtemp));
                    root.getChildren().add(tileList.get(idtemp).tileRec);
                    idtemp++;
                }
            }
            mapEmpty = false;
        }
    }

    void drawRoad(Player player) {
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


    private static int randomBetween(int start, int end) {
        Random random = new Random();
        int a1 = random.nextInt(end - start + 1);
        int a2 = a1 + start;
        return a2;
    }

}

