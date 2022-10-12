/**
 * 
 */
package sambungkata;

import java.util.Scanner;

/**
 * @author MuhamadArifAdiputra, RonaldGrant
 *
 */
public class Main {

	private static Scanner sc;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Silakan coba jalankan program ini terlebih dahulu untuk memastikan sudah bisa run dengan baik ya
		System.out.println("Halo Peserta DevCamp Tokopedia Academy 2022!");
		System.out.println("Selamat program nya sudah berjalan! Silakan eksplor ya!\n");
		
		playGame();
	}
	
	public static void playGame() {
		sc = new Scanner(System.in);
		
		System.out.print("Masukkan Kata Pertama\t: ");  
		String firstWord = sc.nextLine();
		
		System.out.print("Masukkan Kata Kedua\t: ");  
		String secondWord = sc.nextLine();
		
		while (true) {
			while (testWords(firstWord, secondWord)) {
				firstWord = secondWord;
				
				System.out.print("Masukkan Kata Berikutnya\t: ");  
				secondWord = sc.nextLine();
			}
			
			System.out.println("Ingin Bermain Lagi? (Y\\N)");  
			String confirmationFlag = sc.nextLine();
			
			if (confirmationFlag.equalsIgnoreCase("N")) break;
		}
		
		System.out.print("== Game Over ==");  
	}
	
	public static boolean testWords(String firstWord, String secondWord) {
		int firstFlagInt = 0;
		for(int i = firstWord.length() - 2; i > 0; i--) {
			boolean flagVowel = firstWord.charAt(i) == 'a' || firstWord.charAt(i) == 'e' || firstWord.charAt(i) == 'i' || firstWord.charAt(i) == 'o' || firstWord.charAt(i) == 'u';
			if(!flagVowel) {
				firstFlagInt = i;
				break;
			}
		}
		
		int secondFlagInt = 0;
		
		System.out.println("Kata yang Dipotong\t: " + secondWord.substring(0, firstWord.length() - firstFlagInt) + "\n");
		
		// own logic for second words
//		for(int i = 1; i < secondWord.length() - 1; i++) {
//			System.out.print(secondWord.charAt(i));  
//			boolean flagVowel = secondWord.charAt(i) == 'a' || secondWord.charAt(i) == 'e' || secondWord.charAt(i) == 'i' || secondWord.charAt(i) == 'o' || secondWord.charAt(i) == 'u';
//			if(!flagVowel) {
//				secondFlagInt = i + 1;
//				break;
//			}
//		}
		
		return firstWord.substring(firstFlagInt, firstWord.length()).equalsIgnoreCase(secondWord.substring(0, firstWord.length() - firstFlagInt));
	}

}
