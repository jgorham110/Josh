package models;

import java.util.Random;

public class Butcher {
    public static int currentPosition(int totalPositions) {
        Random rng = new Random();
        int position = rng.nextInt(totalPositions);
        return position;
    }
    public static boolean currentState(){
        boolean isAlive = true;
        return isAlive;
    }
}
