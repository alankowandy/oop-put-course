package GameClasses.Branches;

import GameClasses.GameMechanics;
import GameClasses.MiniGames.Shiritori;
import GameClasses.MiniGames.RockPaperScissors;

final class FirstCarDriveDetails implements Details {
    @Override
    public Details location(String place) throws InterruptedException {
        GameMechanics gameMechanics = new GameMechanics();
        gameMechanics.slowPrint(30,"Current location: ");
        gameMechanics.pause(500);
        gameMechanics.slowPrint(30,place + "\n");
        return null;
    }
}

public final class Epilogue {
    public static void epilogueInit() throws InterruptedException {
        Details details = new FirstCarDriveDetails();
        GameMechanics gameMechanics = new GameMechanics();
        Car car = new Car(90, 2);
        Shiritori shiritori = new Shiritori();
        RockPaperScissors rps = new RockPaperScissors();
        String nextWord;
        System.out.println("\n------------------------------------------------------------------\n");
        details.location("On the road");
        if (gameMechanics.currentChoiceVariable() > 7) {
            gameMechanics.slowPrint(30,"\nMe: You know you didn't have to come with me.\n");
            gameMechanics.promptEnterKey();
            gameMechanics.slowPrint(30,"Me: I know you don't like to leave the house.\n");
            gameMechanics.promptEnterKey();
            gameMechanics.slowPrint(30,"Girlfriend: I wanted to accompany you.\n");
            gameMechanics.promptEnterKey();
            gameMechanics.slowPrint(30,"Girlfriend: Let's play a game!\n");
            gameMechanics.promptEnterKey();
            gameMechanics.slowPrint(30,"Girlfriend: What do you say for shiritori?\n");
            gameMechanics.promptEnterKey();
            gameMechanics.slowPrint(30,"Me: No, I'm not really in the mood for games right now.\n");
            gameMechanics.promptEnterKey();
            gameMechanics.slowPrint(30,"Girlfriend: Even for rock paper scissors?\n");
            gameMechanics.promptEnterKey();
            gameMechanics.slowPrint(30,"Me: Yeah, even for that.\n");
            gameMechanics.promptEnterKey();
            System.out.println("1. Accelerate the car");
            System.out.println("2. Show current speed.");
            System.out.println("\n0. Exit the game");
            System.out.print("> ");
            gameMechanics.choice = gameMechanics.playerInput.nextInt();
            if (gameMechanics.choice == 0) {
                System.exit(0);
            }
            while ((gameMechanics.choice != 1)) {
                if (gameMechanics.choice == 2) {
                    System.out.println(car.currentSpeed());
                } else {
                    System.out.println("\n" + gameMechanics.choice + " is not a valid option. Try again.\n");  
                }
                System.out.println("1. Accelerate the car");
                System.out.println("2. Show current speed.");
                System.out.println("\n0. Exit the game");
                System.out.print("> ");
                gameMechanics.choice = gameMechanics.playerInput.nextInt();
                if (gameMechanics.choice == 1) {
                    break;
                } else if (gameMechanics.choice == 0) {
                    System.exit(0);
                }
            }
            if (gameMechanics.choice == 1) {
                car.accelerate(30);
                gameMechanics.slowPrint(30,"\nGirlfriend: Don't you think we are going too fast?\n");
                gameMechanics.promptEnterKey();
                gameMechanics.slowPrint(30,"Me: I don't want to be late for the doctor appointment.\n");
                gameMechanics.promptEnterKey();
                gameMechanics.slowPrint(30,"Me: Besides, aren't you the one that always wants to get back to home as soon as possible?\n");
                gameMechanics.promptEnterKey();
                gameMechanics.slowPrint(50,"Girlfriend: Well, not this time.\n");
                gameMechanics.promptEnterKey();
                gameMechanics.slowPrint(30,"Me: That's odd, you never say that.\n");
                gameMechanics.promptEnterKey();
                gameMechanics.slowPrint(30,"But after saying that I realize she only says that when I'm going to the doctor.\n");
                gameMechanics.promptEnterKey();
                gameMechanics.slowPrint(20,"Girlfriend: Look at me.\n");
                gameMechanics.promptEnterKey();
                gameMechanics.slowPrint(30,"Me: I can't, I have to look on the road.\n");
                gameMechanics.promptEnterKey();
                gameMechanics.slowPrint(70,"Girlfriend: Look at me.\n");
                gameMechanics.promptEnterKey();
                gameMechanics.slowPrint(30,"The way she said that sent chills down my spine.\n");
                gameMechanics.promptEnterKey();
                gameMechanics.slowPrint(50,"Girlfriend: Do you really want to do this?\n");
                gameMechanics.promptEnterKey();
                gameMechanics.slowPrint(30,"Me: Do wha...\n");
                gameMechanics.promptEnterKey();
                gameMechanics.slowPrint(70,"Girlfriend: Look, a deer is on the road.\n");
                gameMechanics.promptEnterKey();
                gameMechanics.slowPrint(30,"Before I have time to look back on the road I subconsciously move the steering wheel to avoid the deer.\n");
                gameMechanics.promptEnterKey();
                gameMechanics.slowPrint(200,"\n...\n");
                gameMechanics.slowPrint(30,"\nI find myself outside of the crashed car, my car wrecked on the tree just a few meters away, and the sound of sirens coming closer and closer.\n");
                gameMechanics.promptEnterKey();
                gameMechanics.slowPrint(30,"Blood is all over my hands. I can feel that the adrenaline rush is slowly ending and the pain gets greater and greater.\n");
                gameMechanics.promptEnterKey();
                gameMechanics.slowPrint(40,"But then I remember.\n");
                gameMechanics.pause(2000);
                gameMechanics.slowPrint(40,"\nI wasn't alone in the car...\n");
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
                gameMechanics.promptEnterKey();
                gameMechanics.slowPrint(30,"She's not here. What happened to her?\n");
                gameMechanics.promptEnterKey();
                gameMechanics.slowPrint(30,"I feel like I'm about to faint.\n");
                gameMechanics.promptEnterKey();
                gameMechanics.slowPrint(30,"With my last bit of strengh I try to call her name.\n");
                gameMechanics.promptEnterKey();
                gameMechanics.slowPrint(60,"Me:...\n");
                gameMechanics.promptEnterKey();
                gameMechanics.slowPrint(30,"But what was her name?\n");
                gameMechanics.promptEnterKey();
                gameMechanics.slowPrint(30,"Before I faint I realize something.\n");
                gameMechanics.promptEnterKey();
                gameMechanics.slowPrint(70,"I don't know her name.\n");
                gameMechanics.promptEnterKey();
                System.out.println("\n------------------------------------------------------------------\n");
                details.location("Hospital");
                gameMechanics.slowPrint(40,"\nI slowly regain consciousness.\n");
                gameMechanics.promptEnterKey();
                gameMechanics.slowPrint(30,"Doctor: Sir, can you hear me?\n");
                gameMechanics.promptEnterKey();
                gameMechanics.slowPrint(50,"Me: ...\n");
                gameMechanics.promptEnterKey();
                gameMechanics.slowPrint(30,"Doctor: Sir?\n");
                gameMechanics.promptEnterKey();
                gameMechanics.slowPrint(50,"Me: Yes, I can hear you doctor.\n");
                gameMechanics.promptEnterKey();
                gameMechanics.slowPrint(30,"Doctor: Sir, do you remember what happened?\n");
                gameMechanics.promptEnterKey();
                gameMechanics.slowPrint(50,"Me: Yes, I had a car accident.\n");
                gameMechanics.promptEnterKey();
                gameMechanics.slowPrint(50,"Me: How is my girlfriend? She was with me in the car.\n");
                gameMechanics.promptEnterKey();
                gameMechanics.slowPrint(30,"Doctor: ...?\n");
                gameMechanics.promptEnterKey();
                gameMechanics.slowPrint(50,"Me: Oh my God, is she...\n");
                gameMechanics.promptEnterKey();
                gameMechanics.slowPrint(30,"Doctor: Sir, what I'm about to say to you may be shocking.\n");
                gameMechanics.pause(2000);
                gameMechanics.slowPrint(30,"\nDoctor: Do you understand?\n");
                gameMechanics.promptEnterKey();
                gameMechanics.slowPrint(70,"Me: Yes.\n");
                gameMechanics.promptEnterKey();
                gameMechanics.slowPrint(70,"Me: I have schizophrenia, and my girlfriend isn't real.\n");
                gameMechanics.promptEnterKey();
                gameMechanics.slowPrint(30,"Doctor: I'm afraid that's right, sir.\n");
                gameMechanics.promptEnterKey();
                gameMechanics.slowPrint(50,"Me: This can't be happening.\n");
                gameMechanics.promptEnterKey();
                gameMechanics.slowPrint(30,"But after I say this it all comes together.\n");
                gameMechanics.promptEnterKey();
                gameMechanics.slowPrint(30,"How she never wanted to leave the house.\n");
                gameMechanics.promptEnterKey();
                gameMechanics.slowPrint(30,"How I couldn't remember her interactions with other people.\n");
                gameMechanics.promptEnterKey();
                gameMechanics.slowPrint(30,"How she always behaved in a weird manner when I was about to take my meds or go to the doctor.\n");
                gameMechanics.promptEnterKey();
                gameMechanics.slowPrint(50,"How I didn't know her name.\n");
                gameMechanics.promptEnterKey();
                gameMechanics.slowPrint(30,"Doctor: We will be prescribing you much stronger medications.\n");
                gameMechanics.promptEnterKey();
                gameMechanics.slowPrint(50,"Me: Yeah.\n");
                gameMechanics.promptEnterKey();
                gameMechanics.slowPrint(30,"Doctor: Don't worry, these medications have very promising results.\n");
                gameMechanics.promptEnterKey();
                gameMechanics.slowPrint(50,"Me: That's right, I can get through this, I can...\n");
                gameMechanics.promptEnterKey();
                gameMechanics.slowPrint(50,"While saying that I look towards the window and I see her.\n");
                gameMechanics.promptEnterKey();
                gameMechanics.slowPrint(30,"Girlfriend: Let's play a game, my sweetheart!\n");
                gameMechanics.promptEnterKey();  
            }     
        } else {
            gameMechanics.slowPrint(30,"\nMe: You know you didn't have to come with me.\n");
            gameMechanics.promptEnterKey();
            gameMechanics.slowPrint(30,"Me: I know you don't like to leave the house.\n");
            gameMechanics.promptEnterKey();
            gameMechanics.slowPrint(30,"Girlfriend: I wanted to accompany you.\n");
            gameMechanics.promptEnterKey();
            gameMechanics.slowPrint(30,"Girlfriend: Let's play a game!\n");
            gameMechanics.promptEnterKey();
            gameMechanics.slowPrint(30,"Girlfriend: What do you say for shiritori?\n");
            gameMechanics.promptEnterKey();
            System.out.println("1. Play shiritori.");
            System.out.println("2. Play rock paper scissors.");
            System.out.println("\n0. Exit the game");
            System.out.print("> ");
            gameMechanics.choice = gameMechanics.playerInput.nextInt();
            if (gameMechanics.choice == 0) {
                System.exit(0);
            }
            while ((gameMechanics.choice != 1) && (gameMechanics.choice != 2)) {
                System.out.println("\n" + gameMechanics.choice + " is not a valid option. Try again.\n");
                System.out.println("1. Play shiritori.");
                System.out.println("2. Play rock paper scissors.");
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
                    gameMechanics.slowPrint(30,"Me: Yeah, let's go for shirigori.\n");
                    gameMechanics.promptEnterKey();
                    gameMechanics.slowPrint(30,"Girlfriend: That's great. Let me start.\n");
                    gameMechanics.promptEnterKey();
                    gameMechanics.pause(2000);
                    gameMechanics.slowPrint(30,"\nGirlfriend: First word: fool.\n");
                    gameMechanics.pause(500);
                    gameMechanics.slowPrint(30,"\nGirlfriend: Your turn!\n");
                    nextWord = "fool";
                    shiritori.play(nextWord);
                    gameMechanics.slowPrint(30,"Me: Fool? That's an interesting one to start with.\n");
                    gameMechanics.promptEnterKey();
                    System.out.println("1. Label.");
                    System.out.println("2. Loud.");
                    System.out.println("\n0. Exit the game");
                    System.out.print("> ");
                    gameMechanics.choice = gameMechanics.playerInput.nextInt();
                    if (gameMechanics.choice == 0) {
                        System.exit(0);
                    }
                    while ((gameMechanics.choice != 1) && (gameMechanics.choice != 2)) {
                        System.out.println("\n" + gameMechanics.choice + " is not a valid option. Try again.\n");
                        System.out.println("1. Label.");
                        System.out.println("2. Loud.");
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
                            nextWord = "label";
                            shiritori.play(nextWord);
                            gameMechanics.slowPrint(30,"\nGirlfriend: Next one from me: loser\n");
                            gameMechanics.promptEnterKey();
                            gameMechanics.slowPrint(30,"Me: Ok, now you're trying to be mean for some reason.\n");
                            gameMechanics.promptEnterKey();
                            gameMechanics.slowPrint(50,"Girlfriend: :)\n");
                            gameMechanics.promptEnterKey();
                            gameMechanics.slowPrint(50,"Me: Why are you smiling like th...\n");
                            gameMechanics.promptEnterKey();
                            break;
                        
                        case 2:
                            nextWord = "loud";
                            shiritori.play(nextWord);
                            gameMechanics.slowPrint(30,"\nGirlfriend: Next one from me: dumbass\n");
                            gameMechanics.promptEnterKey();
                            gameMechanics.slowPrint(30,"Me: Ok, now you're trying to be mean for some reason.\n");
                            gameMechanics.promptEnterKey();
                            gameMechanics.slowPrint(50,"Girlfriend: :)\n");
                            gameMechanics.promptEnterKey();
                            gameMechanics.slowPrint(50,"Me: Why are you smiling like th...\n");
                            gameMechanics.promptEnterKey();
                            break;

                        default:
                            break;
                    }
                    break;
                case 2:
                    gameMechanics.slowPrint(30,"Me: I would rather go for rock paper scissors.\n");
                    gameMechanics.promptEnterKey();
                    gameMechanics.slowPrint(30,"Girlfriend: That's great too. Ready?\n");
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
                            gameMechanics.slowPrint(30,"Girlfriend: So naive, let's keep playing!\n");
                            gameMechanics.promptEnterKey();
                            gameMechanics.slowPrint(30,"Me: What do you mean naive?\n");
                            gameMechanics.promptEnterKey();
                            gameMechanics.slowPrint(50,"Girlfriend: :)\n");
                            gameMechanics.promptEnterKey();
                            gameMechanics.slowPrint(50,"Me: Why are you smiling like th...\n");
                            gameMechanics.promptEnterKey();
                            break;

                        case 2:
                            rps.RPS(2);
                            gameMechanics.promptEnterKey();
                            gameMechanics.slowPrint(30,"Girlfriend: So naive, let's keep playing!\n");
                            gameMechanics.promptEnterKey();
                            gameMechanics.slowPrint(30,"Me: What do you mean naive?\n");
                            gameMechanics.promptEnterKey();
                            gameMechanics.slowPrint(50,"Girlfriend: :)\n");
                            gameMechanics.promptEnterKey();
                            gameMechanics.slowPrint(50,"Me: Why are you smiling like th...\n");
                            gameMechanics.promptEnterKey();
                            break;

                        case 3:
                            rps.RPS(3);
                            gameMechanics.promptEnterKey();
                            gameMechanics.slowPrint(30,"Girlfriend: So naive, let's keep playing!\n");
                            gameMechanics.promptEnterKey();
                            gameMechanics.slowPrint(30,"Me: What do you mean naive?\n");
                            gameMechanics.promptEnterKey();
                            gameMechanics.slowPrint(50,"Girlfriend: :)\n");
                            gameMechanics.promptEnterKey();
                            gameMechanics.slowPrint(50,"Me: Why are you smiling like th...\n");
                            gameMechanics.promptEnterKey();
                            break;
                            
                        default:
                            break;
                    }
                default:
                    break;
            }
            gameMechanics.slowPrint(30,"Before I have time to look back on the road I subconsciously move the steering wheel to avoid the deer that was on the road.\n");
            gameMechanics.promptEnterKey();
            gameMechanics.slowPrint(200,"\n...\n");
            gameMechanics.slowPrint(30,"\nI find myself outside of the crashed car, my car wrecked on the tree just a few meters away, and the sound of sirens coming closer and closer.\n");
            gameMechanics.promptEnterKey();
            gameMechanics.slowPrint(30,"Blood is all over my hands. I can feel that the adrenaline rush is slowly ending and the pain gets greater and greater.\n");
            gameMechanics.promptEnterKey();
            gameMechanics.slowPrint(40,"But then I remember.\n");
            gameMechanics.pause(2000);
            gameMechanics.slowPrint(40,"\nI wasn't alone in the car...\n");
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
            gameMechanics.promptEnterKey();
            gameMechanics.slowPrint(30,"Me: Oh, there you are, you scared me.\n");
            gameMechanics.promptEnterKey();
            gameMechanics.slowPrint(30,"Me: Are you ok?\n");
            gameMechanics.promptEnterKey();
            gameMechanics.slowPrint(30,"Girlfriend: I think so.\n");
            gameMechanics.promptEnterKey();
            gameMechanics.slowPrint(30,"Me: Thank God.\n");
            gameMechanics.promptEnterKey();
            gameMechanics.slowPrint(30,"Me: We should wait for the ambulance.\n");
            gameMechanics.promptEnterKey();
            gameMechanics.slowPrint(30,"Girlfriend: I guess that would be it for the doctor appointment today.\n");
            gameMechanics.promptEnterKey();
            gameMechanics.slowPrint(30,"Me: I think we'll manage to meet him if we'll be taken by the ambulance.\n");
            gameMechanics.promptEnterKey();
            gameMechanics.slowPrint(30,"Girlfriend: Oh no.\n");
            gameMechanics.promptEnterKey();
            gameMechanics.slowPrint(30,"Me: What? What's wrong?\n");
            gameMechanics.promptEnterKey();
            gameMechanics.slowPrint(30,"Girlfriend: What if we get in trouble for what happened?\n");
            gameMechanics.promptEnterKey();
            gameMechanics.slowPrint(30,"Me: We shouldn't, it was just an accident.\n");
            gameMechanics.promptEnterKey();
            gameMechanics.slowPrint(40,"Accident? - I think to myself.\n");
            gameMechanics.promptEnterKey();
            gameMechanics.slowPrint(50,"Girlfriend: We shouldn't risk it. I'm so scared. I don't want to face these people.\n");
            gameMechanics.promptEnterKey();
            gameMechanics.slowPrint(30,"Me: Hey, it's all good, I got this.\n");
            gameMechanics.promptEnterKey();
            gameMechanics.slowPrint(70,"Girlfriend: No!\n");
            gameMechanics.promptEnterKey();
            gameMechanics.slowPrint(30,"Me: Where are you going? We can't just run away like that.\n");
            gameMechanics.promptEnterKey();
            gameMechanics.slowPrint(70,"Girlfriend: ...\n");
            gameMechanics.promptEnterKey();
            gameMechanics.slowPrint(30,"Dammit, fine - I think to myself and start chasing her.\n");
            gameMechanics.promptEnterKey();
            gameMechanics.slowPrint(30,"For a second I want to call her and say to slow down.\n");
            gameMechanics.promptEnterKey();
            gameMechanics.slowPrint(30,"But I can't.\n");
            gameMechanics.promptEnterKey();
            gameMechanics.slowPrint(30,"I can't recall her name.\n");
            gameMechanics.promptEnterKey();
            gameMechanics.slowPrint(30,"Girlfriend: C'mon, let's go!\n");
            gameMechanics.promptEnterKey();
            gameMechanics.slowPrint(30,"Me: Yeah, I'm going!\n");
            gameMechanics.promptEnterKey();
        }
        gameMechanics.slowPrint(50,"Congratulations " + gameMechanics.displayPlayerName() + "!\n");
        gameMechanics.promptEnterKey();
        gameMechanics.slowPrint(50,"You have finished a game!\n");
        gameMechanics.promptEnterKey();
        gameMechanics.slowPrint(50,"Hope you enjoyed it!\n");
        gameMechanics.promptEnterKey();
        gameMechanics.slowPrint(30,"And yes, your name was taken at the beginning just for this message at the end.\n");
        gameMechanics.promptEnterKey();
        gameMechanics.slowPrint(30,"Thank you!\n");
        gameMechanics.promptEnterKey();
    }    
}   
