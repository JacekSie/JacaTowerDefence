package game;

import config.Controls;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Tower {
    int id;

    int x;
    int y;

    int lvl;
    String name;
    int type;

    int attack;
    int range;
    int speed;
    int money;

    Image image = new Image("images/towers/test.png", Controls.TILE_SIZE_X,Controls.TILE_SIZE_Y,false,false);
    ImageView imageView;

    Tower() {


    }


}
