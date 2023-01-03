package core;

import java.util.Scanner;

import branches.branches;

public class game {
    public static Scanner choiceScanner = new Scanner(System.in);
	static Scanner enterScanner = new Scanner(System.in);
    static String player_name;
    public static int choice;

    public static void firstpromptEnterKey(){
        System.out.print("\nPress \"ENTER\" to continue when you see the arrow: ->");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
     }
    
    public static void promptEnterKey(){
        System.out.print("->");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
     }
    
    public static void main(String[] args) {
        title_screen title_screen = new title_screen();
        title_screen.first_screen();
        branches.starting_screen();
    }
}
