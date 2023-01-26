package GameClasses.Branches;

import GameClasses.GameMechanics;

final class CarwashDetails implements Details {
    @Override
    public Details location(String place) throws InterruptedException {
        GameMechanics.slowPrint(30,"Current location: ");
        GameMechanics.pause(500);
        GameMechanics.slowPrint(30,place + "\n");
        return null;
    }
}

public final class Carwash {
    public static void carwashInit() throws InterruptedException {
        Details details = new CarwashDetails();
        System.out.println("\n------------------------------------------------------------------\n");
        details.location("Carwash");
        GameMechanics.slowPrint(30,"\nDamn, I'm missing some change again. I should have known better this time and remember to take more from the apartment\n");
        GameMechanics.promptEnterKey();
        GameMechanics.slowPrint(30,"There should be a machine to exchange the money somewhere...\n");
        GameMechanics.promptEnterKey();
        GameMechanics.slowPrint(30,"I can also ask that other guy that washes his car if he has some change.\n");
        GameMechanics.promptEnterKey();
        System.out.println("1. Look for the money exchange machine.");
        System.out.println("2. Ask the guy if he has some change.");
        System.out.println("3. Wash the car with the change you have.");
        System.out.println("\n0. Exit the game");
        System.out.print("> ");
        GameMechanics.choice = GameMechanics.playerInput.nextInt();
        if (GameMechanics.choice == 0) {
            System.exit(0);
        }
        while ((GameMechanics.choice != 1) && (GameMechanics.choice != 2) && (GameMechanics.choice != 3)) {
            System.out.println("\n" + GameMechanics.choice + " is not a valid option. Try again.\n");
            System.out.println("1. Look for the money exchange machine.");
            System.out.println("2. Ask the guy if he has some change.");
            System.out.println("3. Wash the car with the change you have.");
            System.out.println("\n0. Exit the game");
            System.out.print("> ");
            GameMechanics.choice = GameMechanics.playerInput.nextInt();
            if (GameMechanics.choice == 1 || GameMechanics.choice == 2 || GameMechanics.choice == 3) {
                break;
            } else if (GameMechanics.choice == 0) {
                System.exit(0);
            }
        }
        switch (GameMechanics.choice) {        
                case 1:
                    GameMechanics.slowPrint(30,"\nI look around a little bit more and I find the exchange machine.\n");
                    GameMechanics.promptEnterKey();
                    GameMechanics.slowPrint(30,"However after I take out my cash for exchange I notice what's written on the screen of the machine.\n");
                    GameMechanics.slowPrint(40,"\n\"Out of order\"\n");
                    GameMechanics.slowPrint(40,"\nOf course, how typical...\n");
                    GameMechanics.choiceVariable++;
                    GameMechanics.promptEnterKey();
                    System.out.println("1. Ask the guy if he has some change.");
                    System.out.println("2. Wash the car with the change you have.");
                    System.out.println("\n0. Exit the game");
                    System.out.print("> ");
                    GameMechanics.choice = GameMechanics.playerInput.nextInt();
                    if (GameMechanics.choice == 0) {
                        System.exit(0);
                    }
                    while (GameMechanics.choice != 1 && GameMechanics.choice != 2) {
                        System.out.println("\n" + GameMechanics.choice + " is not a valid option. Try again.\n");
                        System.out.println("1. Ask the guy if he has some change.");
                        System.out.println("2. Wash the car with the change you have.");
                        System.out.println("\n0. Exit the game");
                        System.out.print("> ");
                        GameMechanics.choice = GameMechanics.playerInput.nextInt();
                        if (GameMechanics.choice == 1 || GameMechanics.choice == 2) {
                            break;
                        } else if (GameMechanics.choice == 0) {
                            System.exit(0);
                        }
                    }
                    switch (GameMechanics.choice) {
                        case 1:
                            GameMechanics.slowPrint(30,"\nMe: I'm sorry sir, would you able to exchange some money or lend me some change? I'm missing some for the carwash.\n");
                            GameMechanics.promptEnterKey();
                            GameMechanics.slowPrint(30,"Guy: Piss off! I don't have time for this.\n");
                            GameMechanics.promptEnterKey();
                            GameMechanics.slowPrint(30,"I decide to just walk away and leave him be before he gets aggresive.\n");
                            GameMechanics.choiceVariable++;
                            GameMechanics.promptEnterKey();
                            break;
                    
                        case 2:
                            GameMechanics.slowPrint(30,"\nWell, guess it's better to wash the car at least a little bit than not washing it at all.\n");
                            GameMechanics.promptEnterKey();    
                            GameMechanics.slowPrint(30,"I walk back to the car and just when I'm about to put the change into the carwash machine I hear someone scream.\n");
                            GameMechanics.promptEnterKey();
                            break;

                        default:
                            break;
                    }
                    break;

                case 2:
                    GameMechanics.slowPrint(30,"\nMe: I'm sorry sir, would you able to exchange some money or lend me some change? I'm missing some for the carwash.\n");
                    GameMechanics.promptEnterKey();
                    GameMechanics.slowPrint(30,"Guy: Piss off! I don't have time for this.\n");
                    GameMechanics.promptEnterKey();
                    GameMechanics.slowPrint(30,"I decide to just walk away and leave him be before he gets aggresive.\n");
                    GameMechanics.promptEnterKey();
                    GameMechanics.choiceVariable++;
                    GameMechanics.slowPrint(30,"While I walk back to the car I notice the money exchange machine and that it says \"Out of order\"\n");
                    GameMechanics.slowPrint(40,"\nOf course...\n");
                    GameMechanics.promptEnterKey();
                    break;
            
                case 3:
                    GameMechanics.slowPrint(30,"Well, guess it's better to wash the car at least a little bit than not washing it at all.\n");
                    GameMechanics.promptEnterKey();    
                    GameMechanics.slowPrint(30,"I walk back to the car and just when I'm about to put the change into the carwash machine I hear someone scream.\n");
                    GameMechanics.promptEnterKey();
                    break;
            
                default: 
                    break; 
        }
        GameMechanics.slowPrint(30,"Girl: Hey! What's taking you so long? I'm getting bored over here!\n");
        GameMechanics.promptEnterKey();
        GameMechanics.slowPrint(30,"I see my girlfriend waving her hand out of the car window and screaming to me.\n");
        GameMechanics.promptEnterKey();
        GameMechanics.slowPrint(30,"Girlfriend: So? How long?\n");
        GameMechanics.promptEnterKey();
        GameMechanics.slowPrint(30,"Me: Just a little bit longer, I don't have the change to fully clean it anyway.\n");
        GameMechanics.promptEnterKey();
        GameMechanics.slowPrint(30,"Girlfriend: Screw it then. Let's go back home.\n");
        GameMechanics.promptEnterKey();
        System.out.println("1. Wash the car.");
        System.out.println("2. Don't wash the car and go home now.");
        System.out.println("\n0. Exit the game");
        GameMechanics.pause(2000);
        GameMechanics.slowPrint(30,"\nGirlfriend: C'mon, I have a new game for us to play while we drive home.\n\n");
        System.out.println("1. Wash the car.");
        System.out.println("2. Don't wash the car and go home now.");
        System.out.println("\n0. Exit the game");
        System.out.print("> ");
        GameMechanics.choice = GameMechanics.playerInput.nextInt();
        if (GameMechanics.choice == 0) {
            System.exit(0);
        }
        while ((GameMechanics.choice != 1) && (GameMechanics.choice != 2)) {
            System.out.println("\n" + GameMechanics.choice + " is not a valid option. Try again.\n");
            System.out.println("1. Wash the car.");
            System.out.println("2. Don't wash the car and go home now.");
            System.out.println("\n0. Exit the game");
            System.out.print("> ");
            GameMechanics.choice = GameMechanics.playerInput.nextInt();
            if (GameMechanics.choice == 1 || GameMechanics.choice == 2) {
                break;
            } else if (GameMechanics.choice == 0) {
                System.exit(0);
            }
        }
        switch (GameMechanics.choice) {
            case 1:
                GameMechanics.choiceVariable++;
                GameMechanics.slowPrint(30,"Me: It really won't be long, I promise.\n");
                GameMechanics.promptEnterKey();
                GameMechanics.slowPrint(30,"Girlfriend: Fine, but please be quick, I can't wait to play the game.\n");
                GameMechanics.promptEnterKey();
                GameMechanics.slowPrint(30,"I quickly clean the car, not that I had an oppertunity to clean it any longer...\n");
                GameMechanics.promptEnterKey();
                GameMechanics.slowPrint(30,"After I finish washing the car I sat in the car.\n");
                GameMechanics.promptEnterKey();
                GameMechanics.slowPrint(30,"Me: Ready to go?\n");
                GameMechanics.promptEnterKey();
                GameMechanics.slowPrint(50,"Girlfriend: Duh, let's go\n");
                GameMechanics.promptEnterKey();
                GameMechanics.slowPrint(30,"Me: So what's the game you wanted to play?\n");
                GameMechanics.promptEnterKey();
                GameMechanics.slowPrint(30,"Girlfriend: I'll tell you on the way.\n");
                //GameMechanics.slowPrint(30,GameMechanics.choiceVariable + "\n");
                GameMechanics.promptEnterKey();
                break;
            case 2:
                GameMechanics.slowPrint(30,"Me: Alrigt, I guess I wouldn't be able to clean too much anyway.\n");
                GameMechanics.promptEnterKey();
                GameMechanics.slowPrint(30,"Girlfriend: Yay!\n");
                GameMechanics.promptEnterKey();
                GameMechanics.slowPrint(30,"Me: So what's the game you wanted to play again?\n");
                GameMechanics.promptEnterKey();
                GameMechanics.slowPrint(30,"Girlfriend: Let's go. I'll tell you on the way.\n");
                try {
                    GameMechanics.substractChoiceVariable();
                } catch (Exception e) {
                    System.out.println("Error: " + e);
                    System.exit(0);
                }
                GameMechanics.slowPrint(30,GameMechanics.choiceVariable + "\n");
                GameMechanics.promptEnterKey();
                break;
            default:
                break;
        }
        GameMechanics.slowPrint(200,"\n...");    
    }
}
