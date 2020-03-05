package views;

import models.CrunchyTime;

public class View {
    public static final String Pink = "\033[0;35m";
    public static final String Red = "\033[0;31m";

    public static void run() {
        CrunchyTime.time(1200);
    }
}
