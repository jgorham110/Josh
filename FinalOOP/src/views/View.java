package views;

import controllers.AppController;
import lib.ConsoleIO;

public class View {
    public static final String Pink = "\033[0;35m";
    public static final String Red = "\033[0;31m";
    public static void run() {
        AppController.test1();
        int choice = -1;
        do{
            System.out.println(Pink + "Welcome to Pork, the popular console game about " + Red +"Pig cannibalism!");
            System.out.println(Pink + "Please make a selection on what mode you want to play.");
            System.out.println("\n");
            String[] modes = {"Piglet Mode", "(WIP) Piggy Mode", "(WIP) Boar Mode"};
            int choiceMode = ConsoleIO.promptForMenuSelection(modes, true);
            System.out.println("You have chosen " + (choiceMode == 0 ? "No Mode, Kevin is going after you now" : modes[choiceMode - 1]) + "!");
            if(choiceMode == 1){
                System.out.println("Welcome to Piglet Mode, the easiest of all Pig Modes.");
                System.out.println("\nLet us give a little back story. Your brother, Bacon, escaped your grasp in the last battle you both had and fled to an abandon looking building." +
                        "\n" + "Unfortunately, Bacon ran into the only door that can lock from behind! You did find an entrance to the building... on the opposite side!" + "\n" + "You " +
                        "are now inside the building, you look around and see that... " + Red + "There are bodies of animals handing from their backs!" + Pink + " You realize that " +
                        "you are in an abandoned " + Red + "BUTCHER SHOP!" + "\n" + Pink + "You also know that Bacon and you are not the only living things inside...");
            }else if(choiceMode == 2){
                System.out.println("Welcome to Piggy Mode, the medium-est of the Pig Modes.");
                System.out.println("This mode is not yet ready to be played. This was your mistake for picking this mode and now you shall face the consequences!");
            }else if(choiceMode == 3){
                System.out.println("Welcome to Boar Mode, the hardest Pig Mode of all the land!");
                System.out.println("This mode is not yet ready to be played. This was your mistake for picking this mode and now you shall face the consequences!");
            }
        }while(choice > 0);
        System.out.println("\nThe 'Game' has ended. But your life is now ready... Kevin is coming, you better run!");
    }
}
