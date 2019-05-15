package sample;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;

import java.util.LinkedList;
import java.util.Random;

public class MapControll {

    private static int TILE_SIZE_X = 19;
    private static int TILE_SIZE_Y = 20;

    //hard
    private static int TILE_START_POINT_Y_MIN_HARD = 8;
    private static int TILE_START_POINT_Y_MAX_HARD = 11;
    private int tileStartPointHard = randomBetween(TILE_START_POINT_Y_MIN_HARD, TILE_START_POINT_Y_MAX_HARD);


    LinkedList<Tile> tileList;

    boolean mapEmpty = true;


    public MapControll() {
        tileList = new LinkedList<>();
    }

    void drawMap(Pane root) {
        int idtemp = 0;
        if (mapEmpty) {
            for (int j = 0; j < 20; j++) { //dodawanie kafelka
                for (int i = 0; i < 20; i++) {
                    tileList.add(new Tile((i * TILE_SIZE_X) + 220, j * TILE_SIZE_Y, TILE_SIZE_X, TILE_SIZE_Y, i, j, idtemp));
                    root.getChildren().add(tileList.get(idtemp).tileRec);
                    idtemp++;
                }
            }
            mapEmpty = false;
        }
    }

    void drawRoad(int gameDifficultyLevel) {
        if (gameDifficultyLevel == 0) {
            //do zrobienia pozniej
        }

        if (gameDifficultyLevel == 1) {
            //do zrobienia pozniej
        }

        if (gameDifficultyLevel == 2) {

            for (Tile tile : tileList) {
                if (tile.idY == tileStartPointHard) {
                    tile.tileChangeType("ROAD");
                }
            }

        }

    }


//    void drawRoad(int gameDifficultyLevel) {
//
//        switch (gameDifficultyLevel) {
//            case 1: {
//                System.out.println("Latwo");
//                int idStart = 666;
//                int idstop = 666;
//
//                int randYStart = randomBetween(1, 18);
//                int randYStop = randomBetween(1, 18);
//
//                boolean foundStart = false;
//                boolean foundStop = false;
//
//                for (Tile tile : tileList) {
//                    if (tile.idX == 0 && tile.idY == randYStart) {
//                        tile.type = 1;
//                        tile.tileRec.setFill(Color.RED);
//                        idStart = tile.id;
//                        foundStart = true;
//                    }
//                    if (tile.idX == 19 && tile.idY == randYStop) {
//                        tile.tileRec.setFill(Color.RED);
//                        tile.type = 1;
//                        idstop = tile.id;
//                        foundStop = true;
//                    }
//                    if (foundStart && foundStop) {
//                        break;
//                    }
//                }
//
//                for (Tile tile : tileList) {
//
//
//                }
//
//                System.out.println("idStart = " + idStart);
//                System.out.println("idstop = " + idstop);
//                break;
//            }
//
//            case 2: {
//                System.out.println("Srednio");
//                break;
//            }
//
//            case 3: {
//                System.out.println("Trudno");
//                int idStart = 666;
//                int idstop = 666;
//
//                int randYStart = randomBetween(1, 1); //LOSOWANIE pozycji startowej
//                int randYStop = randomBetween(1, 1); //LOSOWANIE pozycji koncowej
//
//                boolean foundStart = false;
//                boolean foundStop = false;
//
//                for (Tile tile : tileList) {
//                    if (tile.idX == 0 && tile.idY == randYStart) {
//                        tile.type = 1;
//                        tile.tileRec.setFill(Color.RED);
//                        idStart = tile.id;
//                        foundStart = true;
//                    }
//                    if (tile.idX == 19 && tile.idY == randYStop) {
//                        tile.tileRec.setFill(Color.RED);
//                        tile.type = 1;
//                        idstop = tile.id;
//                        foundStop = true;
//                    }
//                    if (foundStart && foundStop) {
//                        break;
//                    }
//                }
//
//                int tempY = tileList.get(idStart).idY;
//                int half = randomBetween(10, 10);  //LOSOWANIE gdzie jest srodek
//
//                for (int i = 0; i < half; i++) {   //Krok 1, wyznaczanie drogi do polowy
//                    for (Tile tile : tileList) {
//                        if (tile.idY == tempY && tile.idX < half) {
//                            tile.tileRec.setFill(Color.LIGHTGRAY);
//                            tile.type = 1;
//                        }
//                    }
//                }
//                int tempXStart = tileList.get(idStart).idX;
//                int tempXStop = tileList.get(idstop).idX;
//                int tempXDistance = Math.abs(tempXStart - tempXStop);
//
//
//
//                if (tileList.get(idStart).idY == tileList.get(idstop).idY) {   //Krok 2 wyznaczanie drogi miedzy drogami
//                    for (Tile tile : tileList) {
//                        if (tile.idY == tileList.get(idStart).idY) {
//                            tile.tileRec.setFill(Color.LIGHTGRAY);
//                            tile.type = 1;
//                        }
//                    }
//                }
//                if (tempXStart > tempXStop) {
//
//                }
//                if (tempXStart > tempXStop) {
//
//                }
//
//
//                tempY = tileList.get(idstop).idY;
//                for (int i = 0; i < (20 - half); i++) {   //Krok 3, wyznaczanie drogi do celu koncowego
//                    for (Tile tile : tileList) {
//                        if (tile.idY == tempY && tile.idX > half) {
//                            tile.tileRec.setFill(Color.LIGHTGRAY);
//                            tile.type = 1;
//                        }
//                    }
//                }
//
//                System.out.println("idStart = " + idStart);
//                System.out.println("idstop = " + idstop);
//                break;
//            }
//
//            default: {
//                System.out.println("Nie udalo sie wczytac poziomu trudnosci!");
//                break;
//            }
//        }
//    }

    static int randomBetween(int start, int end) {
        Random random = new Random();
        int a1 = random.nextInt(end - start + 1);
        int a2 = a1 + start;
        return a2;
    }

}

