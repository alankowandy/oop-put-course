package GameClasses.Branches;

import GameClasses.GameMechanics;

final class SecondUnknownDetails implements Details {

    @Override
    public Details location(String place) throws InterruptedException {
        GameMechanics.slowPrint(30,"Current location: ");
        GameMechanics.pause(1500);
        GameMechanics.slowPrint(30,place + "\n");
        GameMechanics.pause(1000);
        return null;
    }
}

public class SecondUnknown {
    public static void secondUnknownInit() throws InterruptedException {
        Details details = new SecondUnknownDetails();
        System.out.println("\n------------------------------------------------------------------\n");
        details.location("Unknown");
        GameMechanics.slowPrint(30,"\nI run to the car to look for the other person.\n");
        GameMechanics.promptEnterKey();
        GameMechanics.slowPrint(30,"I'm sure I wasn't alone. I just can't remember who was it.\n");
        GameMechanics.promptEnterKey();
        GameMechanics.slowPrint(30,"In the car I only find huge mess and blood marks.\n");
        GameMechanics.promptEnterKey();
        GameMechanics.slowPrint(50,"I remember now...\n");
        GameMechanics.promptEnterKey();
        GameMechanics.slowPrint(30,"Where is she...\n");
        GameMechanics.pause(2000);
        GameMechanics.slowPrint(40,"\nThe sound of sirens is really close now.\n");
        GameMechanics.slowPrint(200,"\n...");
    }
}
