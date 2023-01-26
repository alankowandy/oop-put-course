package GameClasses.Branches;

import GameClasses.GameMechanics;

final class CarwashDetails implements Details {
    @Override
    public Details location(String place) throws InterruptedException {
        GameMechanics gameMechanics = new GameMechanics();
        gameMechanics.slowPrint(30,"Current location: ");
        gameMechanics.pause(500);
        gameMechanics.slowPrint(30,place + "\n");
        return null;
    }
}

public final class Carwash {
    public static void carwashInit() throws InterruptedException {
        Details details = new CarwashDetails();
        GameMechanics gameMechanics = new GameMechanics();
        System.out.println("\n------------------------------------------------------------------\n");
        details.location("Carwash");
        gameMechanics.slowPrint(30,"\nDamn, I'm missing some change again. I should have known better this time and remember to take more from the apartment.\n");
        gameMechanics.promptEnterKey();
        gameMechanics.slowPrint(30,"There should be a machine to exchange the money somewhere...\n");
        gameMechanics.promptEnterKey();
        gameMechanics.slowPrint(30,"I can also ask that other guy that washes his car if he has some change.\n");
        gameMechanics.promptEnterKey();
        System.out.println("1. Look for the money exchange machine.");
        System.out.println("2. Ask the guy if he has some change.");
        System.out.println("3. Wash the car with the change you have.");
        System.out.println("\n0. Exit the game");
        System.out.print("> ");
        gameMechanics.choice = gameMechanics.playerInput.nextInt();
        if (gameMechanics.choice == 0) {
            System.exit(0);
        }
        while ((gameMechanics.choice != 1) && (gameMechanics.choice != 2) && (gameMechanics.choice != 3)) {
            System.out.println("\n" + gameMechanics.choice + " is not a valid option. Try again.\n");
            System.out.println("1. Look for the money exchange machine.");
            System.out.println("2. Ask the guy if he has some change.");
            System.out.println("3. Wash the car with the change you have.");
            System.out.println("\n0. Exit the game");
            System.out.print("> ");
            gameMechanics.choice = gameMechanics.playerInput.nextInt();
            if (gameMechanics.choice == 1 || gameMechanics.choice == 2 || gameMechanics.choice == 3) {
                break;
            } else if (gameMechanics.choice == 0) {
                System.exit(0);
            }
        }
        switch (gameMechanics.choice) {        
                case 1:
                    gameMechanics.slowPrint(30,"\nI look around a little bit more and I find the exchange machine.\n");
                    gameMechanics.promptEnterKey();
                    gameMechanics.slowPrint(30,"However after I take out my cash for exchange I notice what's written on the screen of the machine.\n");
                    gameMechanics.slowPrint(40,"\n\"Out of order\"\n");
                    gameMechanics.slowPrint(40,"\nOf course, how typical...\n");
                    gameMechanics.addChoiceVariable();
                    gameMechanics.promptEnterKey();
                    System.out.println("1. Ask the guy if he has some change.");
                    System.out.println("2. Wash the car with the change you have.");
                    System.out.println("\n0. Exit the game");
                    System.out.print("> ");
                    gameMechanics.choice = gameMechanics.playerInput.nextInt();
                    if (gameMechanics.choice == 0) {
                        System.exit(0);
                    }
                    while (gameMechanics.choice != 1 && gameMechanics.choice != 2) {
                        System.out.println("\n" + gameMechanics.choice + " is not a valid option. Try again.\n");
                        System.out.println("1. Ask the guy if he has some change.");
                        System.out.println("2. Wash the car with the change you have.");
                        System.out.println("\n0. Exit the game");
                        System.out.print("> ");
                        gameMechanics.choice = gameMechanics.playerInput.nextInt();
                        if (gameMechanics.choice == 1 || gameMechanics.choice == 2) {
                            break;
                        } else if (gameMechanics.choice == 0) {
                            System.exit(0);
                        }
                    }
                    switch (gameMechanics.choice) {
                        case 1:
                            gameMechanics.slowPrint(30,"\nMe: I'm sorry sir, would you able to exchange some money or lend me some change? I'm missing some for the carwash.\n");
                            gameMechanics.promptEnterKey();
                            gameMechanics.slowPrint(30,"Guy: Piss off! I don't have time for this.\n");
                            gameMechanics.promptEnterKey();
                            gameMechanics.slowPrint(30,"I decide to just walk away and leave him be before he gets more aggresive.\n");
                            gameMechanics.addChoiceVariable();
                            gameMechanics.promptEnterKey();
                            break;
                    
                        case 2:
                            gameMechanics.slowPrint(30,"\nWell, guess it's better to wash the car at least a little bit than not washing it at all.\n");
                            gameMechanics.promptEnterKey();    
                            gameMechanics.slowPrint(30,"I walk back to the car and just when I'm about to put the change into the carwash machine I hear someone scream.\n");
                            gameMechanics.promptEnterKey();
                            break;

                        default:
                            break;
                    }
                    break;

                case 2:
                    gameMechanics.slowPrint(30,"\nMe: I'm sorry sir, would you able to exchange some money or lend me some change? I'm missing some for the carwash.\n");
                    gameMechanics.promptEnterKey();
                    gameMechanics.slowPrint(30,"Guy: Piss off! I don't have time for this.\n");
                    gameMechanics.promptEnterKey();
                    gameMechanics.slowPrint(30,"I decide to just walk away and leave him be before he gets more aggresive.\n");
                    gameMechanics.promptEnterKey();
                    gameMechanics.addChoiceVariable();
                    gameMechanics.slowPrint(30,"While I walk back to the car I notice the money exchange machine and that it says \"Out of order\".\n");
                    gameMechanics.slowPrint(40,"\nOf course...\n");
                    gameMechanics.promptEnterKey();
                    break;
            
                case 3:
                    gameMechanics.slowPrint(30,"Well, guess it's better to wash the car at least a little bit than not washing it at all.\n");
                    gameMechanics.promptEnterKey();    
                    gameMechanics.slowPrint(30,"I walk back to the car and just when I'm about to put the change into the carwash machine I hear someone scream.\n");
                    gameMechanics.promptEnterKey();
                    break;
            
                default: 
                    break; 
        }
        gameMechanics.slowPrint(30,"Girl: Hey! What's taking you so long? I'm getting bored over here!\n");
        gameMechanics.promptEnterKey();
        gameMechanics.slowPrint(30,"I see my girlfriend waving her hand out of the car window and screaming to me.\n");
        gameMechanics.promptEnterKey();
        gameMechanics.slowPrint(30,"Girlfriend: So? How long?\n");
        gameMechanics.promptEnterKey();
        gameMechanics.slowPrint(30,"Me: Just a little bit longer, I don't have the change to fully clean it anyway.\n");
        gameMechanics.promptEnterKey();
        gameMechanics.slowPrint(30,"Girlfriend: Screw it then. Let's go back home.\n");
        gameMechanics.promptEnterKey();
        System.out.println("1. Wash the car.");
        System.out.println("2. Don't wash the car and go home now.");
        System.out.println("\n0. Exit the game");
        gameMechanics.pause(2000);
        gameMechanics.slowPrint(30,"\nGirlfriend: C'mon, I have a new game for us to play while we drive home.\n\n");
        System.out.println("1. Wash the car.");
        System.out.println("2. Don't wash the car and go home now.");
        System.out.println("\n0. Exit the game");
        System.out.print("> ");
        gameMechanics.choice = gameMechanics.playerInput.nextInt();
        if (gameMechanics.choice == 0) {
            System.exit(0);
        }
        while ((gameMechanics.choice != 1) && (gameMechanics.choice != 2)) {
            System.out.println("\n" + gameMechanics.choice + " is not a valid option. Try again.\n");
            System.out.println("1. Wash the car.");
            System.out.println("2. Don't wash the car and go home now.");
            System.out.println("\n0. Exit the game");
            System.out.print("> ");
            gameMechanics.choice = gameMechanics.playerInput.nextInt();
            if (gameMechanics.choice == 1 || gameMechanics.choice == 2) {
                break;
            } else if (gameMechanics.choice == 0) {
                System.exit(0);
            }
        }
        switch (gameMechanics.choice) {
            case 1:
                gameMechanics.addChoiceVariable();
                gameMechanics.slowPrint(30,"Me: It really won't be long, I promise.\n");
                gameMechanics.promptEnterKey();
                gameMechanics.slowPrint(30,"Girlfriend: Fine, but please be quick, I can't wait to play the game.\n");
                gameMechanics.promptEnterKey();
                gameMechanics.slowPrint(30,"I quickly clean the car, not that I had an oppertunity to clean it any longer...\n");
                gameMechanics.promptEnterKey();
                gameMechanics.slowPrint(30,"After I finish washing the car I sat inside.\n");
                gameMechanics.promptEnterKey();
                gameMechanics.slowPrint(30,"Me: Ready to go?\n");
                gameMechanics.promptEnterKey();
                gameMechanics.slowPrint(50,"Girlfriend: Duh, let's go.\n");
                gameMechanics.promptEnterKey();
                gameMechanics.slowPrint(30,"Me: So what's the game you wanted to play?\n");
                gameMechanics.promptEnterKey();
                gameMechanics.slowPrint(30,"Girlfriend: I'll tell you on the way.\n");
                //gameMechanics.slowPrint(30,GameMechanics.choiceVariable + "\n");
                gameMechanics.promptEnterKey();
                break;
            case 2:
                gameMechanics.slowPrint(30,"Me: Alright, I guess I wouldn't be able to clean too much anyway.\n");
                gameMechanics.promptEnterKey();
                gameMechanics.slowPrint(30,"Girlfriend: Yay!\n");
                gameMechanics.promptEnterKey();
                gameMechanics.slowPrint(30,"Me: So what's the game you wanted to play again?\n");
                gameMechanics.promptEnterKey();
                gameMechanics.slowPrint(30,"Girlfriend: Let's go. I'll tell you on the way.\n");
                try {
                    gameMechanics.substractChoiceVariable();
                } catch (Exception e) {
                    System.out.println("Error: " + e);
                    System.exit(0);
                }
                //gameMechanics.slowPrint(30,GameMechanics.choiceVariable + "\n");
                gameMechanics.promptEnterKey();
                break;
            default:
                break;
        }
        gameMechanics.slowPrint(200,"\n...");    
    }
}
