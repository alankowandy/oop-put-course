package GameClasses.MiniGames;

import java.util.Arrays;

public final class Shiritori {
	private String[] wordsSaid = new String[0];
	public boolean gameOver = false;
	private boolean quitGame = false;
	
	boolean quit () {
		quitGame = true;
		return quitGame;
	}

    public String[] newWord(String newWord) {  
	    String[] newWordsSaid = new String[wordsSaid.length + 1];  
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
			} else if(wordsSaid.length > 0) {
				String lastWord = wordsSaid[wordsSaid.length - 1];
				char lastChar = lastWord.charAt(lastWord.length() - 1);
				char firstChar = newWord.charAt(0);
				
				if (lastChar == firstChar && Arrays.asList(wordsSaid).contains(newWord) == false) {
						wordsSaid = newWord(newWord);
				} else if(lastChar != firstChar || Arrays.asList(wordsSaid).contains(newWord)) {
					gameOver = true;
					System.out.println("Girlfriend: Ha! Game over! I won!");
					if(lastChar != firstChar) {
						System.out.println("Girlfriend: " + newWord + " does not start with '"+ lastChar + "'");
					}
					if(Arrays.asList(wordsSaid).contains(newWord)) {
						System.out.println("Girlfriend: " + newWord + " has already been used doofus.");
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
		System.out.println("\n");
	}
}

