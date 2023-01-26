package GameClasses.MiniGames;

import java.util.Scanner;

public class RockPaperSscissors {

  public int RPS(int userChoice) {
    return 0;
  }
  public static void main(String[] args) {
    Scanner playerInput = new Scanner(System.in);
    int userChoice, computerChoice;

    System.out.println("Rock-Paper-Scissors Game\n");
    System.out.println("1. Rock");
    System.out.println("2. Paper");
    System.out.println("3. Scissors");

    System.out.print("\nEnter your choice: ");
    userChoice = playerInput.nextInt();

    computerChoice = (int)(Math.random() * 3) + 1;

    if (userChoice == computerChoice) {
      System.out.println("It's a tie!");
    } else if (userChoice == 1 && computerChoice == 3) {
      System.out.println("You win! Rock beats Scissors.");
    } else if (userChoice == 2 && computerChoice == 1) {
      System.out.println("You win! Paper beats Rock.");
    } else if (userChoice == 3 && computerChoice == 2) {
      System.out.println("You win! Scissors beats Paper.");
    } else {
      System.out.println("You lose!");
    }
  }
}
