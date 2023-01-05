package core;

import java.util.Scanner;

public class game {
    public static Scanner plrinput = new Scanner(System.in);
	static Scanner enter = new Scanner(System.in);
    static String player_name;
    public static int choice;
    
    public static void promptEnterKey(){
        System.out.print("->");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
     }
    
    public static void main(String[] args) {
        title_screen title_screen = new title_screen();
        title_screen.first_screen();
        Branches.ep1.carwash.first();
    }
}
