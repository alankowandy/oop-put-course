package Core;

public class StartingScreen {
    
    public void first_screen() throws InterruptedException {
        //Game.SlowPrint("Printing test. Look!!!");
        Game.SlowPrint(10, "|||||||||||||||||||||||||||||||||||||||||||||||||||\n");
        Game.SlowPrint(10, "|||||||||||||||||||THE ADVENTURE|||||||||||||||||||\n");
        Game.SlowPrint(10, "|||||||||||||||||||||||||||||||||||||||||||||||||||\n");
        System.out.print("\nPress \"ENTER\" to begin ");
        Game.promptEnterKey();
        Game.SlowPrint(200,"\n...");
        System.out.println("\n------------------------------------------------------------------\n");
        Game.SlowPrint(30,"Ok, before we start let's get some things straight kiddo.\n");
        Game.SlowPrint(30,"\nPlease state your name.\n");
        System.out.print("> ");
        Game.player_name = Game.plrinput.next();
        Game.SlowPrint(30,"\nWelcome " + Game.player_name + ".\n");
        Game.SlowPrint(30,"\nGet ready for the adventure.\n");
        System.out.print("\nPress \"ENTER\" to continue when you see the arrow: ");
        Game.promptEnterKey();
    }
}
