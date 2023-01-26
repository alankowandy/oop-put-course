package GameClasses.Branches;

import GameClasses.GameMechanics;
import GameClasses.MiniGames.Shiritori;

final class CarDriveDetails implements Details {
    @Override
    public Details location(String place) throws InterruptedException {
        GameMechanics gameMechanics = new GameMechanics();
        gameMechanics.slowPrint(30,"Current location: ");
        gameMechanics.pause(500);
        gameMechanics.slowPrint(30,place + "\n");
        return null;
    }
}

final class Car implements Vehicle {
    private int currentSpeed;
    private int distance;

    Car (int currentSpeed, int distance) {
        this.currentSpeed = currentSpeed;
        this.distance = distance;
    }
    @Override
    public Vehicle accelerate(int factor) {
        System.out.println("\nAccelerating the car by " + factor + " km/h");
        this.currentSpeed += factor;
        System.out.println("Current speed of the car: " + this.currentSpeed + " km/h\n");
        return new Car(this.currentSpeed, distance);
    }

    public Vehicle brake(int factor) {
        System.out.println("\nSlowing down by " + factor + " km/h");
        this.currentSpeed -= factor;
        System.out.println("Current speed of the car: " + this.currentSpeed + " km/h\n");
        this.distance += factor;
        return new Car(this.currentSpeed, this.distance);
    }

    public String currentSpeed(){
        //System.out.println("Current speed of the car: " + this.current_speed + " km/h\n");
        return "\nCurrent speed of the car: " + this.currentSpeed + " km/h\n";
    }
}

