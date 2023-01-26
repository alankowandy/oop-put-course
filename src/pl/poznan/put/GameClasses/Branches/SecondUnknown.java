package GameClasses.Branches;

import GameClasses.GameMechanics;

final class SecondUnknownDetails implements Details {

    @Override
    public Details location(String place) throws InterruptedException {
        GameMechanics gameMechanics = new GameMechanics();
        gameMechanics.slowPrint(30,"Current location: ");
        gameMechanics.pause(1500);
        gameMechanics.slowPrint(30,place + "\n");
        gameMechanics.pause(1000);
        return null;
    }
}

public class SecondUnknown {
    public static void secondUnknownInit() throws InterruptedException {
        Details details = new SecondUnknownDetails();
        System.out.println("\n------------------------------------------------------------------\n");
        details.location("Unknown");
        GameMechanics gameMechanics = new GameMechanics();
        gameMechanics.slowPrint(30,"\nI run to the car to look for the other person.\n");
        gameMechanics.promptEnterKey();
        gameMechanics.slowPrint(30,"I'm sure I wasn't alone. I just can't remember who was it.\n");
        gameMechanics.promptEnterKey();
        gameMechanics.slowPrint(30,"In the car I only find huge mess and blood marks.\n");
        gameMechanics.promptEnterKey();
        gameMechanics.slowPrint(50,"I remember now...\n");
        gameMechanics.promptEnterKey();
        gameMechanics.slowPrint(30,"Where is she...\n");
        gameMechanics.pause(2000);
        gameMechanics.slowPrint(40,"\nThe sound of sirens is really close now.\n");
        gameMechanics.slowPrint(200,"\n...");
    }
}
