import java.util.Arrays;
import java.util.Scanner;

final class Shiritori {
	String[] wordsSaid = new String[0];
	boolean gameOver = false;
	boolean quitGame = false;
	
	boolean quit () {
		quitGame = true;
		return quitGame;
	}
	
	public String[] newWord(String newWord) {  
	    String[] newWordsSaid = new String[wordsSaid.length+1];  
	    for(int i=0;i<wordsSaid.length;i++)
	    {  
	    	newWordsSaid[i] = wordsSaid[i];  
	    }
	    newWordsSaid[wordsSaid.length] = newWord;
	    return newWordsSaid;  
	}  
	
	public String[] play(String newWord) {
		
		
		if(wordsSaid.length == 0) {
			wordsSaid = newWord(newWord);
			} else if(wordsSaid.length > 0){
				String lastWord = wordsSaid[wordsSaid.length - 1];
				char lastChar = lastWord.charAt(lastWord.length() - 1);
				char firstChar = newWord.charAt(0);
				
				if (lastChar == firstChar && Arrays.asList(wordsSaid).contains(newWord) == false) {
						wordsSaid = newWord(newWord);
					} else if(lastChar != firstChar || Arrays.asList(wordsSaid).contains(newWord)) {
						gameOver = true;
						System.out.println("Game over!");
						if(lastChar != firstChar) {
							System.out.println(newWord + " does not start with '"+ lastChar + "''.");
						}
						if(Arrays.asList(wordsSaid).contains(newWord)) {
							System.out.println(newWord + " has already been used.");
						}
					}
				}
	return wordsSaid;
	}
	
	public void restart() {
		this.wordsSaid = new String[0];
		this.gameOver = false ;
		System.out.println("Game restarted.");
	}
		
	public void printWords() {
		for(int i = 0; i < wordsSaid.length; i++) {
				System.out.println(wordsSaid[i]);
			}
	}
}

public class task2 {

	public static void main(String[] args) {
		Shiritori shiritori = new Shiritori();
		try (Scanner gameInput = new Scanner(System.in)) {
            while(!shiritori.quitGame) {
            	System.out.println("Please, enter your command (play, restart, printWords, quit): ");
            	String command = gameInput.nextLine();
            	if (command.equals("play")) {
            		System.out.println("Now please, enter your word: ");
            		String nextWord = gameInput.nextLine();
            		shiritori.play(nextWord);
            	}
            	if (command.equals("restart")) {
            		shiritori.restart();
            	}
            	if (command.equals("printWords")) {
            		shiritori.printWords();
            	}
            	if (command.equals("quit")) {
            		shiritori.quit();
            	}
            }
        }
	}
}
