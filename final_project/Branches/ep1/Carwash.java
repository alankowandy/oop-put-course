package Branches.ep1;

import Branches.Details;
import Core.Game;

class carwash_details implements Details {
    @Override
    public Details location(String place) {
        System.out.println("Current location: " + place);
        return null;
    }

    @Override
    public Details inventory() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Details stamina() {
        // TODO Auto-generated method stub
        return null;
    }   
}

public class Carwash {
    public static void first() {
        Details details = new carwash_details();
        System.out.println("\n------------------------------------------------------------------\n");
        System.out.println("You find yourself at the edge of the cliff, your vehicle wrecked on the tree just a few meters away, and a police slowly surrounding you.");
        Game.promptEnterKey();
        System.out.println("You think to yourself: \"How did it come to this?\", \"Where was my mistake?\".");
        Game.promptEnterKey();
        System.out.println("Adrenaline is pumping through your veins, \"...like an animal in the cage\", \"I have to find a solution\", and so you start going through everything that happened, hoping that you\'ll find something that would help you.");
        Game.promptEnterKey();
        System.out.println("\"It all started at that stupid carwash...\" ");
        Game.promptEnterKey();
        System.out.println("\n------------------------------------------------------------------\n");
        details.location("Carwash");
        System.out.println("story");
        Game.promptEnterKey();
        System.out.println("1. ");
        System.out.println("2. ");
        System.out.println("3. ");
        System.out.println("4. ");
        System.out.print("> ");
        Game.choice = Game.plrinput.nextInt();
    }
}
