package GameClasses.Branches;

import GameClasses.GameMechanics;
import GameClasses.MiniGames.RockPaperScissors;

final class ApartmentDetails implements Details {
    @Override
    public Details location(String place) throws InterruptedException {
        GameMechanics.slowPrint(30,"Current location: ");
        GameMechanics.pause(500);
        GameMechanics.slowPrint(30,place + "\n");
        return null;
    }
}

public final class Apartment {
    public static void apartmentInit() throws InterruptedException {
        Details details = new ApartmentDetails();
        System.out.println("\n------------------------------------------------------------------\n");
        details.location("Apartment");
        RockPaperScissors rps = new RockPaperScissors();
        GameMechanics.slowPrint(30,"\nOnce we get home I start feeling really sick.\n");
        GameMechanics.promptEnterKey();
        GameMechanics.slowPrint(30,"I think this incident when we almost died had something to do with it...\n");
        GameMechanics.promptEnterKey();
        GameMechanics.slowPrint(30,"Still can't believe she didn't even flinch.\n");
        GameMechanics.promptEnterKey();
        if (GameMechanics.choiceVariable > 7) {
            GameMechanics.slowPrint(30,"She's been really weird, there's something wrong with her...\n");
            GameMechanics.promptEnterKey();
        } else {
            GameMechanics.slowPrint(30,"She must be really strong mentally I guess.\n");
            GameMechanics.promptEnterKey();
        }
        GameMechanics.slowPrint(30,"I remember that I have to take my meds.\n");
        GameMechanics.promptEnterKey();
        GameMechanics.slowPrint(30,"Girlfriend: Hey, what do you say we play some rock paper scissors?\n");
        GameMechanics.promptEnterKey();
        System.out.println("1. Play rock paper scissors.");
        System.out.println("2. Take the meds first.");
        System.out.println("\n0. Exit the game");
        System.out.print("> ");
        GameMechanics.choice = GameMechanics.playerInput.nextInt();
        if (GameMechanics.choice == 0) {
            System.exit(0);
        }
        while ((GameMechanics.choice != 1) && (GameMechanics.choice != 2)) {
            System.out.println("\n" + GameMechanics.choice + " is not a valid option. Try again.\n");
            System.out.println("1. Play rock paper scissors.");
            System.out.println("2. Take the meds first.");
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
                if (GameMechanics.choiceVariable > 7) {
                    GameMechanics.slowPrint(30,"\nSomething tells me I really should take my meds...\n");
                    GameMechanics.promptEnterKey();
                    GameMechanics.slowPrint(30,"Me: I don't know... The meds are important\n");
                    GameMechanics.promptEnterKey();
                    GameMechanics.slowPrint(30,"Girlfriend: C'mon, you know how I hate the influence of these meds on you.\n");
                    GameMechanics.promptEnterKey();
                    GameMechanics.slowPrint(30,"Girlfriend: They always make you so numb and sleepy.\n");
                    GameMechanics.promptEnterKey();
                    System.out.println("1. Play rock paper scissors.");
                    System.out.println("2. Take the meds.");
                    System.out.println("\n0. Exit the game");
                    System.out.print("> ");
                    GameMechanics.pause(2000);
                    GameMechanics.slowPrint(40,"\nGirlfriend: Pretty please.\n");
                    System.out.println("1. Play rock paper scissors.");
                    System.out.println("2. Take the meds.");
                    System.out.println("\n0. Exit the game");
                    System.out.print("> ");
                    GameMechanics.choice = GameMechanics.playerInput.nextInt();
                    if (GameMechanics.choice == 0) {
                        System.exit(0);
                    }
                    while ((GameMechanics.choice != 1) && (GameMechanics.choice != 2)) {
                        System.out.println("\n" + GameMechanics.choice + " is not a valid option. Try again.\n");
                        System.out.println("1. Play rock paper scissors.");
                        System.out.println("2. Take the meds.");
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
                            try {
                                GameMechanics.substractChoiceVariable();
                            } catch (Exception e) {
                                System.out.println("Error: " + e);
                                System.exit(0);
                            }
                            GameMechanics.slowPrint(30,"\nMe: Fine...\n");
                            GameMechanics.promptEnterKey();
                            GameMechanics.slowPrint(30,"Girlfriend: Knew you wouldn't resist.\n");
                            GameMechanics.promptEnterKey();
                            GameMechanics.slowPrint(30,"Girlfriend: Ready?\n");
                            GameMechanics.promptEnterKey();
                            GameMechanics.slowPrint(30,"Me: Yeah.\n");
                            GameMechanics.promptEnterKey();
                            GameMechanics.slowPrint(50,"Girlfriend: Rock paper scissors!\n");
                            System.out.println("1. Rock.");
                            System.out.println("2. Paper.");
                            System.out.println("3. Scissors.");
                            System.out.println("\n0. Exit the game");
                            System.out.print("> ");
                            GameMechanics.choice = GameMechanics.playerInput.nextInt();
                            if (GameMechanics.choice == 0) {
                                System.exit(0);
                            }
                            while ((GameMechanics.choice != 1) && (GameMechanics.choice != 2) && (GameMechanics.choice != 3)) {
                            System.out.println("\n" + GameMechanics.choice + " is not a valid option. Try again.\n");
                            System.out.println("1. Rock.");
                            System.out.println("2. Paper.");
                            System.out.println("3. Scissors.");
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
                                    rps.RPS(1);
                                    GameMechanics.promptEnterKey();
                                    GameMechanics.slowPrint(30,"Girlfriend: Let's go again!\n");
                                    GameMechanics.promptEnterKey();
                                    GameMechanics.slowPrint(30,"Me: I think that's enough for me. I don't feel too good.\n");
                                    GameMechanics.promptEnterKey();
                                    break;

                                case 2:
                                    rps.RPS(2);
                                    GameMechanics.promptEnterKey();
                                    GameMechanics.slowPrint(30,"Girlfriend: Let's go again!\n");
                                    GameMechanics.promptEnterKey();
                                    GameMechanics.slowPrint(30,"Me: I think that's enough for me. I don't feel too good.\n");
                                    GameMechanics.promptEnterKey();
                                    break;

                                case 3:
                                    rps.RPS(3);
                                    GameMechanics.promptEnterKey();
                                    GameMechanics.slowPrint(30,"Girlfriend: Let's go again!\n");
                                    GameMechanics.promptEnterKey();
                                    GameMechanics.slowPrint(30,"Me: I think that's enough for me. I don't feel too good.\n");
                                    GameMechanics.promptEnterKey();
                                    break;
                            
                                default:
                                    break;
                            }
                            break;
                        case 2:
                            GameMechanics.slowPrint(30,"Me: I'm sorry, but meds are very important.\n");
                            GameMechanics.promptEnterKey();
                            GameMechanics.slowPrint(30,"Me: The game can wait.\n");
                            GameMechanics.promptEnterKey();
                            GameMechanics.slowPrint(50,"Girlfriend: Boooring.\n");
                            GameMechanics.promptEnterKey();
                            break;                 
                        default:
                            break;
                    }
                } else {
                    GameMechanics.slowPrint(30,"\nMe: Alright, alrgith, but only once.\n");
                    GameMechanics.promptEnterKey();
                    GameMechanics.slowPrint(30,"Girlfriend: Knew you wouldn't resist.\n");
                    GameMechanics.promptEnterKey();
                    GameMechanics.slowPrint(30,"Girlfriend: Ready?\n");
                    GameMechanics.promptEnterKey();
                    GameMechanics.slowPrint(30,"Me: Yeah.\n");
                    GameMechanics.promptEnterKey();
                    GameMechanics.slowPrint(50,"Girlfriend: Rock paper scissors!\n");
                    System.out.println("1. Rock.");
                    System.out.println("2. Paper.");
                    System.out.println("3. Scissors.");
                    System.out.println("\n0. Exit the game");
                    System.out.print("> ");
                    GameMechanics.choice = GameMechanics.playerInput.nextInt();
                    if (GameMechanics.choice == 0) {
                        System.exit(0);
                    }
                    while ((GameMechanics.choice != 1) && (GameMechanics.choice != 2) && (GameMechanics.choice != 3)) {
                    System.out.println("\n" + GameMechanics.choice + " is not a valid option. Try again.\n");
                    System.out.println("1. Rock.");
                    System.out.println("2. Paper.");
                    System.out.println("3. Scissors.");
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
                            rps.RPS(1);
                            GameMechanics.promptEnterKey();
                            GameMechanics.slowPrint(30,"Girlfriend: Let's go again!\n");
                            GameMechanics.promptEnterKey();
                            GameMechanics.slowPrint(30,"Me: I think that's enough for me. I don't feel too good.\n");
                            GameMechanics.promptEnterKey();
                            break;

                        case 2:
                            rps.RPS(2);
                            GameMechanics.promptEnterKey();
                            GameMechanics.slowPrint(30,"Girlfriend: Let's go again!\n");
                            GameMechanics.promptEnterKey();
                            GameMechanics.slowPrint(30,"Me: I think that's enough for me. I don't feel too good.\n");
                            GameMechanics.promptEnterKey();
                            break;

                        case 3:
                            rps.RPS(3);
                            GameMechanics.promptEnterKey();
                            GameMechanics.slowPrint(30,"Girlfriend: Let's go again!\n");
                            GameMechanics.promptEnterKey();
                            GameMechanics.slowPrint(30,"Me: I think that's enough for me. I don't feel too good.\n");
                            GameMechanics.promptEnterKey();
                            break;
                    
                        default:
                            break;
                    }
                }
                break;
            case 2:
                GameMechanics.slowPrint(30,"\nMe: The game can wait.\n");
                GameMechanics.promptEnterKey();
                GameMechanics.slowPrint(30,"Me: I should take my meds first.\n");
                GameMechanics.promptEnterKey();
                GameMechanics.slowPrint(30,"Girlfriend: C'mon, don't be like that.\n");
                GameMechanics.promptEnterKey();
                GameMechanics.slowPrint(30,"Girlfriend: Just one game.\n");
                GameMechanics.promptEnterKey();
                System.out.println("1. Play rock paper scissors.");
                System.out.println("2. Take the meds.");
                System.out.println("\n0. Exit the game");
                System.out.print("> ");
                GameMechanics.pause(2000);
                GameMechanics.slowPrint(40,"\nGirlfriend: Pretty please.\n");
                System.out.println("1. Play rock paper scissors.");
                System.out.println("2. Take the meds.");
                System.out.println("\n0. Exit the game");
                System.out.print("> ");
                GameMechanics.choice = GameMechanics.playerInput.nextInt();
                if (GameMechanics.choice == 0) {
                    System.exit(0);
                }
                while ((GameMechanics.choice != 1) && (GameMechanics.choice != 2)) {
                    System.out.println("\n" + GameMechanics.choice + " is not a valid option. Try again.\n");
                    System.out.println("1. Play rock paper scissors.");
                    System.out.println("2. Take the meds.");
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
                        try {
                            GameMechanics.substractChoiceVariable();
                        } catch (Exception e) {
                            System.out.println("Error: " + e);
                            System.exit(0);
                        }
                        GameMechanics.slowPrint(30,"\nMe: Fine...\n");
                        GameMechanics.promptEnterKey();
                        GameMechanics.slowPrint(30,"Girlfriend: Knew you wouldn't resist.\n");
                        GameMechanics.promptEnterKey();
                        GameMechanics.slowPrint(30,"Girlfriend: Ready?\n");
                        GameMechanics.promptEnterKey();
                        GameMechanics.slowPrint(30,"Me: Yeah.\n");
                        GameMechanics.promptEnterKey();
                        GameMechanics.slowPrint(50,"Girlfriend: Rock paper scissors!\n");
                        System.out.println("1. Rock.");
                        System.out.println("2. Paper.");
                        System.out.println("3. Scissors.");
                        System.out.println("\n0. Exit the game");
                        System.out.print("> ");
                        GameMechanics.choice = GameMechanics.playerInput.nextInt();
                        if (GameMechanics.choice == 0) {
                            System.exit(0);
                        }
                        while ((GameMechanics.choice != 1) && (GameMechanics.choice != 2) && (GameMechanics.choice != 3)) {
                        System.out.println("\n" + GameMechanics.choice + " is not a valid option. Try again.\n");
                        System.out.println("1. Rock.");
                        System.out.println("2. Paper.");
                        System.out.println("3. Scissors.");
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
                                rps.RPS(1);
                                GameMechanics.promptEnterKey();
                                GameMechanics.slowPrint(30,"Girlfriend: Let's go again!\n");
                                GameMechanics.promptEnterKey();
                                GameMechanics.slowPrint(30,"Me: I think that's enough for me. I don't feel too good.\n");
                                GameMechanics.promptEnterKey();
                                break;

                            case 2:
                                rps.RPS(2);
                                GameMechanics.promptEnterKey();
                                GameMechanics.slowPrint(30,"Girlfriend: Let's go again!\n");
                                GameMechanics.promptEnterKey();
                                GameMechanics.slowPrint(30,"Me: I think that's enough for me. I don't feel too good.\n");
                                GameMechanics.promptEnterKey();
                                break;

                            case 3:
                                rps.RPS(3);
                                GameMechanics.promptEnterKey();
                                GameMechanics.slowPrint(30,"Girlfriend: Let's go again!\n");
                                GameMechanics.promptEnterKey();
                                GameMechanics.slowPrint(30,"Me: I think that's enough for me. I don't feel too good.\n");
                                GameMechanics.promptEnterKey();
                                break;
                            
                            default:
                                break;
                        }
                        break;
                    case 2:
                        GameMechanics.choiceVariable++;
                        GameMechanics.slowPrint(30,"Me: I'm sorry, but meds are very important.\n");
                        GameMechanics.promptEnterKey();
                        GameMechanics.slowPrint(30,"Me: The game can wait.\n");
                        GameMechanics.promptEnterKey();
                        GameMechanics.slowPrint(50,"Girlfriend: Boooring.\n");
                        GameMechanics.promptEnterKey();
                        break;
                    default:
                        break;
                }
                break;
        
            default:
                break;
        }
        GameMechanics.slowPrint(30,"I suddenly feel a huge wave of fatigue in me.\n");
        GameMechanics.promptEnterKey();
        GameMechanics.slowPrint(30,"Me: Sorry, I really need to lay down.\n");
        GameMechanics.promptEnterKey();
        GameMechanics.slowPrint(50,"Girlfriend: Oh, ok.\n");
        GameMechanics.promptEnterKey();
        GameMechanics.slowPrint(30,"Before falling asleep I remembered that tomorrow I have a doctor appointment.\n");
        GameMechanics.promptEnterKey();
        GameMechanics.slowPrint(30,"I wake up next morning.\n");
        GameMechanics.promptEnterKey();
        GameMechanics.slowPrint(200,"\n...");
    }
}
