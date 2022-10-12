package sambungkata;

import java.util.Arrays;
/**
 * Main Program for sambungkata game
 */
import java.util.Scanner;  // Import the Scanner class

/**
 * @author MuhamadArifAdiputra
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Silakan coba jalankan program ini terlebih dahulu untuk memastikan sudah bisa run dengan baik ya
		System.out.println("Sambung Kata");
		
		boolean stillWantToPlay = true;
		while (stillWantToPlay) {
			boolean isAnswerCorrect = true;
			boolean isFirstWord = true;
			String[] vowelLetters = {"a", "i", "u", "e", "o"};
			String lastSubWord = "";
			String userHelperWord;
			int wordContinuityCheckPos = 0;
			int[] score = {0,0};
			int player = 0;
				
			while (isAnswerCorrect) {
				// Get user input for the word
			    Scanner rawInput = new Scanner(System.in);  // Create a Scanner object
			    System.out.print("Player "+ (player+1)+" :");
			    String currentWordInput = rawInput.nextLine();  // Read user input
			    
			    // check the answer correct or not
			    if (!isFirstWord) {
			    	//word checking
			    	// return 0 if correct and on last subword, otherwise return other number
			    	
			    	wordContinuityCheckPos = (((currentWordInput.indexOf(lastSubWord))));
//				    System.out.println("wordContinuityCheckPos: " + wordContinuityCheckPos);

			    	if (wordContinuityCheckPos!=0) {
			    		System.out.println("TET! Kata tidak sesuai!");
			    		isAnswerCorrect = false;
			    		break;
			    	}
			    	score[player] += 1;
			    	// correct answer flow
			    }
			    else 
			    //first word
			    {
			    	isFirstWord = false;
			    }
			    
			    //get last subWord (note: subword is a section of word that begin with consonant and have vowel next to it)
			    //to make it harder we only accept word that only has vowel at the end of the words (still not used now)
			    //e.g. Toko (-ko), payung (-yung), etc.
			    currentWordInput = currentWordInput.toLowerCase();
		    	int startWordPos = currentWordInput.length()-1;
		    	boolean vowelFound = false;
		    	boolean isCharVowel = false;
			    for (int i = (currentWordInput.length()-1); i != -1; i--) {
			    	
			    	//System.out.println("|| Current Char: " + currentWordInput.charAt(i));
			    	
			    	isCharVowel = (Arrays.asList(vowelLetters).contains(String.valueOf(currentWordInput.charAt(i))));
			    	//System.out.println(String.valueOf(isCharVowel));
			    	if (vowelFound && (!isCharVowel)) {
			    		//System.out.println("|| Here");
	
			    		startWordPos = i;
			    		break;
			    	}
			    	else if (isCharVowel) {
			    		vowelFound = true;
			    	}
			    }
			    //System.out.println(String.valueOf(startWordPos) + ";" + String.valueOf(currentWordInput.length()-1));
	    		lastSubWord = currentWordInput.substring(startWordPos,currentWordInput.length());
			    System.out.println("kata sambung: " + lastSubWord);
			    
			    if(player == 0) {
			    	player += 1;
			    }else {
			    	player -= 1;
			    }
	
			}
		
		
			// Get user input for replay
			System.out.println("Score");
			System.out.println("Player 1 : " + score[0]);
			System.out.println("Player 2 : " + score[1]);
			String selamat = "Pemenangnya adalah Player ";
			if(score[0]>score[1]) {
				System.out.println(selamat + "1");
			}else {
				System.out.println(selamat + "2");
			}
		    Scanner rawInput = new Scanner(System.in);  // Create a Scanner object
		    System.out.print("Main lagi? (Y/N) : ");
		    String userInput = rawInput.nextLine();  // Read user input
		    
		    
		    // If user input N, then exit
		    if (userInput.equals("N")) {
		    	System.out.println("Bye!");
		    	stillWantToPlay = false;
		    }
			
		}
		
	}

}