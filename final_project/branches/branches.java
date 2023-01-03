package branches;

import core.game;

public class branches {
    private static String location;

    public static void starting_screen() {
        System.out.println("\n------------------------------------------------------------------\n");
        branches.location = "Carwash";
        System.out.println("Current location: " + branches.location);
        System.out.println("story");
        game.promptEnterKey();
        System.out.println("1. ");
        System.out.println("2. ");
        System.out.println("3. ");
        System.out.println("4. ");
        System.out.print("My choice: ");
        game.choice = game.choiceScanner.nextInt();
    }

    public void atm() {
        branches.location = "Bank";
        System.out.print("Current location: " + branches.location);
    }
}
