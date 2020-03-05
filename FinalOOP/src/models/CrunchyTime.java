package models;

import java.util.TimerTask;
import java.util.Timer;

public class CrunchyTime {
    Timer timer;

    public static void time(int playTime){
        System.out.println("You have " + (playTime / 60) + " minutes to kill Bacon before he escapes.");
        new CrunchyTime(playTime);
    }
    public CrunchyTime(int seconds){
        Timer timer = new Timer();
        timer.schedule(new NextTask(), seconds * 1000);
    }
    class NextTask extends TimerTask{
        @Override
        public void run(){
            System.out.println("Time is up!");
            try {
                timer.cancel();
            }catch (NullPointerException npe){
                System.out.println("Bacon Escaped!");
            }
        }
    }
}
