package core;

public class title_screen {
    
    public void first_screen() {
        System.out.println("\n------------------------------------------------------------------\n");
        System.out.print("Please enter your name: ");
        game.player_name = game.choiceScanner.next();
        System.out.println("Welcome to the Adventure " + game.player_name + "!");
        game.firstpromptEnterKey();
        System.out.println("\n------------------------------------------------------------------\n");
        System.out.println("You find yourself at the edge of the cliff, your vehicle wrecked on the tree just a few meters away, and a police slowly surrounding you.");
        game.promptEnterKey();
        System.out.println("You think to yourself: \"How did it come to this?\", \"Where was my mistake?\".");
        game.promptEnterKey();
        System.out.println("Adrenaline is pumping through your veins, \"...like an animal in the cage\", \"I have to find a solution\", and so you start going through everything that happened, hoping that you\'ll find something that would help you.");
        game.promptEnterKey();
        System.out.println("\"It all started at that stupid carwash...\" ");
        game.promptEnterKey();
    }
}
