package Core;

import java.util.Scanner;

public class Game {
    public static Scanner plrinput = new Scanner(System.in);
	static Scanner enter = new Scanner(System.in);
    static String player_name;
    public static int choice;
    
    public static void promptEnterKey() {
        System.out.print("->");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
    }

    public static void SlowPrint(int time, String text) throws InterruptedException {
        // Get message, convert to char array
        char[] chars = text.toCharArray();

        // Print a char from the array, then sleep for x second
        for (int i = 0; i < chars.length; i++) {
            System.out.print(chars[i]);
            Thread.sleep(time);
        }
        // Repeat for all chars
    }
    
    public static void main(String[] args) throws InterruptedException {
        StartingScreen title_screen = new StartingScreen();
        title_screen.first_screen();
        Branches.ep1.Carwash.first();
    }
}
