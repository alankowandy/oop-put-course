package GameClasses.Branches;

import GameClasses.GameMechanics;

public final class StartingScreen {
    
    public static void firstMessage() throws InterruptedException {
        GameMechanics gameMechanics = new GameMechanics();
        gameMechanics.slowPrint(10, "|||||||||||||||||||||||||||||||||||||||||||||||||||||||\n");
        gameMechanics.slowPrint(10, "|||||||||||||||||||LET'S PLAY A GAME|||||||||||||||||||\n");
        gameMechanics.slowPrint(10, "|||||||||||||||||||||||||||||||||||||||||||||||||||||||\n");
        System.out.print("\nPress \"ENTER\" to begin ");
        gameMechanics.promptEnterKey();
        gameMechanics.slowPrint(200,"\n...");
        System.out.println("\n------------------------------------------------------------------\n");
        gameMechanics.slowPrint(30,"\nPlease state your name.\n");
        System.out.print("> ");
        gameMechanics.playerName = gameMechanics.playerInput.next();
        gameMechanics.slowPrint(35,"\nWelcome " + gameMechanics.playerName + ".\n");
        gameMechanics.slowPrint(30,"\nLet's get some things straight.\n");
        gameMechanics.slowPrint(30,"\n->\n");
        gameMechanics.slowPrint(30,"\nSee that arrow above?\n");
        gameMechanics.pause(2000);
        gameMechanics.slowPrint(30,"\nIt indicates that you should press \"ENTER\" to continue with the story. We don't want to get overwhelmed with text, right?\n");
        gameMechanics.pause(4000);
        gameMechanics.slowPrint(30,"\nLet's see if you can do it.\n");
        gameMechanics.promptEnterKey();
        gameMechanics.slowPrint(250,"\nBravo!\n");
        gameMechanics.pause(1250);
        gameMechanics.slowPrint(30,"\nIt's worth pointing out that there's no option to save your progress, so you need to complete it all in one sitting, unless you want to start from the beginning.\n");
        gameMechanics.promptEnterKey();
        gameMechanics.slowPrint(30,"\nWhy you ask?\n");
        gameMechanics.pause(1500);
        gameMechanics.slowPrint(30,"\nThe author of this game run out of time\n");
        gameMechanics.pause(1000);
        gameMechanics.slowPrint(500,";(\n");
        gameMechanics.slowPrint(30,"\nNo worries though, the game isn't long.\n");
        gameMechanics.pause(1000);
        gameMechanics.slowPrint(30,"\nOne last thing.\n");
        gameMechanics.pause(2000);
        gameMechanics.slowPrint(30,"\nYou will be presented with multiple options to choose and in order to proceed you just need to enter the number of an option.\n");
        gameMechanics.promptEnterKey();
        gameMechanics.slowPrint(30,"\nSimple as that.\n");
        gameMechanics.pause(1000);
        gameMechanics.slowPrint(40,"\nNow get ready for the story.\n");
        gameMechanics.promptEnterKey();
        gameMechanics.slowPrint(200,"\n...");
    }
}
