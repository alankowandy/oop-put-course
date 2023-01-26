package GameClasses.Branches;

import GameClasses.GameMechanics;

public class StartingScreen {
    
    public static void firstMessage() throws InterruptedException {
        GameMechanics.slowPrint(10, "|||||||||||||||||||||||||||||||||||||||||||||||||||||||\n");
        GameMechanics.slowPrint(10, "|||||||||||||||||||LET'S PLAY A GAME|||||||||||||||||||\n");
        GameMechanics.slowPrint(10, "|||||||||||||||||||||||||||||||||||||||||||||||||||||||\n");
        System.out.print("\nPress \"ENTER\" to begin ");
        GameMechanics.promptEnterKey();
        GameMechanics.slowPrint(200,"\n...");
        System.out.println("\n------------------------------------------------------------------\n");
        GameMechanics.slowPrint(30,"\nPlease state your name.\n");
        System.out.print("> ");
        GameMechanics.playerName = GameMechanics.playerInput.next();
        GameMechanics.slowPrint(35,"\nWelcome " + GameMechanics.playerName + ".\n");
        GameMechanics.slowPrint(30,"\nLet's get some things straight.\n");
        GameMechanics.slowPrint(30,"\n->\n");
        GameMechanics.slowPrint(30,"\nSee that arrow above?\n");
        GameMechanics.pause(2000);
        GameMechanics.slowPrint(30,"\nIt indicates that you should press \"ENTER\" to continue with the story. We don't want to get overwhelmed with text, right?\n");
        GameMechanics.pause(4000);
        GameMechanics.slowPrint(30,"\nLet's see if you can do it.\n");
        GameMechanics.promptEnterKey();
        GameMechanics.slowPrint(250,"\nBravo!\n");
        GameMechanics.pause(1250);
        GameMechanics.slowPrint(30,"\nIt's worth pointing out that there's no option to save your progress, so you need to complete it all in one sitting, unless you want to start from the beginning.\n");
        GameMechanics.promptEnterKey();
        GameMechanics.slowPrint(30,"\nWhy you ask?\n");
        GameMechanics.pause(1500);
        GameMechanics.slowPrint(30,"\nThe author of this game run out of time\n");
        GameMechanics.pause(1000);
        GameMechanics.slowPrint(500,";(\n");
        GameMechanics.slowPrint(30,"\nNo worries though, the game isn't long.\n");
        GameMechanics.pause(1000);
        GameMechanics.slowPrint(30,"\nOne last thing.\n");
        GameMechanics.pause(2000);
        GameMechanics.slowPrint(30,"\nYou will be presented with multiple options to choose and in order to proceed you just need to enter the number of an option.\n");
        GameMechanics.promptEnterKey();
        GameMechanics.slowPrint(30,"\nSimple as that.\n");
        GameMechanics.pause(1000);
        GameMechanics.slowPrint(40,"\nNow get ready for the story.\n");
        GameMechanics.promptEnterKey();
        GameMechanics.slowPrint(200,"\n...");
    }
}
