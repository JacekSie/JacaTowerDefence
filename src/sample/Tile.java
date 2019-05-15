package sample;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

import java.util.Random;

public class Tile {
    public Rectangle tileRec;
    private Color color; //pobawie sie potem w laczenie kolorow

    String[] typeNames; //EMPTY, ROAD, BUILDING,
    int type;

    int id; //id kafelka na liscie (nie wiem, czy potrzebne)

    private int x; //okresla polozenie kafelka w pixelach
    private int y;

    private int sizeX;  //rozmiar kafelka w pixelach
    private int sizeY;

    int idX; //okresla, ktory to kafelek w polozeniu x i y
    int idY;


    Tile(int x, int y, int sizeX, int sizeY, int idX, int idY, int id) {
        this.id = id;

        this.x = x;
        this.y = y;

        this.idX = idX;
        this.idY = idY;

        typeNames = new String[]{"EMPTY", "ROAD", "BULDING"};
        type = 0;

        this.sizeX = sizeX;
        this.sizeY = sizeY;

        tileRec = new Rectangle(x, y, sizeX, sizeY);
        tileChangeType("EMPTY");
    }

    void tileChangeType(String typeTmp ){
        if(typeTmp == "EMPTY"){
            type = 0;
            tileRec.setFill(Color.rgb(randomBetween(20, 30), randomBetween(150, 170), randomBetween(20, 30)));  //losuje kolor kafelka
        }

        if(typeTmp == "ROAD"){
            int tmpColor = randomBetween(170, 190);

            type = 1;
            tileRec.setFill(Color.rgb(tmpColor,tmpColor,tmpColor));  //losuje kolor kafelka
        }

    }


    private static int randomBetween(int start, int end) {
        Random random = new Random();
        int a1 = random.nextInt(end - start + 1);
        int a2 = a1 + start;
        return a2;
    }

}
