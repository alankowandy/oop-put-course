package core;

public class title_screen {
    
    public void first_screen() {
        System.out.println("\n------------------------------------------------------------------\n");
        System.out.print("Ok, before we start let's get some things straight kiddo. ");
        System.out.println("Please state your name.");
        System.out.print("> ");
        game.player_name = game.plrinput.next();
        System.out.println("\n------------------------------------------------------------------\n");
        System.out.println("Welcome " + game.player_name + ".");
        System.out.println("Get ready for the adventure.");
        System.out.print("\nPress \"ENTER\" to continue when you see the arrow: ");
        game.promptEnterKey();
    }
}
