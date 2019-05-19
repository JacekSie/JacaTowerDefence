package config;

public class Controls {

    public static int WINDOW_SIZE_X = 1000;
    public static int WINDOW_SIZE_Y = 600;

    public static int BUY_TOWER_WINDOW_SIZE_X = 400;
    public static int BUY_TOWER_WINDOW_SIZE_Y = 250;

    public static int MENU_SIZE_X = 200;


//    public static int TILE_SIZE_X = 20;  //Opcja 1(po rozmiarze kafelkow)
//    public static int TILE_SIZE_Y = 20;
//    public static int TILE_AMOUNT_X = (WINDOW_SIZE_X - MENU_SIZE_X) / TILE_SIZE_X; //Opcja 1(po rozmiarze kafelkow)
//    public static int TILE_AMOUNT_Y = WINDOW_SIZE_Y / TILE_SIZE_Y;


    public static int TILE_AMOUNT_X = 20; //Opcja 2 (po ilosci kafelkow)
    public static int TILE_AMOUNT_Y = 15;
    public static int TILE_SIZE_X = (WINDOW_SIZE_X - MENU_SIZE_X) / TILE_AMOUNT_X;  //Opcja 2 (po ilosci kafelkow)
    public static int TILE_SIZE_Y = WINDOW_SIZE_Y / TILE_AMOUNT_Y;

    boolean isBuyTowerActive = false;


}
