package GameClasses.Branches;

import GameClasses.GameMechanics;
import GameClasses.MiniGames.RockPaperScissors;

final class ApartmentDetails implements Details {
    @Override
    public Details location(String place) throws InterruptedException {
        GameMechanics gameMechanics = new GameMechanics();
        gameMechanics.slowPrint(30,"Current location: ");
        gameMechanics.pause(500);
        gameMechanics.slowPrint(30,place + "\n");
        return null;
    }
}

public final class Apartment {
    public static void apartmentInit() throws InterruptedException {
        Details details = new ApartmentDetails();
        GameMechanics gameMechanics = new GameMechanics();
        System.out.println("\n------------------------------------------------------------------\n");
        details.location("Apartment");
        RockPaperScissors rps = new RockPaperScissors();
        gameMechanics.slowPrint(30,"\nOnce we get home I start feeling really sick.\n");
        gameMechanics.promptEnterKey();
        gameMechanics.slowPrint(30,"I think this incident when we almost died had something to do with it...\n");
        gameMechanics.promptEnterKey();
        gameMechanics.slowPrint(30,"Still can't believe she didn't even flinch.\n");
        gameMechanics.promptEnterKey();
        if (GameMechanics.choiceVariable > 7) {
            gameMechanics.slowPrint(30,"She's been really weird, there's something wrong with her...\n");
            gameMechanics.promptEnterKey();
        } else {
            gameMechanics.slowPrint(30,"She must be really strong mentally I guess.\n");
            gameMechanics.promptEnterKey();
        }
        gameMechanics.slowPrint(30,"I remember that I have to take my meds.\n");
        gameMechanics.promptEnterKey();
        gameMechanics.slowPrint(30,"Girlfriend: Hey, what do you say we play some rock paper scissors?\n");
        gameMechanics.promptEnterKey();
        System.out.println("1. Play rock paper scissors.");
        System.out.println("2. Take the meds first.");
        System.out.println("\n0. Exit the game");
        System.out.print("> ");
        gameMechanics.choice = gameMechanics.playerInput.nextInt();
        if (gameMechanics.choice == 0) {
            System.exit(0);
        }
        while ((gameMechanics.choice != 1) && (gameMechanics.choice != 2)) {
            System.out.println("\n" + gameMechanics.choice + " is not a valid option. Try again.\n");
            System.out.println("1. Play rock paper scissors.");
            System.out.println("2. Take the meds first.");
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
                if (GameMechanics.choiceVariable > 7) {
                    gameMechanics.slowPrint(30,"\nSomething tells me I really should take my meds...\n");
                    gameMechanics.promptEnterKey();
                    gameMechanics.slowPrint(30,"Me: I don't know... The meds are important\n");
                    gameMechanics.promptEnterKey();
                    gameMechanics.slowPrint(30,"Girlfriend: C'mon, you know how I hate the influence of these meds on you.\n");
                    gameMechanics.promptEnterKey();
                    gameMechanics.slowPrint(30,"Girlfriend: They always make you so numb and sleepy.\n");
                    gameMechanics.promptEnterKey();
                    System.out.println("1. Play rock paper scissors.");
                    System.out.println("2. Take the meds.");
                    System.out.println("\n0. Exit the game");
                    System.out.print("> ");
                    gameMechanics.pause(2000);
                    gameMechanics.slowPrint(40,"\nGirlfriend: Pretty please.\n");
                    System.out.println("1. Play rock paper scissors.");
                    System.out.println("2. Take the meds.");
                    System.out.println("\n0. Exit the game");
                    System.out.print("> ");
                    gameMechanics.choice = gameMechanics.playerInput.nextInt();
                    if (gameMechanics.choice == 0) {
                        System.exit(0);
                    }
                    while ((gameMechanics.choice != 1) && (gameMechanics.choice != 2)) {
                        System.out.println("\n" + gameMechanics.choice + " is not a valid option. Try again.\n");
                        System.out.println("1. Play rock paper scissors.");
                        System.out.println("2. Take the meds.");
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
                            try {
                                gameMechanics.substractChoiceVariable();
                            } catch (Exception e) {
                                System.out.println("Error: " + e);
                                System.exit(0);
                            }
                            gameMechanics.slowPrint(30,"\nMe: Fine...\n");
                            gameMechanics.promptEnterKey();
                            gameMechanics.slowPrint(30,"Girlfriend: Knew you wouldn't resist.\n");
                            gameMechanics.promptEnterKey();
                            gameMechanics.slowPrint(30,"Girlfriend: Ready?\n");
                            gameMechanics.promptEnterKey();
                            gameMechanics.slowPrint(30,"Me: Yeah.\n");
                            gameMechanics.promptEnterKey();
                            gameMechanics.slowPrint(50,"Girlfriend: Rock paper scissors!\n");
                            System.out.println("1. Rock.");
                            System.out.println("2. Paper.");
                            System.out.println("3. Scissors.");
                            System.out.println("\n0. Exit the game");
                            System.out.print("> ");
                            gameMechanics.choice = gameMechanics.playerInput.nextInt();
                            if (gameMechanics.choice == 0) {
                                System.exit(0);
                            }
                            while ((gameMechanics.choice != 1) && (gameMechanics.choice != 2) && (gameMechanics.choice != 3)) {
                            System.out.println("\n" + gameMechanics.choice + " is not a valid option. Try again.\n");
                            System.out.println("1. Rock.");
                            System.out.println("2. Paper.");
                            System.out.println("3. Scissors.");
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
                                    rps.RPS(1);
                                    gameMechanics.promptEnterKey();
                                    gameMechanics.slowPrint(30,"Girlfriend: Let's go again!\n");
                                    gameMechanics.promptEnterKey();
                                    gameMechanics.slowPrint(30,"Me: I think that's enough for me. I don't feel too good.\n");
                                    gameMechanics.promptEnterKey();
                                    break;

                                case 2:
                                    rps.RPS(2);
                                    gameMechanics.promptEnterKey();
                                    gameMechanics.slowPrint(30,"Girlfriend: Let's go again!\n");
                                    gameMechanics.promptEnterKey();
                                    gameMechanics.slowPrint(30,"Me: I think that's enough for me. I don't feel too good.\n");
                                    gameMechanics.promptEnterKey();
                                    break;

                                case 3:
                                    rps.RPS(3);
                                    gameMechanics.promptEnterKey();
                                    gameMechanics.slowPrint(30,"Girlfriend: Let's go again!\n");
                                    gameMechanics.promptEnterKey();
                                    gameMechanics.slowPrint(30,"Me: I think that's enough for me. I don't feel too good.\n");
                                    gameMechanics.promptEnterKey();
                                    break;
                            
                                default:
                                    break;
                            }
                            break;
                        case 2:
                            gameMechanics.slowPrint(30,"Me: I'm sorry, but meds are very important.\n");
                            gameMechanics.promptEnterKey();
                            gameMechanics.slowPrint(30,"Me: The game can wait.\n");
                            gameMechanics.promptEnterKey();
                            gameMechanics.slowPrint(50,"Girlfriend: Boooring.\n");
                            gameMechanics.promptEnterKey();
                            break;                 
                        default:
                            break;
                    }
                } else {
                    gameMechanics.slowPrint(30,"\nMe: Alright, alrgith, but only once.\n");
                    gameMechanics.promptEnterKey();
                    gameMechanics.slowPrint(30,"Girlfriend: Knew you wouldn't resist.\n");
                    gameMechanics.promptEnterKey();
                    gameMechanics.slowPrint(30,"Girlfriend: Ready?\n");
                    gameMechanics.promptEnterKey();
                    gameMechanics.slowPrint(30,"Me: Yeah.\n");
                    gameMechanics.promptEnterKey();
                    gameMechanics.slowPrint(50,"Girlfriend: Rock paper scissors!\n");
                    System.out.println("1. Rock.");
                    System.out.println("2. Paper.");
                    System.out.println("3. Scissors.");
                    System.out.println("\n0. Exit the game");
                    System.out.print("> ");
                    gameMechanics.choice = gameMechanics.playerInput.nextInt();
                    if (gameMechanics.choice == 0) {
                        System.exit(0);
                    }
                    while ((gameMechanics.choice != 1) && (gameMechanics.choice != 2) && (gameMechanics.choice != 3)) {
                    System.out.println("\n" + gameMechanics.choice + " is not a valid option. Try again.\n");
                    System.out.println("1. Rock.");
                    System.out.println("2. Paper.");
                    System.out.println("3. Scissors.");
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
                            rps.RPS(1);
                            gameMechanics.promptEnterKey();
                            gameMechanics.slowPrint(30,"Girlfriend: Let's go again!\n");
                            gameMechanics.promptEnterKey();
                            gameMechanics.slowPrint(30,"Me: I think that's enough for me. I don't feel too good.\n");
                            gameMechanics.promptEnterKey();
                            break;

                        case 2:
                            rps.RPS(2);
                            gameMechanics.promptEnterKey();
                            gameMechanics.slowPrint(30,"Girlfriend: Let's go again!\n");
                            gameMechanics.promptEnterKey();
                            gameMechanics.slowPrint(30,"Me: I think that's enough for me. I don't feel too good.\n");
                            gameMechanics.promptEnterKey();
                            break;

                        case 3:
                            rps.RPS(3);
                            gameMechanics.promptEnterKey();
                            gameMechanics.slowPrint(30,"Girlfriend: Let's go again!\n");
                            gameMechanics.promptEnterKey();
                            gameMechanics.slowPrint(30,"Me: I think that's enough for me. I don't feel too good.\n");
                            gameMechanics.promptEnterKey();
                            break;
                    
                        default:
                            break;
                    }
                }
                break;
            case 2:
                gameMechanics.slowPrint(30,"\nMe: The game can wait.\n");
                gameMechanics.promptEnterKey();
                gameMechanics.slowPrint(30,"Me: I should take my meds first.\n");
                gameMechanics.promptEnterKey();
                gameMechanics.slowPrint(30,"Girlfriend: C'mon, don't be like that.\n");
                gameMechanics.promptEnterKey();
                gameMechanics.slowPrint(30,"Girlfriend: Just one game.\n");
                gameMechanics.promptEnterKey();
                System.out.println("1. Play rock paper scissors.");
                System.out.println("2. Take the meds.");
                System.out.println("\n0. Exit the game");
                System.out.print("> ");
                gameMechanics.pause(2000);
                gameMechanics.slowPrint(40,"\nGirlfriend: Pretty please.\n");
                System.out.println("1. Play rock paper scissors.");
                System.out.println("2. Take the meds.");
                System.out.println("\n0. Exit the game");
                System.out.print("> ");
                gameMechanics.choice = gameMechanics.playerInput.nextInt();
                if (gameMechanics.choice == 0) {
                    System.exit(0);
                }
                while ((gameMechanics.choice != 1) && (gameMechanics.choice != 2)) {
                    System.out.println("\n" + gameMechanics.choice + " is not a valid option. Try again.\n");
                    System.out.println("1. Play rock paper scissors.");
                    System.out.println("2. Take the meds.");
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
                        try {
                            gameMechanics.substractChoiceVariable();
                        } catch (Exception e) {
                            System.out.println("Error: " + e);
                            System.exit(0);
                        }
                        gameMechanics.slowPrint(30,"\nMe: Fine...\n");
                        gameMechanics.promptEnterKey();
                        gameMechanics.slowPrint(30,"Girlfriend: Knew you wouldn't resist.\n");
                        gameMechanics.promptEnterKey();
                        gameMechanics.slowPrint(30,"Girlfriend: Ready?\n");
                        gameMechanics.promptEnterKey();
                        gameMechanics.slowPrint(30,"Me: Yeah.\n");
                        gameMechanics.promptEnterKey();
                        gameMechanics.slowPrint(50,"Girlfriend: Rock paper scissors!\n");
                        System.out.println("1. Rock.");
                        System.out.println("2. Paper.");
                        System.out.println("3. Scissors.");
                        System.out.println("\n0. Exit the game");
                        System.out.print("> ");
                        gameMechanics.choice = gameMechanics.playerInput.nextInt();
                        if (gameMechanics.choice == 0) {
                            System.exit(0);
                        }
                        while ((gameMechanics.choice != 1) && (gameMechanics.choice != 2) && (gameMechanics.choice != 3)) {
                        System.out.println("\n" + gameMechanics.choice + " is not a valid option. Try again.\n");
                        System.out.println("1. Rock.");
                        System.out.println("2. Paper.");
                        System.out.println("3. Scissors.");
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
                                rps.RPS(1);
                                gameMechanics.promptEnterKey();
                                gameMechanics.slowPrint(30,"Girlfriend: Let's go again!\n");
                                gameMechanics.promptEnterKey();
                                gameMechanics.slowPrint(30,"Me: I think that's enough for me. I don't feel too good.\n");
                                gameMechanics.promptEnterKey();
                                break;

                            case 2:
                                rps.RPS(2);
                                gameMechanics.promptEnterKey();
                                gameMechanics.slowPrint(30,"Girlfriend: Let's go again!\n");
                                gameMechanics.promptEnterKey();
                                gameMechanics.slowPrint(30,"Me: I think that's enough for me. I don't feel too good.\n");
                                gameMechanics.promptEnterKey();
                                break;

                            case 3:
                                rps.RPS(3);
                                gameMechanics.promptEnterKey();
                                gameMechanics.slowPrint(30,"Girlfriend: Let's go again!\n");
                                gameMechanics.promptEnterKey();
                                gameMechanics.slowPrint(30,"Me: I think that's enough for me. I don't feel too good.\n");
                                gameMechanics.promptEnterKey();
                                break;
                            
                            default:
                                break;
                        }
                        break;
                    case 2:
                        gameMechanics.addChoiceVariable();
                        gameMechanics.slowPrint(30,"Me: I'm sorry, but meds are very important.\n");
                        gameMechanics.promptEnterKey();
                        gameMechanics.slowPrint(30,"Me: The game can wait.\n");
                        gameMechanics.promptEnterKey();
                        gameMechanics.slowPrint(50,"Girlfriend: Boooring.\n");
                        gameMechanics.promptEnterKey();
                        break;
                    default:
                        break;
                }
                break;
        
            default:
                break;
        }
        gameMechanics.slowPrint(30,"I suddenly feel a huge wave of fatigue in me.\n");
        gameMechanics.promptEnterKey();
        gameMechanics.slowPrint(30,"Me: Sorry, I really need to lay down.\n");
        gameMechanics.promptEnterKey();
        gameMechanics.slowPrint(50,"Girlfriend: Oh, ok.\n");
        gameMechanics.promptEnterKey();
        gameMechanics.slowPrint(30,"Before falling asleep I remembered that tomorrow I have a doctor appointment.\n");
        gameMechanics.promptEnterKey();
        gameMechanics.slowPrint(30,"I wake up next morning.\n");
        gameMechanics.promptEnterKey();
        gameMechanics.slowPrint(200,"\n...");
    }
}
