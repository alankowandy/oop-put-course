package GameClasses.Branches;

import GameClasses.GameMechanics;

final class FirstUnknownDetails implements Details {

    @Override
    public Details location(String place) throws InterruptedException {
        GameMechanics.slowPrint(30,"Current location: ");
        GameMechanics.pause(1500);
        GameMechanics.slowPrint(30,place + "\n");
        GameMechanics.pause(1000);
        return null;
    }
}

public final class FirstUnknown {
    public static void firstUnknownInit() throws InterruptedException {
        Details details = new FirstUnknownDetails();
        System.out.println("\n------------------------------------------------------------------\n");
        details.location("Unknown");
        GameMechanics.slowPrint(30,"\nYou find yourself outside of the crashed car, your car wrecked on the tree just a few meters away, and the sound of sirens coming closer and closer.\n");
        GameMechanics.promptEnterKey();
        GameMechanics.slowPrint(30,"Blood is all over your hands. You can feel that the adrenaline rush is slowly ending and the pain gets greater and greater.\n");
        GameMechanics.promptEnterKey();
        GameMechanics.slowPrint(40,"But then you remember.\n");
        GameMechanics.pause(2000);
        GameMechanics.slowPrint(40,"\nI wasn't alone in the car...\n");
        GameMechanics.slowPrint(200,"\n...");
    }
}
    
