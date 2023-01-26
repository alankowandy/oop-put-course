package GameClasses;

import java.util.Scanner;

public final class GameMechanics {
    public Scanner playerInput = new Scanner(System.in);
	Scanner enter = new Scanner(System.in);
    public String playerName;
    public int choice;
    public static int choiceVariable = 6;
    
    public void promptEnterKey() {
        System.out.print("->");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
    }

    public void slowPrint(int time, String text) throws InterruptedException {
        char[] chars = text.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            System.out.print(chars[i]);
            Thread.sleep(time);
        }
    }

    public void pause(int time) throws InterruptedException {
            Thread.sleep(time);
    }

    public int addChoiceVariable() {
        choiceVariable++;
        return 0;
    }

    public int addDoubleChoiceVariable() {
        choiceVariable += 2;
        return 0;
    }
    
    public int substractChoiceVariable() throws Exception {
        choiceVariable--;
        if (choiceVariable < 0) {
            throw new Exception("Choice variable shouldn't be negative. Something went wrong.");
        }
        return 0;
    }
}