public final class CarDrive{
    public static void CarDriveInit() throws InterruptedException {
        Details details = new CarDriveDetails();
        GameMechanics gameMechanics = new GameMechanics();
        Car car = new Car(60, 2);
        Shiritori shiritori = new Shiritori();
        String nextWord;
        System.out.println("\n------------------------------------------------------------------\n");
        details.location("On the road");
        gameMechanics.slowPrint(30,GameMechanics.choiceVariable + "\n");
        gameMechanics.slowPrint(30,"\nGirlfriend: Ok, listen. The game's name is Shiritori.\n");
        gameMechanics.promptEnterKey();
        gameMechanics.slowPrint(30,"Me: That's an interesting name for sure.\n");
        gameMechanics.promptEnterKey();
        gameMechanics.slowPrint(30,"Girlfriend: Right?\n");
        gameMechanics.promptEnterKey();
        gameMechanics.slowPrint(30,"Girlfriend: By the way, would you mind going a little bit faster?\n");
        System.out.println("1. Accelerate the car");
        System.out.println("2. Show current speed.");
        System.out.println("3. Slow down a bit.");
        System.out.println("\n0. Exit the game");
        System.out.print("> ");
        gameMechanics.choice = gameMechanics.playerInput.nextInt();
        if (gameMechanics.choice == 0) {
            System.exit(0);
        }
        while ((gameMechanics.choice != 1) && (gameMechanics.choice != 3)) {
            if (gameMechanics.choice == 2) {
                System.out.println(car.currentSpeed());
            } else {
                System.out.println("\n" + gameMechanics.choice + " is not a valid option. Try again.\n");  
            }
            System.out.println("1. Accelerate the car");
            System.out.println("2. Show current speed.");
            System.out.println("3. Slow down a bit.");
            System.out.println("\n0. Exit the game");
            System.out.print("> ");
            gameMechanics.choice = gameMechanics.playerInput.nextInt();
            if (gameMechanics.choice == 1 || gameMechanics.choice == 3) {
                break;
            } else if (gameMechanics.choice == 0) {
                System.exit(0);
            }
        }
        switch (gameMechanics.choice) {
            case 1:
                car.accelerate(15);
                gameMechanics.slowPrint(30,"\nGirlfriend: Thank you.\n");
                gameMechanics.promptEnterKey();
                try {
                    gameMechanics.substractChoiceVariable();
                } catch (Exception e) {
                    System.out.println("Error: " + e);
                    System.exit(0);
                }
                break;
            case 3:
                car.brake(10);
                gameMechanics.slowPrint(30,"\nGirlfriend: Hey! I asked you to go faster, not slow down!\n");
                gameMechanics.promptEnterKey();
                gameMechanics.slowPrint(30,"Me: Don't be in such a hurry. This way we will get more time to play your game.\n");
                gameMechanics.promptEnterKey();
                gameMechanics.slowPrint(35,"Girlfriend: Ok, just... You know I don't like being outside the home.\n");
                gameMechanics.promptEnterKey();
                gameMechanics.slowPrint(30,"Me: Yeah, I know.\n");
                gameMechanics.promptEnterKey();
                gameMechanics.slowPrint(35,"Come to think, I don't remember the last time I saw her interact with other human being.\n");
                gameMechanics.promptEnterKey();
                gameMechanics.addChoiceVariable();
                break;
        
            default:
                break;
        }
        gameMechanics.slowPrint(30,"Girlfriend: Anyway, do you know how to play Shiritori?\n");
        gameMechanics.promptEnterKey();
        gameMechanics.slowPrint(30,"Me: No clue.\n");
        gameMechanics.promptEnterKey();
        gameMechanics.slowPrint(30,"Girlfriend: There are two main rules to this game:\n");
        gameMechanics.promptEnterKey();
        gameMechanics.slowPrint(30,"Girlfriend: First character of next word must match last character of previous word.\n");
        gameMechanics.promptEnterKey();
        gameMechanics.slowPrint(30,"Girlfriend: And the word must not have already been said.\n");
        gameMechanics.promptEnterKey();
        gameMechanics.slowPrint(30,"Girlfriend: Simple as that.\n");
        gameMechanics.promptEnterKey();
        gameMechanics.slowPrint(30,"Me: I think I get it although it might be hard for me to focus on it while driving.\n");
        gameMechanics.promptEnterKey();
        gameMechanics.slowPrint(30,"Girlfriend: You can do it, I believe in you.\n");
        gameMechanics.promptEnterKey();
        gameMechanics.slowPrint(30,"Girlfriend: Ok, let me start...\n");
        gameMechanics.pause(2000);
        gameMechanics.slowPrint(30,"\nGirlfriend: First word: apple.\n");
        gameMechanics.pause(500);
        gameMechanics.slowPrint(30,"\nGirlfriend: Your turn!\n");
        System.out.println("1. Ear.");
        System.out.println("2. Elephant.");
        System.out.println("3. Emergency.");
        System.out.println("\n0. Exit the game");
        System.out.print("> ");
        gameMechanics.choice = gameMechanics.playerInput.nextInt();
        if (gameMechanics.choice == 0) {
            System.exit(0);
        }
        while ((gameMechanics.choice != 1) && (gameMechanics.choice != 2) && (gameMechanics.choice != 3)) {
            System.out.println("\n" + gameMechanics.choice + " is not a valid option. Try again.\n");
            System.out.println("1. Ear.");
            System.out.println("2. Elephant.");
            System.out.println("3. Emergency.");
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
                nextWord = "ear";
                shiritori.play(nextWord);
                gameMechanics.slowPrint(30,"\nGirlfriend: Ear? You literally couldn't have gone with an easier one!\n");
                gameMechanics.promptEnterKey();
                gameMechanics.slowPrint(30,"Girlfriend: Ok, next word: rhino!\n");
                nextWord = "rhino";
                shiritori.play(nextWord);
                gameMechanics.promptEnterKey();
                break;
            
            case 2:
                nextWord = "elephant";
                shiritori.play(nextWord);
                gameMechanics.slowPrint(30,"\nGirlfriend: How cute.\n");
                gameMechanics.promptEnterKey();
                gameMechanics.slowPrint(30,"Girlfriend: Ok, next word: table!\n");
                gameMechanics.promptEnterKey();
                gameMechanics.slowPrint(30,"Girlfriend: Wait! You already had a word that starts with an 'e'.\n");
                gameMechanics.promptEnterKey();
                gameMechanics.slowPrint(30,"Girlfriend: Let's make it 'tail'.\n");
                gameMechanics.promptEnterKey();
                gameMechanics.slowPrint(30,"Me: Too late, now it has to be table.\n");
                gameMechanics.promptEnterKey();
                gameMechanics.slowPrint(35,"Girlfriend: Fine...\n");
                nextWord = "table";
                shiritori.play(nextWord);
                gameMechanics.promptEnterKey();
                break;

            case 3:
                nextWord = "emergency";
                shiritori.play(nextWord);
                gameMechanics.slowPrint(30,"\nWhen I say 'emergency' something feels wrong...\n");
                gameMechanics.promptEnterKey();
                gameMechanics.slowPrint(30,"I can't exactly tell what though.\n");
                gameMechanics.promptEnterKey();
                gameMechanics.slowPrint(30,"Girlfriend: Emergency? You are a weird one for sure.\n");
                gameMechanics.promptEnterKey();
                gameMechanics.slowPrint(30,"Me: That's a totally normal word. I don't know what you mean.\n");
                gameMechanics.promptEnterKey();
                gameMechanics.slowPrint(30,"Girlfriend: Nevermind, next word: yawp!\n");
                gameMechanics.promptEnterKey();
                gameMechanics.slowPrint(30,"Me: What the hell is a yawp?\n");
                gameMechanics.promptEnterKey();
                gameMechanics.slowPrint(30,"Girlfriend: It's a fancy word for 'yell'. Your turn sweetheart.\n");
                nextWord = "yawp";
                shiritori.play(nextWord);
                gameMechanics.promptEnterKey();
                break;
            default:
                break;
        }
        System.out.println("1. Oven.");
        System.out.println("2. Emergency.");
        System.out.println("3. Procedure.");
        System.out.println("4. Ask what words were already used.");
        System.out.println("\n0. Exit the game");
        System.out.print("> ");
        gameMechanics.choice = gameMechanics.playerInput.nextInt();
        if (gameMechanics.choice == 0) {
            System.exit(0);
        }
        while ((gameMechanics.choice != 1) && (gameMechanics.choice != 2) && (gameMechanics.choice != 3)) {
            if (gameMechanics.choice == 4) {
                gameMechanics.slowPrint(30,"\nGirlfriend: You certainly got weak memory. The words were following:\n");
                shiritori.printWords();
            } else {
                System.out.println("\n" + gameMechanics.choice + " is not a valid option. Try again.\n"); 
            } 
            System.out.println("1. Oven.");
            System.out.println("2. Emergency.");
            System.out.println("3. Procedure.");
            System.out.println("4. Ask what words were already used.");
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
                nextWord = "oven";
                shiritori.play(nextWord);
                try {
                    gameMechanics.substractChoiceVariable();
                } catch (Exception e) {
                    System.out.println("Error: " + e);
                    System.exit(0);
                }
                if (shiritori.gameOver == false) {
                    gameMechanics.slowPrint(40,"Girlfriend: Oven it is. Ok, let's see...\n");
                    gameMechanics.promptEnterKey();
                    gameMechanics.slowPrint(40,"Girlfriend: For the next word I choose...\n");
                    gameMechanics.promptEnterKey();
                    gameMechanics.slowPrint(20,"Girlfriend: Oh my God, watch out!!!\n");
                    gameMechanics.promptEnterKey();    
                } else {
                    gameMechanics.promptEnterKey();
                    gameMechanics.slowPrint(20,"Girlfriend: Oh my God, watch out!!!\n");
                    gameMechanics.promptEnterKey();
                }
                break;
            case 2:
                nextWord = "emergency";
                shiritori.play(nextWord);
                if (shiritori.gameOver == false) {
                    gameMechanics.slowPrint(30,"When I say 'emergency' something feels wrong...\n");
                    gameMechanics.promptEnterKey();
                    gameMechanics.slowPrint(30,"I can't exactly tell what though.\n");
                    gameMechanics.addChoiceVariable();
                    gameMechanics.promptEnterKey();
                    gameMechanics.slowPrint(30,"Girlfriend: Emergency? You are a weird one for sure.\n");
                    gameMechanics.promptEnterKey();
                    gameMechanics.slowPrint(30,"Me: That's a totally normal word. I don't know what you mean.\n");
                    gameMechanics.promptEnterKey();
                    gameMechanics.slowPrint(30,"Girlfriend: Nevermind, next word: yawp!\n");
                    gameMechanics.promptEnterKey();
                    gameMechanics.slowPrint(30,"Me: What the hell is a yawp?\n");
                    gameMechanics.promptEnterKey();
                    gameMechanics.slowPrint(30,"Girlfriend: It's a fancy word for ...\n");
                    gameMechanics.slowPrint(20,"\nGirlfriend: Oh my God, watch out!!!\n");
                    gameMechanics.promptEnterKey();   
                } else {
                    gameMechanics.promptEnterKey();
                    gameMechanics.slowPrint(30,"When I say 'emergency' for the 2nd time something feels wrong.\n");
                    gameMechanics.promptEnterKey();
                    gameMechanics.slowPrint(40,"Like something is seriously out of place.\n");
                    gameMechanics.promptEnterKey();
                    gameMechanics.slowPrint(30,"Girlfriend: Are you ok? You look pale.\n");
                    gameMechanics.promptEnterKey();
                    gameMechanics.slowPrint(50,"Me: Yeah, I just...\n");
                    gameMechanics.promptEnterKey();
                    gameMechanics.slowPrint(10,"Girlfriend: Emergency, emergency, emergency, emergency, emergency, emergency, emergency, emergency, emergency, emergency, emergency, emergency, emergency, emergency,\n");
                    gameMechanics.slowPrint(40,"\nMe: What's going on. Why are you...\n");
                    gameMechanics.slowPrint(10,"\nGirlfriend: Emergency, emergency, emergency, emergency, emergency, emergency, emergency, emergency, emergency, emergency, emergency, emergency, emergency, emergency,\n");
                    gameMechanics.slowPrint(50,"\nMe: What...\n");
                    gameMechanics.addDoubleChoiceVariable();
                    gameMechanics.slowPrint(30,GameMechanics.choiceVariable + "\n");
                    gameMechanics.promptEnterKey();
                    gameMechanics.slowPrint(20,"Girlfriend: Oh my God, watch out!!!\n");
                    gameMechanics.promptEnterKey();
                }
                break;
            case 3:
                nextWord = "procedure";
                shiritori.play(nextWord);
                if (shiritori.gameOver == false) {
                    gameMechanics.slowPrint(40,"Girlfriend: Procedure huh? Ok, let's see...\n");
                    gameMechanics.promptEnterKey();
                    gameMechanics.slowPrint(40,"Girlfriend: For the next word I choose...\n");
                    gameMechanics.promptEnterKey();
                    gameMechanics.slowPrint(20,"Girlfriend: Oh my God, watch out!!!\n");
                    gameMechanics.promptEnterKey();    
                } else {
                    gameMechanics.promptEnterKey();
                    gameMechanics.slowPrint(20,"Girlfriend: Oh my God, watch out!!!\n");
                    gameMechanics.promptEnterKey();
                }
                break;
            default:
                break;
        }
        shiritori.restart();
        gameMechanics.slowPrint(10,"All of sudden I can see truck coming right towards me.\n");
        gameMechanics.promptEnterKey();
        gameMechanics.slowPrint(10,"How...\n");
        gameMechanics.promptEnterKey();
        gameMechanics.slowPrint(10,"I'm on the wrong lane.\n");
        gameMechanics.promptEnterKey();
        gameMechanics.slowPrint(30,"I quickly turn the steereing wheel and escape the truck\n");
        gameMechanics.promptEnterKey();
        gameMechanics.slowPrint(30,"Thankfully I manage to get the car under control.\n");
        gameMechanics.promptEnterKey();
        gameMechanics.slowPrint(40,"Me: That was way too close!\n");
        gameMechanics.promptEnterKey();
        gameMechanics.slowPrint(50,"Girlfriend: ...\n");
        gameMechanics.promptEnterKey();
        gameMechanics.slowPrint(50,"Me: Are you...\n");
        gameMechanics.promptEnterKey();
        gameMechanics.slowPrint(40,"I take a look at my girlfriend and she looks completely calm and collected, like nothing happened.\n");
        gameMechanics.promptEnterKey();
        gameMechanics.slowPrint(30,"Girfriend: Let's just go home.\n");
        gameMechanics.promptEnterKey();
        gameMechanics.slowPrint(50,"Me: Right.\n");
        gameMechanics.promptEnterKey();
        gameMechanics.slowPrint(200,"\n..."); 
    }
}
