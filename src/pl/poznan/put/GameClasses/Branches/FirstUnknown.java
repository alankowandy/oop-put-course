package GameClasses.Branches;

import GameClasses.GameMechanics;

final class FirstUnknownDetails implements Details {

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

public final class FirstUnknown {
    public static void firstUnknownInit() throws InterruptedException {
        Details details = new FirstUnknownDetails();
        GameMechanics gameMechanics = new GameMechanics();
        System.out.println("\n------------------------------------------------------------------\n");
        details.location("Unknown");
        gameMechanics.slowPrint(30,"\nYou find yourself outside of the crashed car, your car wrecked on the tree just a few meters away, and the sound of sirens coming closer and closer.\n");
        gameMechanics.promptEnterKey();
        gameMechanics.slowPrint(30,"Blood is all over your hands. You can feel that the adrenaline rush is slowly ending and the pain gets greater and greater.\n");
        gameMechanics.promptEnterKey();
        gameMechanics.slowPrint(40,"But then you remember.\n");
        gameMechanics.pause(2000);
        gameMechanics.slowPrint(40,"\nI wasn't alone in the car...\n");
        gameMechanics.slowPrint(200,"\n...");
    }
}
    
