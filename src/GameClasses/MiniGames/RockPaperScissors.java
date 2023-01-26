package GameClasses.MiniGames;

public final class RockPaperScissors {

  public int RPS(int userChoice) {
    int computerChoice = (int)(Math.random() * 3) + 1;

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
    return computerChoice;
  }
}
