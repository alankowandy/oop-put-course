package GameClasses.Branches;

import GameClasses.GameMechanics;
import GameClasses.MiniGames.Shiritori;

final class FirstCarDriveDetails implements Details {
    @Override
    public Details location(String place) throws InterruptedException {
        GameMechanics.slowPrint(30,"Current location: ");
        GameMechanics.pause(500);
        GameMechanics.slowPrint(30,place + "\n");
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
        Details details = new FirstCarDriveDetails();
        Car car = new Car(60, 2);
        Shiritori shiritori = new Shiritori();
        String nextWord;
        System.out.println("\n------------------------------------------------------------------\n");
        details.location("On the road");
        GameMechanics.slowPrint(30,"\nGirlfriend: Ok, listen. The game's name is Shiritori.\n");
        GameMechanics.promptEnterKey();
        GameMechanics.slowPrint(30,"Me: That's an interesting name for sure.\n");
        GameMechanics.promptEnterKey();
        GameMechanics.slowPrint(30,"Girlfriend: Right?\n");
        GameMechanics.promptEnterKey();
        GameMechanics.slowPrint(30,"Girlfriend: By the way, would you mind going a little bit faster?\n");
        System.out.println("1. Accelerate the car");
        System.out.println("2. Show current speed.");
        System.out.println("3. Slow down a bit.");
        System.out.println("\n0. Exit the game");
        System.out.print("> ");
        GameMechanics.choice = GameMechanics.playerInput.nextInt();
        if (GameMechanics.choice == 0) {
            System.exit(0);
        }
        while ((GameMechanics.choice != 1) && (GameMechanics.choice != 3)) {
            if (GameMechanics.choice == 2) {
                System.out.println(car.currentSpeed());
            } else {
                System.out.println("\n" + GameMechanics.choice + " is not a valid option. Try again.\n");  
            }
            System.out.println("1. Accelerate the car");
            System.out.println("2. Show current speed.");
            System.out.println("3. Slow down a bit.");
            System.out.println("\n0. Exit the game");
            System.out.print("> ");
            GameMechanics.choice = GameMechanics.playerInput.nextInt();
            if (GameMechanics.choice == 1 || GameMechanics.choice == 3) {
                break;
            } else if (GameMechanics.choice == 0) {
                System.exit(0);
            }
        }
        switch (GameMechanics.choice) {
            case 1:
                car.accelerate(15);
                GameMechanics.slowPrint(30,"\nGirlfriend: Thank you.\n");
                GameMechanics.promptEnterKey();
                try {
                    GameMechanics.substractChoiceVariable();
                } catch (Exception e) {
                    System.out.println("Error: " + e);
                    System.exit(0);
                }
                break;
            case 3:
                car.brake(10);
                GameMechanics.slowPrint(30,"\nGirlfriend: Hey! I asked you to go faster, not slow down!\n");
                GameMechanics.promptEnterKey();
                GameMechanics.slowPrint(30,"Me: Don't be in such a hurry. This way we will get more time to play your game.\n");
                GameMechanics.promptEnterKey();
                GameMechanics.slowPrint(35,"Girlfriend: Ok, just... You know I don't like being outside the home.\n");
                GameMechanics.promptEnterKey();
                GameMechanics.slowPrint(30,"Me: Yeah, I know.\n");
                GameMechanics.promptEnterKey();
                GameMechanics.slowPrint(35,"Come to think, I don't remember the last time I saw her interact with other human being.\n");
                GameMechanics.promptEnterKey();
                GameMechanics.choiceVariable++;
                break;
        
            default:
                break;
        }
        GameMechanics.slowPrint(30,"Girlfriend: Anyway, do you know how to play Shiritori?\n");
        GameMechanics.promptEnterKey();
        GameMechanics.slowPrint(30,"Me: No clue.\n");
        GameMechanics.promptEnterKey();
        GameMechanics.slowPrint(30,"Girlfriend: There are two main rules to this game:\n");
        GameMechanics.promptEnterKey();
        GameMechanics.slowPrint(30,"Girlfriend: First character of next word must match last character of previous word.\n");
        GameMechanics.promptEnterKey();
        GameMechanics.slowPrint(30,"Girlfriend: And the word must not have already been said.\n");
        GameMechanics.promptEnterKey();
        GameMechanics.slowPrint(30,"Girlfriend: Simple as that.\n");
        GameMechanics.promptEnterKey();
        GameMechanics.slowPrint(30,"Me: I think I get it although it might be hard for me to focus on it while driving.\n");
        GameMechanics.promptEnterKey();
        GameMechanics.slowPrint(30,"Girlfriend: You can do it, I believe in you.\n");
        GameMechanics.promptEnterKey();
        GameMechanics.slowPrint(30,"Girlfriend: Ok, let me start...\n");
        GameMechanics.pause(2000);
        GameMechanics.slowPrint(30,"\nGirlfriend: First word: apple.\n");
        GameMechanics.pause(500);
        GameMechanics.slowPrint(30,"\nGirlfriend: Your turn!\n");
        System.out.println("1. Ear.");
        System.out.println("2. Elephant.");
        System.out.println("3. Emergency.");
        System.out.println("\n0. Exit the game");
        System.out.print("> ");
        GameMechanics.choice = GameMechanics.playerInput.nextInt();
        if (GameMechanics.choice == 0) {
            System.exit(0);
        }
        while ((GameMechanics.choice != 1) && (GameMechanics.choice != 2) && (GameMechanics.choice != 3)) {
            System.out.println("\n" + GameMechanics.choice + " is not a valid option. Try again.\n");
            System.out.println("1. Ear.");
            System.out.println("2. Elephant.");
            System.out.println("3. Emergency.");
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
                nextWord = "ear";
                shiritori.play(nextWord);
                GameMechanics.slowPrint(30,"\nGirlfriend: Ear? You literally couldn't have gone with an easier one!\n");
                GameMechanics.promptEnterKey();
                GameMechanics.slowPrint(30,"Girlfriend: Ok, next word: rhino!\n");
                nextWord = "rhino";
                shiritori.play(nextWord);
                GameMechanics.promptEnterKey();
                break;
            
            case 2:
                nextWord = "elephant";
                shiritori.play(nextWord);
                GameMechanics.slowPrint(30,"\nGirlfriend: How cute.\n");
                GameMechanics.promptEnterKey();
                GameMechanics.slowPrint(30,"Girlfriend: Ok, next word: table!\n");
                GameMechanics.promptEnterKey();
                GameMechanics.slowPrint(30,"Girlfriend: Wait! You already had a word that starts with an 'e'.\n");
                GameMechanics.promptEnterKey();
                GameMechanics.slowPrint(30,"Girlfriend: Let's make it 'tail'.\n");
                GameMechanics.promptEnterKey();
                GameMechanics.slowPrint(30,"Me: Too late, now it has to be table.\n");
                GameMechanics.promptEnterKey();
                GameMechanics.slowPrint(35,"Girlfriend: Fine...\n");
                nextWord = "table";
                shiritori.play(nextWord);
                GameMechanics.promptEnterKey();
                break;

            case 3:
                nextWord = "emergency";
                shiritori.play(nextWord);
                GameMechanics.slowPrint(30,"\nWhen I say 'emergency' something feels wrong...\n");
                GameMechanics.promptEnterKey();
                GameMechanics.slowPrint(30,"I can't exactly tell what though.\n");
                GameMechanics.promptEnterKey();
                GameMechanics.slowPrint(30,"Girlfriend: Emergency? You are a weird one for sure.\n");
                GameMechanics.promptEnterKey();
                GameMechanics.slowPrint(30,"Me: That's a totally normal word. I don't know what you mean.\n");
                GameMechanics.promptEnterKey();
                GameMechanics.slowPrint(30,"Girlfriend: Nevermind, next word: yawp!\n");
                GameMechanics.promptEnterKey();
                GameMechanics.slowPrint(30,"Me: What the hell is a yawp?\n");
                GameMechanics.promptEnterKey();
                GameMechanics.slowPrint(30,"Girlfriend: It's a fancy word for 'yell'. Your turn sweetheart.\n");
                nextWord = "yawp";
                shiritori.play(nextWord);
                GameMechanics.promptEnterKey();
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
        GameMechanics.choice = GameMechanics.playerInput.nextInt();
        if (GameMechanics.choice == 0) {
            System.exit(0);
        }
        while ((GameMechanics.choice != 1) && (GameMechanics.choice != 2) && (GameMechanics.choice != 3)) {
            if (GameMechanics.choice == 4) {
                GameMechanics.slowPrint(30,"\nGirlfriend: You certainly got weak memory. The words were following:\n");
                shiritori.printWords();
            } else {
                System.out.println("\n" + GameMechanics.choice + " is not a valid option. Try again.\n"); 
            } 
            System.out.println("1. Oven.");
            System.out.println("2. Emergency.");
            System.out.println("3. Procedure.");
            System.out.println("4. Ask what words were already used.");
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
                nextWord = "oven";
                shiritori.play(nextWord);
                try {
                    GameMechanics.substractChoiceVariable();
                } catch (Exception e) {
                    System.out.println("Error: " + e);
                    System.exit(0);
                }
                if (shiritori.gameOver == false) {
                    GameMechanics.slowPrint(40,"Girlfriend: Oven it is. Ok, let's see...\n");
                    GameMechanics.promptEnterKey();
                    GameMechanics.slowPrint(40,"Girlfriend: For the next word I choose...\n");
                    GameMechanics.promptEnterKey();
                    GameMechanics.slowPrint(20,"Girlfriend: Oh my God, watch out!!!\n");
                    GameMechanics.promptEnterKey();    
                } else {
                    GameMechanics.promptEnterKey();
                    GameMechanics.slowPrint(20,"Girlfriend: Oh my God, watch out!!!\n");
                    GameMechanics.promptEnterKey();
                }
                break;
            case 2:
                nextWord = "emergency";
                shiritori.play(nextWord);
                if (shiritori.gameOver == false) {
                    GameMechanics.slowPrint(30,"When I say 'emergency' something feels wrong...\n");
                    GameMechanics.promptEnterKey();
                    GameMechanics.slowPrint(30,"I can't exactly tell what though.\n");
                    GameMechanics.choiceVariable++;
                    GameMechanics.promptEnterKey();
                    GameMechanics.slowPrint(30,"Girlfriend: Emergency? You are a weird one for sure.\n");
                    GameMechanics.promptEnterKey();
                    GameMechanics.slowPrint(30,"Me: That's a totally normal word. I don't know what you mean.\n");
                    GameMechanics.promptEnterKey();
                    GameMechanics.slowPrint(30,"Girlfriend: Nevermind, next word: yawp!\n");
                    GameMechanics.promptEnterKey();
                    GameMechanics.slowPrint(30,"Me: What the hell is a yawp?\n");
                    GameMechanics.promptEnterKey();
                    GameMechanics.slowPrint(30,"Girlfriend: It's a fancy word for ...\n");
                    GameMechanics.slowPrint(20,"\nGirlfriend: Oh my God, watch out!!!\n");
                    GameMechanics.promptEnterKey();   
                } else {
                    GameMechanics.promptEnterKey();
                    GameMechanics.slowPrint(30,"When I say 'emergency' for the 2nd time something feels wrong.\n");
                    GameMechanics.promptEnterKey();
                    GameMechanics.slowPrint(40,"Like something is seriously out of place.\n");
                    GameMechanics.promptEnterKey();
                    GameMechanics.slowPrint(30,"Girlfriend: Are you ok? You look pale.\n");
                    GameMechanics.promptEnterKey();
                    GameMechanics.slowPrint(50,"Me: Yeah, I just...\n");
                    GameMechanics.promptEnterKey();
                    GameMechanics.slowPrint(10,"Girlfriend: Emergency, emergency, emergency, emergency, emergency, emergency, emergency, emergency, emergency, emergency, emergency, emergency, emergency, emergency,\n");
                    GameMechanics.slowPrint(40,"\nMe: What's going on. Why are you...\n");
                    GameMechanics.slowPrint(10,"\nGirlfriend: Emergency, emergency, emergency, emergency, emergency, emergency, emergency, emergency, emergency, emergency, emergency, emergency, emergency, emergency,\n");
                    GameMechanics.slowPrint(50,"\nMe: What...\n");
                    GameMechanics.choiceVariable += 2;
                    GameMechanics.slowPrint(30,GameMechanics.choiceVariable + "\n");
                    GameMechanics.promptEnterKey();
                    GameMechanics.slowPrint(20,"Girlfriend: Oh my God, watch out!!!\n");
                    GameMechanics.promptEnterKey();
                }
                break;
            case 3:
                nextWord = "procedure";
                shiritori.play(nextWord);
                if (shiritori.gameOver == false) {
                    GameMechanics.slowPrint(40,"Girlfriend: Procedure huh? Ok, let's see...\n");
                    GameMechanics.promptEnterKey();
                    GameMechanics.slowPrint(40,"Girlfriend: For the next word I choose...\n");
                    GameMechanics.promptEnterKey();
                    GameMechanics.slowPrint(20,"Girlfriend: Oh my God, watch out!!!\n");
                    GameMechanics.promptEnterKey();    
                } else {
                    GameMechanics.promptEnterKey();
                    GameMechanics.slowPrint(20,"Girlfriend: Oh my God, watch out!!!\n");
                    GameMechanics.promptEnterKey();
                }
                break;
            default:
                break;
        }
        GameMechanics.slowPrint(10,"All of sudden I can see truck coming right towards me.\n");
        GameMechanics.promptEnterKey();
        GameMechanics.slowPrint(10,"How...\n");
        GameMechanics.promptEnterKey();
        GameMechanics.slowPrint(10,"I'm on the wrong lane.\n");
        GameMechanics.promptEnterKey();
        GameMechanics.slowPrint(30,"I quickly turn the steereing wheel and escape the truck\n");
        GameMechanics.promptEnterKey();
        GameMechanics.slowPrint(30,"Thankfully I manage to get the car under control.\n");
        GameMechanics.promptEnterKey();
        GameMechanics.slowPrint(40,"Me: That was way too close!\n");
        GameMechanics.promptEnterKey();
        GameMechanics.slowPrint(50,"Girlfriend: ...\n");
        GameMechanics.promptEnterKey();
        GameMechanics.slowPrint(50,"Me: Are you...\n");
        GameMechanics.promptEnterKey();
        GameMechanics.slowPrint(40,"I take a look at my girlfriend and she looks completely calm and collected, like nothing happened.\n");
        GameMechanics.promptEnterKey();
        GameMechanics.slowPrint(30,"Girfriend: Let's just go home.\n");
        GameMechanics.promptEnterKey();
        GameMechanics.slowPrint(50,"Me: Right.\n");
        GameMechanics.promptEnterKey();
        GameMechanics.slowPrint(200,"\n..."); 
    }
}
