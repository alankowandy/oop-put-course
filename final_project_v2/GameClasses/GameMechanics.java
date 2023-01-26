package GameClasses;

import java.util.Scanner;

public final class GameMechanics {
    public static Scanner playerInput = new Scanner(System.in);
	static Scanner enter = new Scanner(System.in);
    public static String playerName;
    public static int choice;
    public static int choiceVariable = 5;
    public static boolean quitGame = false;
    
    public static boolean quit() {
		quitGame = true;
		return quitGame;
	}
    
    public static void promptEnterKey() {
        System.out.print("->");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
    }

    public static void slowPrint(int time, String text) throws InterruptedException {
        char[] chars = text.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            System.out.print(chars[i]);
            Thread.sleep(time);
        }
    }

    public static void pause(int time) throws InterruptedException {
            Thread.sleep(time);
    }
    
    public static void main(String[] args) throws InterruptedException {
        while (!quitGame) {
            GameClasses.Branches.StartingScreen.firstMessage();
            GameClasses.Branches.FirstUnknown.firstUnknownInit();
            GameClasses.Branches.Carwash.carwashInit(); 
        }
        
    }
}
