/**
 * 
 */
package sambungkata;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author ichsanulamal
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {
		// Silakan coba jalankan program ini terlebih dahulu untuk memastikan sudah bisa run dengan baik ya
		System.out.println("Halo Peserta DevCamp Tokopedia Academy 2022!");
		
		// System.out.println("Selamat program nya sudah berjalan! Silakan eksplor ya!");

		InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.println("~~~ WELCOME TO SAMBUNG KATA GAME ~~~");

        System.out.println("Masukkan kata pertama: ");
        String firstWord = br.readLine();
        String secondWord = "";

        
        
        while (!secondWord.equals("STOP")) {
            System.out.println("Kata selanjutnya lanjutan dari '" + firstWord + "':");
            secondWord = br.readLine();

            if (sambungKata(firstWord, secondWord)) {
                System.out.println("~ JAWABAN BENAR"); 
            } else {
                System.out.println("~ JAWABAN SALAH"); 
            }
            
            firstWord = secondWord;
        }

	}

	public static boolean sambungKata(String firstWord, String secondWord) {
        String subWord;
        if (isVowel(firstWord.charAt(firstWord.length() - 2))) {
            subWord = firstWord.substring(firstWord.length()-3, firstWord.length());
        } else {
            subWord = firstWord.substring(firstWord.length()-2, firstWord.length());
        }

        return secondWord.substring(0, subWord.length()).toLowerCase().equals(subWord.toLowerCase());
    }

    public static boolean isVowel(final char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }

}
